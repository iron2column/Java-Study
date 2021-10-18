package _1_File类._2_目录实用工具;

import net.mindview.util.PPrint;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-10-15 12:28
 */

public final class Directory {

    /**
     * （根）local
     * @param dir {@link File}目标目录
     * @param regex 正则表达式
     * @return File[] - '参数dir'下的符合'参数regex'的File数组。表示目录或文件
     */
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    /**
     * 调用（根）local
     * @param path  目标目录的路径，由此方法提供生成File对象
     * @param regex 正则表达式
     * @return File[] - '参数dir'下的符合'参数regex'的File数组。表示目录或文件
     */
    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    /**
     * 静态内部类 <br/>
     * 实现可迭代接口{@link Iterable}<br/>
     * 用于存储文件类型File列表和目录类型File列表
     */
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        /**
         * 文件类型的File列表集合的迭代器
         * @return {@link Iterator<File>}
         */
        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        /**
         * 用于追加其他静态内部类中的files和dirs
         * @param other {@link TreeInfo}
         */
        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override
        public String toString() {
            //PPrint
            return "dirs: " + PPrint.pformat(dirs) +
                    "\n\nfiles: " + PPrint.pformat(files);
        }
    }

    //------------------------------------------

    /**
     * 遍历目标目录下File对象进行分类添加
     * @param starDir 目标目录的File对象
     * @param regex 期待的目标的正则表达式
     * @return - {@link TreeInfo}一个内部实现的迭代器类，可以进行输出
     */
    static TreeInfo recurseDirs(File starDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : starDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else {
                if (item.getName().matches(regex)) {
                    result.files.add(item);
                }
            }
        }
        return result;
    }

    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }
    //------------------------------------------

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(walk("/Users/ironcolumn/Downloads/企业微信File"));
        } else {
            for (String arg : args) {
                System.out.println(walk(arg));
            }
        }
    }

}

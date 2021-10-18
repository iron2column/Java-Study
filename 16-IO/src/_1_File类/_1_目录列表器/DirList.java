package _1_File类._1_目录列表器;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author ChenMingYang
 * @Date 2021-09-16 20:28
 */
class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
/**
 * 演示使用两种方式获取File对象：
 * <li>1.无参数的list()方式</li>
 * <li>2.使用实现接口的目录过滤器list( ? impl {@link FilenameFilter})方式</li>
 * 值得注意的是，通过list(...)获取的只能是当前顶层所在目录的内容（指包括目录和文件），不会递归获取子内容
 */
public class DirList {
    public static void main(String[] args) {
        //'.'代表的是项目文件夹内一级
        //获取后会递归搜集子项为File对象
        File path = new File("./");
        String[] list;
        //通过控制台输入参数的方式选择使用何种方式获取File对象集
        if (args.length == 0) {
            //在无参数的情况下，使用方式1
            list = path.list();
        }else{
            //在有参数的情况下，使用方式2
            //  DirFilter需要实现特定接口FilenameFilter
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}



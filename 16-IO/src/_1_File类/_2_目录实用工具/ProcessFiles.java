package _1_File类._2_目录实用工具;

import java.io.File;
import java.io.IOException;

/**
 * @author  ChenMingYang
 * @date  2021-10-18 12:41
 */
public class ProcessFiles {
    public interface Strategy {
        void process(File file);
    }

    private Strategy strategy;
    /**
     * 文件后缀的意思
     */
    private String ext;

    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    /**
     * 中间工具方法-处理目录树<br>
     * 将传入的File对象使用{@link Directory}的walk函数进行目录树收集<br>
     * 然后进行遍历，使用{@link ProcessFiles.Strategy}进行处理<br>
     * @param root
     * @throws IOException
     */
    public void processDirectoryTree(File root) throws IOException {
        for (File file : Directory.walk(root.getAbsolutePath(), ".*\\." + ext)) {
            strategy.process(file.getCanonicalFile());
        }
    }

    /**
     * 本类的主要功能
     * @param args
     */
    public void start(String[] args) {
        try {
            if (args.length == 0) {//没有参数指定
                //直接进行'.'目录下的处理，处理目录树
                processDirectoryTree(new File("."));
            } else {
                for (String arg : args) {
                    File fileArg = new File(arg);
                    if (fileArg.isDirectory()) {
                        processDirectoryTree(fileArg);
                    } else {
                        if (!arg.endsWith("." + ext)) {
                            arg += "." + ext;
                        }
                        strategy.process(new File(arg).getCanonicalFile());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //=================//
    public static void main(String[] args) {
        Strategy strategy = new Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        };

        new ProcessFiles(strategy, "java").start(args);

    }
}

package _4_终结任务._3_中断;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ChenMingYang
 * @date 2021-12-18 20:15
 */
public class CloseResource {
    public static void main(String[] args) throws IOException {

        ExecutorService exec = Executors.newCachedThreadPool();

        ServerSocket server = new ServerSocket(8000);

        InputStream socketInput = new Socket("localhost", 8000).getInputStream();



    }
}

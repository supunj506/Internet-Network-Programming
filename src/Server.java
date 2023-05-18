/*
 * @author : @MJ
 * Date    : 5/18/2023
 * Time    : 1:21 PM
 * Project : INP
 * Created by IntelliJ IDEA.
 */

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket=new ServerSocket(3000);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

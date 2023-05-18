/*
 * @author : @MJ
 * Date    : 5/18/2023
 * Time    : 1:21 PM
 * Project : INP
 * Created by IntelliJ IDEA.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket=new ServerSocket(3001);
            Socket accept = serverSocket.accept();
            DataInputStream dataInputStream=new DataInputStream(accept.getInputStream());
            String request = dataInputStream.readUTF();
            System.out.println(request);




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

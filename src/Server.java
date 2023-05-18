/*
 * @author : @MJ
 * Date    : 5/18/2023
 * Time    : 1:21 PM
 * Project : INP
 * Created by IntelliJ IDEA.
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(3050);
            Socket accept = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(accept.getInputStream());
            DataOutputStream dataOutputStream=new DataOutputStream(accept.getOutputStream());
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

            String income = "";
            String outgoing = "";

            while (!income.equals("no")) {
                income = dataInputStream.readUTF();
                System.out.println(income);
                outgoing = bufferedReader.readLine();
                dataOutputStream.writeUTF(outgoing);
                dataOutputStream.flush();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

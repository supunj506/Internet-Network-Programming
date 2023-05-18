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
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("Localhost",3000);
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("This is Client  Request");
            dataOutputStream.flush();

//            catch the server massage
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            System.out.println(dataInputStream.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

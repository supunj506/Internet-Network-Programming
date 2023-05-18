/*
 * @author : @MJ
 * Date    : 5/18/2023
 * Time    : 1:21 PM
 * Project : INP
 * Created by IntelliJ IDEA.
 */

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("Localhost",3050);
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String massage="";
            String outgoing = "";
            while (!massage.equals("no")){
                outgoing=bufferedReader.readLine();
                dataOutputStream.writeUTF(outgoing);
                massage = dataInputStream.readUTF();
                System.out.println(massage);
                dataOutputStream.flush();

            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

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
            Socket socket=new Socket("Localhost",3001);
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String massage="";
            while (!massage.equals("no")){
                massage=bufferedReader.readLine();
                dataOutputStream.writeUTF(massage);
                dataOutputStream.flush();
            }
            dataOutputStream.writeUTF(massage);
            dataOutputStream.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.hspdu.api.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hellp server".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bus = new byte[1024];
        int readln = 0;
        while ((readln = inputStream.read(bus))!= -1){
            System.out.println(new String(bus,0,readln));
        }

inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");


    }
}

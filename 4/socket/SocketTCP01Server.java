package com.hspdu.api.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] buy = new byte[1024];
        int readlen = 0;
        while ((readlen = inputStream.read(buy))!=-1){
            System.out.println(new String(buy,0,readlen));

        }
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}

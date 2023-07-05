package com.hspdu.api.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework03Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileName = " ";
        while( (len = inputStream.read(b))!= -1){
            downLoadFileName += new String(b,0,len);
        }
        System.out.println("下载的文件名" +downLoadFileName);
        String resFileName = " ";
        if ("高山流水".equals(downLoadFileName)){
            resFileName = "src\\高山流水.mp3";
        }else {
            resFileName = "src\\无名.mp3";
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFileName));
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput();
        bufferedInputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}

package com.hspdu.api.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "e:\\bb.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
        inputStream.close();
        bos.close();
        socket.close();


    }
}

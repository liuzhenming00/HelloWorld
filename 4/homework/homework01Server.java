package com.hspdu.api.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        String answer =" ";
        if ("name".equals(s)){
            answer = "我是韩顺平";
        }else if ("hobby".equals(s)){
            answer = "编写java程序";
        }else {
            answer = "你说的啥子";
        }

        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
        accept.close();
        serverSocket.close();

    }
}

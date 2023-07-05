package com.hspdu.api.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class homework02SendB {
    public static void main(String[] args) throws IOException {
        DatagramSocket Socket = new DatagramSocket(9998);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();
        byte[] date = question.getBytes();

        DatagramPacket packet = new DatagramPacket(date, date.length, InetAddress.getLocalHost(), 8888);
        Socket.send(packet);
        byte[] bytes = new byte[1024];
        packet = new DatagramPacket(bytes, bytes.length);
        Socket.receive(packet);
        int length = packet.getLength();
        bytes = packet.getData();
        String s = new String(bytes,0 ,length);
        System.out.println(s);
        Socket.close();
        System.out.println("B端退出");

    }
}

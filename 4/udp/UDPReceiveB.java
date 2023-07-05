package com.hspdu.api.udp;

import com.sun.xml.internal.ws.api.message.Packet;

import java.io.IOException;
import java.net.*;

public class UDPReceiveB {
    public static void main(String[] args) throws IOException {
        DatagramSocket Socket = new DatagramSocket(9998);
        byte[] date = "hello 明天吃火锅".getBytes();
        DatagramPacket packet = new DatagramPacket(date, date.length, InetAddress.getLocalHost(), 9999);
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

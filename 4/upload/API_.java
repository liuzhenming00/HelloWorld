package com.hspdu.api.upload;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress name = InetAddress.getByName("DESKTOP-DA8L7GC");
        System.out.println(name);
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);
        String address = byName.getHostAddress();
        System.out.println(address);
        String name1 = byName.getHostName();
        System.out.println(name1);
    }
}

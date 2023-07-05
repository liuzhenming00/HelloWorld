package com.hspdu.outputstream_;

import java.io.*;

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception{
        String filePath = "e:\\data.dat";
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream(filePath));
        oop.writeInt(100);
        oop.writeBoolean(true);
        oop.writeChar('a');
        oop.writeDouble(9.5);
        oop.writeUTF("韩顺平教育");
        oop.writeObject(new Dog("旺财",10));
        oop.close();

    }
}

package com.hspdu.inputstream;

import com.hspdu.outputstream_.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\data.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        Object dog = objectInputStream.readObject();
        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());
objectInputStream.close();

    }
}

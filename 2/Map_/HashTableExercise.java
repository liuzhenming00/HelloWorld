package com.Map_;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
       // hashtable.put(null,100);
       // hashtable.put("john",null);
        hashtable.put("lucy",100);
        hashtable.put("lic",100);
        hashtable.put("lic",80);
        System.out.println(hashtable);

    }
}

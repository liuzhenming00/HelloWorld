package com.stringbuffer;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello tom";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        String s = stringBuffer2.toString();
        String s1 = new String(stringBuffer2);
    }
}

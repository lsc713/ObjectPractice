package com.service.javamid.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int i = str.indexOf(ext);
        String filename = str.substring(0,i);
        String extname = str.substring(i,str.length());
        System.out.println(filename);
        System.out.println(extname);


    }

}

// This program apply MD5 on given string

import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.nio.charset.Charset;

public class Solution {

    public static void main(String[] args) {
       
        String str = "HelloWorld";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
               
            md.update(str.getBytes());
            byte[] hashText = md.digest();
 
            for (byte result : hashText) {
                System.out.printf("%02x", result);
            }
        } catch (Exception e) {}
    }
}

import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.nio.charset.Charset;


public class Solution {

    public static void main(String[] args) {
        String str = "HelloWorld";
        
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(str.getBytes());
            byte[] hashText = sha256.digest();
            
            for (byte result : hashText) {
                System.out.printf("%02x", result);
            }
            } catch (Exception e) {}
        }
}

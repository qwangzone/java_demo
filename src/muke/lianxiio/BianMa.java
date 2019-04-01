package muke.lianxiio;

import java.io.UnsupportedEncodingException;

public class BianMa {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "abcdef";
        char[] chars = a.toCharArray();
        for (char v:chars){
            System.out.print(v+",");
        }
        byte[] bt1 = a.getBytes("gbk");
        for (byte v:bt1){
            System.out.print(Integer.toHexString(v & 0xff)+' ');
        }
        System.out.println();
        for (byte v:bt1){
            System.out.print(v+' ');
        }

        String a1 = new String(bt1);
    }
}

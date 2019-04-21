package muke.simple_lx;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.PublicKey;
import java.util.Properties;

public class StaticleiDemo {
    public static Properties pro;
    public static String a = "1";
    public String ll;

    static {

        System.out.println("我开始加载了");
        pro = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("test.properties");
        try {
            pro.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

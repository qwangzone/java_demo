package muke.simple_lx;

import net.bytebuddy.implementation.FieldAccessor;

import java.io.*;
import java.util.Properties;

public class PropertyDemo {
    /*查看变量类型方法*/
    public static String getType(Object o){
        return o.getClass().toString();
    }
    public static void main(String[] args) throws IOException {
        /*读取配置文件操作*/
        Properties env = new Properties();
        int i = 1;
        File f = new File("src/resources/test.properties");
        if (f.exists()){
            //字节流加载方式
            env.load(new FileInputStream(f));
            //ClassLoader方式
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("test.properties");
            //env.load(inputStream);
            String name = env.getProperty("name");
            //兼容读取中文
            String result=new String(name.getBytes("ISO-8859-1"), "utf-8");
            System.out.println(result);
            System.out.println(env.getProperty("age"));
            System.out.println(getType(i));
        }else{
            f.mkdir();
        }

    }
}

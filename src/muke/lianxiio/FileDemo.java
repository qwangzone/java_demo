package muke.lianxiio;

import java.io.File;

public class FileDemo {
    //java 的toString方法，当直接打印对象时，会掉用toString方法
    @Override
    public String toString() {
        return "wq";
    }

    /**
     * @author qiwang
     *
     */

    public static void main(String[] args){
        //mac的目录可以直接使用，windows下目录需要用反斜杠转义E:\\java\\myfile
        String path = "Users/my_java/java_demo/src/muke/testwq".replace('/','\\');

        //不带目录的情况下，直接在项目的根目录创建text.txt文件夹
        //File file = new File("text.txt");
        //带目录的情况是直接在指定位置创建testwq文件夹
       // File file1 = new File("/Users/my_java/java_demo/src/muke/teswq");

        //带目录的情况的另一种写法
        File file1 = new File("/Users/my_java/java_demo/src/muke","testwq");
        if (!file1.exists()){
            //创建文件夹
            file1.mkdir();

        }
        else{
            //删除文件夹
            file1.delete();
        }
        System.out.println(file1.exists());

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());

    }
}

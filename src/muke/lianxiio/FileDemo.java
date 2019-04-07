package muke.lianxiio;

import java.io.File;
import java.io.IOException;

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

    public static void main(String[] args) throws IOException {
        //mac的目录可以直接使用，windows下目录需要用反斜杠转义E:\\java\\myfile
        String path = "Users/my_java/java_demo/src/muke/testwq".replace('/','\\');

        //第一种写法，不带目录的情况下，直接在项目的根目录创建text.txt文件夹 File(String)
        //File file = new File("text.txt");
        //第二种写法，带目录的情况是直接在指定位置创建testwq文件夹
       // File file1 = new File("/Users/my_java/java_demo/src/muke/teswq");

        //第三种写法，带目录的情况的另一种写法 File(String,String)
        File file1 = new File("/Users/my_java/java_demo/src/muke","testwq");

        //第四种写法，注意：这种方法file1必须是存在的才行，否则会报没有这个文件
        File file2 = new File(file1,"wq");

        if (!file1.exists()){
            //创建文件夹
            file1.mkdir();
            //创建文件
            //file1.createNewFile();

        }
        else{
            //删除文件夹
            file1.delete();
        }

        //判断文件是否存在
        System.out.println("文件是否存在："+file1.exists());
        //判断是否是一个目录，如果是，返回true，如果不是或者不存在，返回false
        System.out.println("是否是一个目录："+file1.isDirectory());
        //判断是否是一个文件
        System.out.println("是否是一个文件："+file1.isFile());
        System.out.println("文件绝对路径："+file1.getAbsolutePath());
        System.out.println("文件名称："+file1.getName());

    }
}

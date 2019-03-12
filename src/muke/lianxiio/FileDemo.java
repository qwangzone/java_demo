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
        //了解构造函数，查看帮助
        File file = new File("text.txt");
//        if (!file.exists()){
//            file.mkdir();
//
//        }
//        else{
//            file.delete();
//        }
//        System.out.println(file.exists());


        System.out.println(file.getName());
        FileDemo fileDemo = new FileDemo();
        System.out.println(fileDemo);
    }
}

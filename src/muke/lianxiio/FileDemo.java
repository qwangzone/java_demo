package muke.lianxiio;

import java.io.File;

public class FileDemo {
    /**
     * @author qiwang
     */
    public static void main(String[] args){
        //了解构造函数，查看帮助
        File file = new File("text.txt");
        if (!file.exists()){
            file.mkdir();
            
        }
        else{
            file.delete();
        }
        System.out.println(file.exists());
    }
}

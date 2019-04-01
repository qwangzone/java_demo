package coding;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatFile {
    String filename;
//    public CatFile(String filename){
//        this.filename = filename;
//
//    }

    public List open_nonu() throws IOException {
        File f = new File("Hello");
        BufferedReader br = new BufferedReader(new FileReader(f));
        FileReader fileReader = new FileReader(f);
        char[] byt = new char[1000];
        int leng = fileReader.read(byt);
        List contents = new ArrayList();
        for (char content:byt){
            contents.add(content);
        }

        return contents;
    }

    public String open_withnu(){
        return null;
    }

    public static void main(String[] args) throws IOException {
        CatFile catFile = new CatFile();
        List wq = catFile.open_nonu();
        System.out.println(wq);
    }
}

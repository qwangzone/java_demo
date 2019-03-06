package wq.muke.lianxiyichang;

import java.util.Arrays;
import java.util.Scanner;

public class BorrowBook {
    String bookname;
    int booknum;
    String[] books = {"一","二","三","四","五","六"};
    public String returnbyindex(int index){
        return books[index];
    }

    public String returnbyname(String name){
//        if (Arrays.binarySearch(books,name)){
//
//        }
        return name;
    }
    public static void main(String[] args){
        while (1>0){
            BorrowBook borrowBook = new BorrowBook();
            System.out.println("请输入书号或书名查找图书：");
            Scanner scanner = new Scanner(System.in);

        }



    }
}

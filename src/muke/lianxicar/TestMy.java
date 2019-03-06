package wq.muke.lianxicar;

import java.util.Scanner;

public class TestMy {
    public static void main(String[] args){
        Car jiaoche = new JiaoChe();
        Car pika = new PiKa();
        Car[] cars = {new JiaoChe(),new PiKa()};
        System.out.println("请输入你想选择的车型：");
        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equals("1")){
            System.out.println("jiaoche");
            cars[0].gongneng();
            cars[0].car();
        }
        else {
            System.out.println("pika");
            cars[1].gongneng();
            cars[1].car();
        }
    }
}

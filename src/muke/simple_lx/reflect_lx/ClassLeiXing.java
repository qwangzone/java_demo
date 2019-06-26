package muke.simple_lx.reflect_lx;

public class ClassLeiXing {

    public static void main(String[] args) {
        Class c = LuBan.class;
        String name = c.getName();
        
      //两种方式其实等价，一个是String类型，一个是class类型，在日志获取记录器的时候两种方式都支持
        System.out.println(name);
        System.out.println(c);
//        LuBan wq = new LuBan();
//        wq.m1();
    }
}
class LuBan{
    public void m1(){
        System.out.println("1");
    }

    public void m2(){
        System.out.println("2");
    }
}
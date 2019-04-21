package muke.simple_lx;

public class TestStaticDemo extends StaticleiDemo{
    public int b;
    public int c = 1;
    public String d = "wq";
    /*查看集成对于静态成员变量的影响，可以直接调用，建议用类名来调用*/
    public void test1(){
        System.out.println(TestStaticDemo.a);
        System.out.println(ll);
    }
    public static void main(String[] args) {
        TestStaticDemo t1 = new TestStaticDemo();
        TestStaticDemo t2 = new TestStaticDemo();

        System.out.println(pro.getProperty("age")+a);

    }
}

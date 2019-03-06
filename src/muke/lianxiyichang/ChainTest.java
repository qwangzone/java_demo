package muke.lianxiyichang;

public class ChainTest {
    /**
     * test1()抛出喝大了异常
     * test2（）捕获喝大了异常，并且包装成运行时异常，继续抛出
     * main方法中，调用test2方法抛出的异常
     */
    public void test1() throws wq.muke.lianxiyichang.ZiDingYi {
        System.out.println("抛出异常");
        throw new wq.muke.lianxiyichang.ZiDingYi("喝酒不开车" );
    }

    public void test2(){
        try {
            test1();
        }catch (Exception e){
            e.printStackTrace();
            RuntimeException newExc = new RuntimeException("司机一滴酒，亲人两行泪");
            newExc.initCause(e);
            throw newExc;
           // System.out.println("捕获异常");
        }
    }
    public static void main(String[] args){
        ChainTest chainTest = new ChainTest();
        chainTest.test2();
    }
}

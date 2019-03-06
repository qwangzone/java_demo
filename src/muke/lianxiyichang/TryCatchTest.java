package wq.muke.lianxiyichang;

public class TryCatchTest {
    public static void main(String[] args){
        TryCatchTest tryCatchTest = new TryCatchTest();
        int a = tryCatchTest.test();
        System.out.println(a);
    }

    public int test(){
        int divider=10;
        int result = 100;
        try {
            while (divider>1){
                result = result + 100/divider;
                divider--;
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            //System.out.println(e.getMessage());
            return -1;
        }finally {
            return 1111;
        }

    }
}

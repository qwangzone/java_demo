package muke.simple_lx.reflect_lx;

public class GetMthodDemo {
    static void staticmethod(){
        System.out.println("执行staticmethod方法");
    }

    public int publicmethod(int i){
        System.out.println("执行publicmethod方法");
        return i *100;
    }
    protected int protectmethod(String s,int i){
        System.out.println("执行protectmethod方法");
        return Integer.parseInt(s)+i;
    }

    private String privatemethod(String...strings){
        System.out.println("执行privatemethod方法");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<strings.length;i++){
            stringBuffer.append(strings[i]);

        }
        return stringBuffer.toString();
    }
}

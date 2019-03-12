package muke.lianxiio;

public class ToStringT {
    /**
     * 演示toString作用
     * @return
     */
    public String toString(){
        return "wq";
    }

    class ToStringNo{
        public void wq(){
            System.out.println("这个没有东西哈");
        }
    }

    public static void main(String[] args){
        ToStringT to = new ToStringT();
        System.out.println(to);
        to.ToStringNo toStringNo = new ToStringNo();

    }
}

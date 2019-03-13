package muke.lianxiio;

public class ToStringT {
    /**
     * 演示toString作用
     * @return
     * 1、在一个类中重写tostring方法
     * 2、利用成员内部类再写一个不带重新tostring方法的类
     * 3、在main函数中直接打印对象，观察tostring方法当用处
     */
    public String toString(){
        return "wq";
    }

    public class ToStringNo{
        public void wq(){
            System.out.println("这个没有东西哈");
        }
    }

    public static void main(String[] args){
        ToStringT to = new ToStringT();
        System.out.println("重写了tostring方法："+ to);
        ToStringNo toStringNo = to.new ToStringNo();
        System.out.println("调用默认的tostring方法："+toStringNo);

    }
}

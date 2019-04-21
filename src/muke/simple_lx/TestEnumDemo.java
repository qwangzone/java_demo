package muke.simple_lx;

public class TestEnumDemo {
    public static String getType(Object o){
        Class c = o.getClass();
        return c.toString();
    }
    public static void main(String[] args) {
        EnumDemo[] enu = EnumDemo.values();
        for (EnumDemo f:enu
             ) {System.out.println(getType(f)+ ": " + f);
             System.out.println(getType(f.toString())+ ": " + f);

        }
    }
}

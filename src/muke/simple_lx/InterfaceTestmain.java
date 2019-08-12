package muke.simple_lx;

public class InterfaceTestmain {
    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTestImp1();
        ((InterfaceTestImp1) interfaceTest).sing();
    }
}

package muke.system_lx;

public class SystemDemo {
    public static void main(String[] args){
        int a = 3;
        double b= 4.11;
        float d = 2.2f;
        System.out.println(b-a);
        SystemDemo systemDemo = new SystemDemo();
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getenv());
        //获取java版本
        System.out.println(System.getProperty("java.version"));
        //获取java安装目录
        System.out.println(System.getProperty("java.home"));
        //获取账户名称
        System.out.println(System.getProperty("user.name"));
        //获取账户主目录
        System.out.println(System.getProperty("user.home"));
        //查看文件分隔符
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("env"));
    }

}

package muke.simple_lx.reflect_lx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class GetMthodDemoTest {
    public static Parameter[] addparams(Method m){
       Parameter[] parameters =  m.getParameters();
       return parameters;
    }


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        GetMthodDemo getMthodDemo = new GetMthodDemo();
        Class c = getMthodDemo.getClass();
        /*获取所有方法*/
        Method[] methods = c.getDeclaredMethods();
//        Method method1 = c.getMethod("protectmethod()");
//        Parameter[] parameters= addparams(method1);
//        for (Parameter p: parameters){
//            System.out.println(p);
//        }

//        method1.invoke("publicmethod",1);
        for (final Method method:methods){
//            System.out.println(method);
//            /*获取方法名*/
            System.out.println(method.getName());
//            /*获取方法参数类型*/
//            System.out.println(method.getParameterTypes());
//            try {
//                method.invoke("staticmethod");
//            }catch (IllegalArgumentException e){
//                e.printStackTrace();
//            }

            Parameter[] parameters;
            parameters = method.getParameters();

            for (Parameter parameter:parameters){
                System.out.println(parameter);
            }


        }

    }
}

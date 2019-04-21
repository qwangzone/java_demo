package muke.simple_lx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*演示集合类中arraylist用法*/
public class ListCollectionDemo {

    /*遍历数组*/
    public static void getList(List ls) {
        Iterator it = ls.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("===============");
    }

    public static void main(String[] args) {
        List ls1 = new ArrayList();

        //添加对象
        ls1.add("1");
        ls1.add("2");
        ls1.add("3");
        getList(ls1);
        //移出对象
        ls1.remove("1");
        getList(ls1);

        //判断当前集合是否为空
        System.out.println(ls1.isEmpty());
        System.out.println("===============");

        //获取数组长度,返回int类型
        System.out.println(ls1.size());
        System.out.println("===============");

        //获取指定索引的值
        System.out.println(ls1.get(0));
        System.out.println("===============");

        //修改指定索引位置的值
        ls1.set(0,"blue");
        System.out.println(ls1.get(0));
        System.out.println("===============");

        //获取某个值的索引,若不存在，则返回-1
        System.out.println(ls1.indexOf("blue"));
        System.out.println("===============");

        //判断某个值是否是存在于这个数组里面
        if (ls1.indexOf("blue11")==-1){
            //如果不存在，则把这个值加进去,如果存在，就把这个值删掉
            ls1.add("blue11");
        }else {
            ls1.remove("blue11");
        }
        getList(ls1);
        }

}

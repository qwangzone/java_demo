package muke.simple_lx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static String  getType(Object o){
        return o.getClass().toString();
    }

    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<String, String>();
        /*添加值*/
        m1.put("name","tom");
        m1.put("age","18");
        m1.put("sex","man");
        //key重复的话会修改之前的值
        m1.put("sex","man1");

        //获取所有字典值[man, tom, 18]
        System.out.println(getType(m1.values()));

        //获取所有字典key
        System.out.println(getType(m1.keySet()));

        //获取整个字典数据，entrySet类型[sex=man, name=tom, age=18]
        System.out.println(m1.entrySet());

        //判断字典是否包含某个key true/false
        System.out.println(m1.containsKey("18"));

        //判断字典是否包含某个value true/false
        System.out.println(m1.containsValue("18"));

        //循环打印每一对 key:value
        Iterator it = m1.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //分别获取 key 的值，和 value 的值
        Iterator it2 = m1.keySet().iterator();
        while (it2.hasNext()){
            //获取字典的key
            String key = (String)it2.next();
            System.out.println(key);
            //获取字典的value
            String value = (String)m1.get(key);
            System.out.println(value);

        }

        //获取字典的值
        for (String key:m1.keySet()){
            System.out.println(key);
            System.out.println(m1.get(key));
        }
    }
}

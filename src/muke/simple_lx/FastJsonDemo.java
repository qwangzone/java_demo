package muke.simple_lx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FastJsonDemo {

    @JSONField(name = "age",serialize = false)
    private int age;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "date")
    private Date date;
    public FastJsonDemo(int age,String name,Date date){
        this.age=age;
        this.name=name;
        this.date=date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    /*获取变量类型*/
    public static String  getType(Object o){
        return o.getClass().toString();
    }

    public static void main(String[] args) {
        List<FastJsonDemo> person = new ArrayList<FastJsonDemo>();
        person.add(new FastJsonDemo(12,"a",new Date()));
        person.add(new FastJsonDemo(25,"b",new Date()));

        String jsonstring = JSON.toJSONString(person);
        System.out.println(jsonstring);

        String wq = "[{\"student\":\"wq\",\"teacher\":\"gh\"},{\"wqw\":\"22\"}]";
//        JSONObject jsonObject = JSONObject.parseObject(jsonstring);
        JSONArray jsonArray = JSONArray.parseArray(jsonstring);

        System.out.println(jsonArray);
        System.out.println(getType(jsonArray));
    }
}

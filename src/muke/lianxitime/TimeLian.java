package muke.lianxitime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeLian {
    public static void main(String[] args){
        Calendar ca = Calendar.getInstance();
        Date d = ca.getTime();
        //日期转成时间戳
        long d1 = ca.getTimeInMillis();
        Date d2 = new Date();
        System.out.println(d1);
        System.out.println(d2.getTime());
        //时间戳转成时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        System.out.println(sdf.format(d1));

    }
}

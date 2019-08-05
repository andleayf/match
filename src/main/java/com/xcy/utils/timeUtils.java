package com.xcy.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeUtils {
    /**
     * @param args
     * @throws ParseException
     */

    /**
     * 根据所给日期返回两日期相差的秒数
     * @param d1
     * @param d2
     * @return 返回两个日期间隔的毫秒数
     */


    public static long getSecond(Date d1,Date d2)
    {
        long a1 = d1.getTime();
        long a2 = d2.getTime();
        long a3 = (a1 - a2)/1000;

        return a3;
    }

    /**
     * 根据所秒数,计算相差的时间并以**时**分**秒返回
     * @param d1
     * @param d2
     * @return
     */
    public static String getBeapartDate(long m)
    {
        String beapartdate="";
        int nDay = (int)m/(24*60*60);
        //int nHour = (int)(m-nDay*24*60*60)/(60*60);
        int nHour = (int)m/(60*60);
        //int nMinute = (int)(m-nDay*24*60*60-nHour*60*60)/60;
        //int nSecond = (int)m-nDay*24*60*60-nHour*60*60-nMinute*60;
        beapartdate = nHour+"h";

        return beapartdate;
    }





    /**
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException
    {
        Date now=new Date();
        SimpleDateFormat f   =   new   SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time =  new   SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        java.util.Date end = f.parse(time);
        java.util.Date   begin=   f.parse("2009-09-09 10:10");
        String xx = getBeapartDate(getSecond(end,begin));
        System.out.println(xx);

    }
}

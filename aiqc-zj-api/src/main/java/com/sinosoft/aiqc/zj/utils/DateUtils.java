package com.sinosoft.aiqc.zj.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils {

    public static String formatDate(Date date, String formatString) {
        SimpleDateFormat format = new SimpleDateFormat(formatString);
        return format.format(date);
    }

    public static String formatDate(Date date) {
        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date formatString(String date) {
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date format(Date date, String formatString) {
        SimpleDateFormat format = new SimpleDateFormat(formatString);
        String dataStr = format.format(date);
        Date dataF = null;

        try {
            dataF = format.parse(dataStr);
        } catch (ParseException var6) {
            var6.printStackTrace();
        }

        return dataF;
    }

    public static Date format(String date, String formatString) {
        SimpleDateFormat format = new SimpleDateFormat(formatString);
        Date dataF = null;

        try {
            dataF = format.parse(date);
        } catch (ParseException var5) {
            var5.printStackTrace();
        }

        return dataF;
    }

    public static String formatString(String date, String formatString) {
        SimpleDateFormat format = new SimpleDateFormat(formatString);
        Date dataF = null;
        String dataStr = null;

        try {
            dataF = format.parse(date);
            dataStr = format.format(dataF);
        } catch (ParseException var6) {
            var6.printStackTrace();
        }

        return dataStr;
    }

    public static List<String> getToday() {
        Calendar ca = Calendar.getInstance();
        ca.set(11, 23);
        ca.set(12, 59);
        ca.set(13, 59);
        String endTime = formatDate(ca.getTime(), "yyyy-MM-dd HH:mm:ss");
        ca.set(11, 0);
        ca.set(12, 0);
        ca.set(13, 0);
        String startTime = formatDate(ca.getTime(), "yyyy-MM-dd HH:mm:ss");
        List<String> list = new ArrayList<>();
        list.add(startTime);
        list.add(endTime);
        return list;
    }

    public static String changeToMSvalue(Integer time) {
        int second = time / 1000 % 60;
        int millis = time / 1000 / 60;
        String s = second + "";
        String m = millis + "";
        if (second <= 9) {
            s = "0" + second;
        }

        if (millis <= 9) {
            m = "0" + millis;
        }

        String timeStr = m + "′" + s + "″";
        return timeStr;
    }

    public static Date getLastDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(2, -1);
        return cal.getTime();
    }

    public static List<String> getMonthBetween(String minDate, String maxDate) throws ParseException {
        ArrayList<String> result = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();
        min.setTime(sdf.parse(minDate));
        min.set(min.get(1), min.get(2), 1);
        max.setTime(sdf.parse(maxDate));
        max.set(max.get(1), max.get(2), 2);
        Calendar curr = min;

        while (curr.before(max)) {
            result.add(sdf.format(curr.getTime()));
            curr.add(2, 1);
        }

        return result;
    }

    public static List<String> getEveryDay(String dateString) throws ParseException {
        SimpleDateFormat format = null;
        ArrayList listday;
        if (dateString.length() == 4) {
            listday = new ArrayList();
            new SimpleDateFormat("yyyy");

            for (int i = 0; i < 12; ++i) {
                listday.add(String.valueOf(i + 1));
            }

            return listday;
        } else {
            listday = new ArrayList();
            format = new SimpleDateFormat("yyyyMM");
            Date date = format.parse(dateString);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);

            for (int i = 0; i < calendar.getActualMaximum(5); ++i) {
                listday.add(String.valueOf(i + 1));
            }

            return listday;
        }
    }
}

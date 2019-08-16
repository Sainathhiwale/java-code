package date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {

     DateTest dateTest = new DateTest();
     dateTest.fetchCurrentTimeStamp();
     System.out.println("Current date:"+dateTest.fetchCurrentTimeStamp());
    }

    public String fetchCurrentTimeStamp(){
        String concatsec = "",concathr= "",concatmin="";
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        if (String.valueOf(second).length()==1){
            concatsec = "0"+String.valueOf(second);
        }else {
            concatsec = String.valueOf(second);
        }if(String.valueOf(minute).length()==1){
            concatmin = "0"+String.valueOf(minute);
        }else {
            concatmin = String.valueOf(minute);
        }
        if(String.valueOf(hour).length()==1){
            concathr = "0"+String.valueOf(hour);
        }else {
            concathr = String.valueOf(hour);
        }
        return todayDate("")+concathr+concatmin+concatsec;
    }
    public static String todayDate(String separator){
        String day,month,year;
        day ="dd";
        month ="MM";
        year ="yy";
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat(day + separator + month + separator + year);
        return ft.format(dNow);
    }
}

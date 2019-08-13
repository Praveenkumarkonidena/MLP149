import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.*;
public class DateDemo{
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now => "+now);
        LocalDate date = now.toLocalDate();
        System.out.println("Date : "+date);
        LocalTime time = now.toLocalTime();
        System.out.println("Time => "+time);

        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        System.out.println(day+"-"+month+"-"+year);
        System.out.printf("%02d-%02d-%4d\n",day,month,year);

        Month mon = now.getMonth();
        DayOfWeek d = now.getDayOfWeek();
        System.out.println(day+"-"+mon+"-"+year);
        System.out.printf("%02d-%s-%4d-%s\n",day,mon,year,d);
        System.out.println(d);

        int hour = now.getHour();
        int min = now.getMinute();
        int sec = now.getSecond();
        int milli = now.getNano();
        System.out.printf("%02d-%02d-%02d-%02d\n",hour,min,sec,milli);
        
    }
}
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SetDate{
    public static void main(String[] args){
        System.out.println("\n \n");
        LocalDateTime date1 = LocalDateTime.of(1990,02,20,22,33,44);
        System.out.println(date1);

        LocalTime time1 = LocalTime.of(20,22,33,44);
        System.out.println(time1);
        System.out.println("\n \n");

        LocalDate today = LocalDate.now();
        System.out.println("current date : " + today);

        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next Year : " + nextYear);

        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next Month : " + nextMonth);

        LocalDate nextDay = today.plus(1, ChronoUnit.DAYS);
        System.out.println("Next Date : " + nextDay);

        LocalDate nextWeek = today.plus(1,ChronoUnit.WEEKS);
        System.out.println("Next Date : " + nextWeek);

        LocalDate prevYear = today.minus(1,ChronoUnit.YEARS);
        System.out.println("\n \n" +"Last year : " + prevYear);

        LocalDate prevMonth = today.minus(1, ChronoUnit.MONTHS);
        System.out.println("Last Month : " + prevMonth);

        

        LocalDate prevWeek = today.minus(1,ChronoUnit.WEEKS);
        System.out.println("prev Week : " + prevWeek);

        LocalDate prevDay = today.minus(1, ChronoUnit.DAYS);
        System.out.println("prev Date with 1 : " + prevDay);
 
        LocalDate prevDay2 = today.minus(0, ChronoUnit.DAYS);
        System.out.println("prev Date with 0 : " + prevDay2);

        LocalDate prevDay1 = today.minus(-1, ChronoUnit.DAYS);
        System.out.println("prev Date with -1: " + prevDay1);

        LocalDate date3 = LocalDate.now();
        System.out.println("\n \n"+"current date : " + date3);

        LocalDate date4 = date3.plus(1, ChronoUnit.MONTHS);
        System.out.println("current date : " + date4);

        Period period = Period.between(date3,date4);
        System.out.println("Period : " + period);
        int day = period.getDays();
        int mon = period.getMonths();
        int ye = period.getYears();
        System.out.println("Periods : " + day + "-" + mon + "-" + ye );

        LocalTime time2 = LocalTime.now();
        LocalTime time3 = time2.plus(2, ChronoUnit.HOURS);
        Duration duration = Duration.between(time2,time3);
        System.out.println("\n \n" + "Duration : " + duration);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n \n"+"Enter Date of Birth [dd-mm-yyyy]");
        String doj = sc.next();
        System.out.println("Entered : " + doj);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate formatDateTime = LocalDate.parse(doj, formatter);
        System.out.println("\n"+"After : "+ formatDateTime);
        System.out.println("\n"+"After : "+ formatDateTime.format(formatter));
        sc.close();

        
        
    }
}
package oop;
// import java.time
/*
LocalDate -> represents a date (yy-mm-dd)
LocalTime -> reps the time (hh-mm-ss)
LocalDateTime -> (yy-mm-dd hh-mm-ss)
DateTimeFormatter -> displaying and parsing date-time objs
 */
// we employ  the use of factory methods now(), of() and parse();sos

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateandTime {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
        LocalTime myTime  = LocalTime.now();
        System.out.println(myTime);
        LocalDateTime myDateobj = LocalDateTime.now();
        DateTimeFormatter myFromat = DateTimeFormatter.ofPattern("dd-mm-yy hh-mm-ss");
        String myDate = myDateobj.format(myFromat);
        System.out.println(myDate);
    }
}

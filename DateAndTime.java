package JAVA8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) 
	{
		//Instant
		Instant inst=Instant.now();
		System.out.println(inst);
		
		//Duration
		Instant inst1=Instant.now();
		Duration duration=Duration.between(inst, inst1);
		System.out.println(duration);
		
		//LoacalDate
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate);
		
		//LocalTime
		LocalTime currentTime=LocalTime.now();
		System.out.println(currentTime);
		
		//period
		LocalDate birthDate=LocalDate.of(2001, 12, 07);
		Period period=Period.between(currentDate, birthDate);
		System.out.println(period);
		
		//LocalDateTime
		LocalDateTime dt=LocalDateTime.now();
		LocalDateTime dt2=LocalDateTime.of(birthDate,currentTime);
		System.out.println(dt);
		System.out.println(dt2);
		
		//Formatting yyyy-mm-dd and hh:mm:ss
		LocalDateTime datetime=LocalDateTime.now();
		int days=datetime.getDayOfMonth();
		int month=datetime.getMonthValue();
		int year=datetime.getYear();
		System.out.printf("%d - %d - %d",year,month,days);
        System.out.println();
        
        int hours=datetime.getHour();
		int minutes=datetime.getMinute();
		int seconds=datetime.getSecond();
		System.out.printf("%d - %d - %d",hours,minutes,seconds);
        System.out.println();
        
        //DateTimeFormatter
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-mm-yyyy  Hh-mm");
        LocalDateTime ldt=LocalDateTime.of(birthDate, currentTime);
        String formattedString =ldt.format(formatter);
        System.out.println(formattedString);
        
        //Year
        Year y=Year.now();
        System.out.println(y);
        
        //ZoneId
        ZoneId zid=ZoneId.systemDefault();
        System.out.println(zid);
        
        //ZoneDateTime
        ZoneId zus=ZoneId.of("America/Chicago");
        ZonedDateTime zdt=ZonedDateTime.now(zus);
        System.out.println(zdt);
        
	}

}

// Date in java is stored in Long number of milli-second passed since 1 jan 1970. but in year case it is calculated since 1900.  
// java.Time; package is used for date and Time since Java 8 onwards.

package com.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime extends Thread {

	public static void main(String[] args)  {
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);  // Year calculation since 1 Jan 1970.
       
		System.out.println(Long.MAX_VALUE);  // Maximum value of Long
        System.out.println(System.currentTimeMillis());  // value in miliSecond since 1 jan 1970.
        
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
        
        LocalDate d= LocalDate.now();
        System.out.println(d);
        
        LocalTime t=LocalTime.now();
        System.out.println(t);
        
        System.out.println("-----------------------------------------------");
        
        // Formating of Date and time
        
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-mm-yyyy a");
        DateTimeFormatter f4= DateTimeFormatter.ofPattern("H:m:s:N");
        
        DateTimeFormatter f1=DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter f2=DateTimeFormatter.ISO_ORDINAL_DATE;
        
              String date =dt.format(f4);
              System.out.println(date);
        
        
	   
	}

}

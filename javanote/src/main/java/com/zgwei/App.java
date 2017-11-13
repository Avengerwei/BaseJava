package com.zgwei;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Timestamp timestamp = new Timestamp(LocalDate.now().toEpochDay());
        System.out.println(LocalDate.now().toEpochDay());
        LocalDate.now().atStartOfDay(ZoneId.systemDefault());
        System.out.println(LocalDate.now().atStartOfDay().toString());
        System.out.println(new Timestamp(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()).getTime());
        System.out.println(Timestamp.valueOf(LocalDate.now() + " 00:00:00").getTime());
        System.out.println(new Timestamp(new Date().getTime()).getTime());



        System.out.println( "Hello World!" );
    }
}

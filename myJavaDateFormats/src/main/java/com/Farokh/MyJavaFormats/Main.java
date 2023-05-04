package com.Farokh.MyJavaFormats;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    System.out.println(dtf.format(now));

    // Date format can be set as below
    dtf = DateTimeFormatter.ofPattern("MMddyyyy");
    System.out.println(dtf.format(now));

    // Notice the date format change here
    dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.uuuuu");
    System.out.println(dtf.format(now));
  }
}

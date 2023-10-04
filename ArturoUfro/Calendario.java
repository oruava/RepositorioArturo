package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Calendario {
    public void main(String[] args) {
        TodaysDate hoy = new TodaysDate();
        hoy.printDateAndTime();
    }

    public class TodaysDate {
        String time;
        public int day;
        private int month;
        protected int year;


        public void printDateAndTime() {
            GregorianCalendar calendar = new GregorianCalendar();
            time = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
            day = calendar.get(Calendar.DATE);
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);

            System.out.println("Time: " + time);
            System.out.println("Date: " + month + " " + day + " " + year);
        }

    }
}




package org.example;

public class TimeConversion {
    /*Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
    - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock
     */

    public static void main(String[] args) {
        String s = "05:01:00PM";
        int hora = 0;

        if(s.contains("PM")){
            hora = Integer.valueOf(s.substring(0,2));

            if(hora!=12){
                hora = hora +12;
            }

            s = String.valueOf(hora).concat(s.substring(2,10));

        }
        System.out.println(hora);
        System.out.println(s);

        if(s.contains("AM") && s.substring(0,2).contains("12")){
            s = "00".concat(s.substring(2,10));
        }
    }
}

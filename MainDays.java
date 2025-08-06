package com.enumm;

public class MainDays {

    public static void main(String[] args) {


        findDay(Days.SUNDAY);
        findDay(Days.MONDAY);
        findDay(Days.TUESDAY);
        findDay(Days.WEDNESDAY);
        findDay(Days.THURSDAY);
        findDay(Days.FRIDAY);
        findDay(Days.SATURDAY);

    }

    public static void findDay(Days day){
        switch (day){
            case SUNDAY:
                System.out.println(day+"  is weekend");
                break;
            case MONDAY:
                System.out.println(day+"  is weekday");
                break;
            case TUESDAY:
                System.out.println(day+"  is weekday");
                break;
            case WEDNESDAY:
                System.out.println(day+"  is weekday");
                break;
            case THURSDAY:
                System.out.println(day+"  is weekday");
                break;
            case FRIDAY:
                System.out.println(day+"  is weekday");
                break;
            case SATURDAY:
                System.out.println(day+"  is weekend");
                break;

            default:
                System.out.println("faild");
        }
    }
}

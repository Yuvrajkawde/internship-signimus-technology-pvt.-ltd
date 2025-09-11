package com.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTime {

    public static void main(String[] xyz) {
    System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));
}

}

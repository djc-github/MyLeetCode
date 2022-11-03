package com.djc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

@SpringBootTest
class MyLeetCodeApplicationTests {

    @Test
    void contextLoads() {
        long currentTimeMillis = System.currentTimeMillis();
        LocalDateTime now1 = LocalDateTime.now();
        Instant instant = Instant.now();
        long epochSecond = instant.getEpochSecond();
        long toEpochMilli = instant.toEpochMilli();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime localDateTime2 = LocalDateTime.ofEpochSecond(epochSecond, instant.getNano(),ZoneOffset.ofHours(+8));
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        System.out.println(now1.toString().replace("T"," "));
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, Month.SEPTEMBER, 3, 18, 10, 10,1);
        System.out.println(localDateTime1);

    }

}

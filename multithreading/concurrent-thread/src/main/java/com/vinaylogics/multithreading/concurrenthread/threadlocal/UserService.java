package com.vinaylogics.multithreading.concurrenthread.threadlocal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.LongStream;

public class UserService {
    private DataProvider db = DataProvider.getInstance();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        final UserService userService = new UserService();
        LongStream.range(1, 10).forEach(i ->{
            new Thread(()->{
                System.out.println(userService.birthDate(i));
            }).start();
        });
    }

    public String birthDate(Long userId){
       LocalDate localDate = db.birthDateFromDB(userId);
       return formatter.format(localDate);
    }
}

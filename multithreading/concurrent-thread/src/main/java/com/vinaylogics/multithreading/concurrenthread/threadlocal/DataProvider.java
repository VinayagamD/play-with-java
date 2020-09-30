package com.vinaylogics.multithreading.concurrenthread.threadlocal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.LongStream;

public class DataProvider {
    public static final Object LOCK = new Object();
    private static DataProvider instance;
    private static List<User> users = new ArrayList<>();

    private DataProvider() {
        LongStream.range(1,1000).forEach(i->{
            users.add(new User(i, UUID.randomUUID().toString(), LocalDate.now()));
        });
    }

    public static DataProvider getInstance() {
        if(instance == null){
            synchronized (LOCK){
                if(instance == null){
                    instance = new DataProvider();
                }
            }
        }
        return instance;
    }

    public static List<User> getUsers() {
        return users;
    }

    public LocalDate birthDateFromDB(long userId){
       return users.stream().filter(user -> userId == user.getUserId()).findAny().map(User::getBirthDate).orElse(null);
    }
}

package com.vinaylogics.playwithjava.designpatterns.structural.composite;

public class Manager implements Employee {

    private long empId;
    private String name;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " : "+name+" : "+position);
    }
}

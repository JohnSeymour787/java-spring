package com.swin.advjava.demo;

public class Student
{
    private String name;
    private long ID;

    public Student(String name)
    {
        this.name = name;
    }

    public Student(String name, long id)
    {
        this.name = name;
        this.ID = id;
    }

    public String getName()
    {
        return name;
    }
}

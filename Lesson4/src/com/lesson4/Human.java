package com.lesson4;

/**
 * Created by Âåâäþê on 08.06.2015.
 */
public class Human {

    private String name;

    private static final int MIN_AGE = 0;

    private static final int MAX_AGE = 120;

    private static final int MIN_NAME_LENGTH = 3;

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge > MIN_AGE && newAge < MAX_AGE) {
            age = newAge;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        if(newName != null && newName.length() >= MIN_NAME_LENGTH) {
            name = newName;
        }
    }

    public void sayHello(){
        System.out.println("Hello!!");
    }

}

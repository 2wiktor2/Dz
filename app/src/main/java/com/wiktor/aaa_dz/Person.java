package com.wiktor.aaa_dz;

import android.util.Log;

public class Person implements Human {

    private String name;
    private int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public void getName() {
        Log.d(Const.TAG, "Имя - " + name);
    }

    @Override
    public void getAge() {
        Log.d(Const.TAG, "Возраст  - " + age);
    }

    @Override
    public void getGender() {
        Log.d(Const.TAG, "Пол - " + gender);

    }
}
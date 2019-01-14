package com.wiktor.aaa_dz;

import android.util.Log;

public class Man implements Human {


    private String name;
    private int age;
    private final String gender = Const.M;
    private Person person;


    // конструктор
    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setWife(Person a) {
        a.getName();
        a.getAge();
        a.getGender();
    }
    public void setWife(Woman a) {
        a.getName();
        a.getAge();
        a.getGender();
    }


    @Override
    public void getName() {
        Log.d(Const.TAG, "Имя мужчины - " + name);
    }

    @Override
    public void getAge() {
        Log.d(Const.TAG, "Возраст мужчины - " + age);
    }

    @Override
    public void getGender() {
        Log.d(Const.TAG, "Пол - " + Const.M);
    }
}

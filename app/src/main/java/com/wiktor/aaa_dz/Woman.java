package com.wiktor.aaa_dz;

import android.util.Log;

public class Woman implements Human {
    private String name;
    private int age;
    Human husband;

    Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setHusband(Human husband) {
        this.husband = husband;
    }

    @Override
    public void getName() {
        Log.d(Const.TAG, "Имя женщины - " + name);
    }

    @Override
    public void getAge() {
        Log.d(Const.TAG, "Возраст женщины - " + age);
    }

    @Override
    public void getGender() {
        Log.d(Const.TAG, "Пол - " + Const.W);
    }
}


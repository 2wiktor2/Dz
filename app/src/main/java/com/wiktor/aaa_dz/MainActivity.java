package com.wiktor.aaa_dz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;


    Man man1, man2;
    Woman woman1, woman2;
    Human human1, human2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        man1 = new Man("Pol", 15);
        man2 = new Man("Grigoriy", 33);
        woman1 = new Woman("Anna", 55);
        woman2 = new Woman("Zhanna", 38);


        human1 = new Man("Christian", 56);
       human2 =  new Woman("Ursula", 32);

       /* Переменая суперкласса может
        ссылаться на объект подкласса
        Ссылочной переменной из суперкласса может быть присвоена ссылка на любой
        подкласс, производный от этого суперкласса.*/

    }

    @Override
    public void onClick(View v) {

        man1.setWife(woman1);
        if (woman1 instanceof Woman){
            woman1.getName();
            woman1.getAge();
            woman1.getGender();
        } else Log.d(Const.TAG, "Неправильно");


        woman2.setHusband(man2);
/*
        if (person2.gender.equals(Const.W)) {
            man2.setWife(person2);
        } else {
            System.out.println("Педики");
        }
*/


    }
}

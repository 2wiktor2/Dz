package com.wiktor.aaa_dz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    Person person2;
    Man man2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        person2 = new Person("Zulfiya", 19, "Женский");
        man2 = new Man("Grigoriy", 33);


    }

    @Override
    public void onClick(View v) {


        man2.getName();
        man2.getAge();
        man2.getGender();
        if (person2.gender.equals("Женский")) {
            man2.setWife(person2);
        } else {
            System.out.println("Педики");
        }


    }
}

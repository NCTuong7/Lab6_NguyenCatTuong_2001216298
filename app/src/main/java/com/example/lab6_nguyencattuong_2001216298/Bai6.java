package com.example.lab6_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai6 extends AppCompatActivity {
Button btnFr1,btnFr2;
FragmentManager frBai6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);
        addContol();
        addEvent();
    }

    void addContol()
    {
        btnFr1 = (Button) findViewById(R.id.btnFr1);
        btnFr2 = (Button) findViewById(R.id.btnFr2);
        frBai6 = getSupportFragmentManager();
    }

    void addEvent()
    {
        btnFr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr1 = frBai6.beginTransaction();
                fr1.replace(R.id.frBai6,new FragmentOne6());
                fr1.commit();
            }
        });

        btnFr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr2 = frBai6.beginTransaction();
                fr2.replace(R.id.frBai6,new FragmentTwo6());
                fr2.commit();
            }
        });
    }
}
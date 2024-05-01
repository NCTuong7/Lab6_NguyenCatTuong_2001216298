package com.example.lab6_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai2 extends AppCompatActivity {
Button btnAdd;
FragmentManager frLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        addControl();
        addEvent();
    }

    void addControl()
    {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        frLayout = getSupportFragmentManager();
    }

    void addEvent()
    {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = frLayout.beginTransaction();
                ft.add(R.id.frLayout, new fragment_layout());
                ft.commit();
            }
        });
    }
}
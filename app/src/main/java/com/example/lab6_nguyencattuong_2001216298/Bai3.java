package com.example.lab6_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class Bai3 extends AppCompatActivity implements fragment_one_3.SendMessage {
TabLayout tblBai3;
ViewPager vpgBai3;
ViewPagerAdapter viewPagerAdapter;
Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        addControl();

//        setSupportActionBar(toolbar);
    viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    vpgBai3.setAdapter(viewPagerAdapter);
    tblBai3.setupWithViewPager(vpgBai3);
        addEvent();

    }


    @Override
    public void sendData(String message) {
        String tag = "android:switcher:" + R.id.vpgBai3 + ":" + 1;
        fragment_two_3 f = (fragment_two_3) getSupportFragmentManager(). findFragmentByTag(tag);
        f.displayReceivedData(message);
    }

    void addControl()
    {
        toolbar = (Toolbar) findViewById(R.id.tlbBai3);
        vpgBai3 = (ViewPager) findViewById(R.id.vpgBai3);
        tblBai3 = (TabLayout) findViewById(R.id.tblBai3);
    }



    void addEvent()
    {

    }
}
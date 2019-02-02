package com.example.tariq.firstapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Page1 extends AppCompatActivity {

    //تعريف الصور او الازرار ..
    ImageView str1,str2,str3,stop1,stop2,stop3,up1,up2,up3,don1,don2,don3;
    //تعريف النص
    TextView tv1,tv2,tv3;

    //تعريف الصوت
    MediaPlayer mp1,mp2,mp3;

    //تعريف الحجم النص ﻻ استخدمه في التكبير والتصغير
    int ss1=20, ss2=20, ss3=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ربط الصور لتكون كا الازرار ويكون الربط عن طريق IP...
        setContentView(R.layout.page1);

        //mp1.start();///لجعل الصوت يشتغل عند بداية تشغيل التطبيق اوتماتيكي))

        str1 =(ImageView)findViewById(R.id.imageView4);
        str2 =(ImageView)findViewById(R.id.imageView44);
        str3 =(ImageView)findViewById(R.id.imageView444);
        stop1 =(ImageView)findViewById(R.id.imageView5);
        stop2 =(ImageView)findViewById(R.id.imageView55);
        stop3 =(ImageView)findViewById(R.id.imageView555);
        up1 =(ImageView)findViewById(R.id.imageView6);
        up2 =(ImageView)findViewById(R.id.imageView66);
        up3 =(ImageView)findViewById(R.id.imageView666);
        don1 =(ImageView)findViewById(R.id.imageView7);
        don2 =(ImageView)findViewById(R.id.imageView77);
        don3 =(ImageView)findViewById(R.id.imageView777);
        tv1 =(TextView)findViewById(R.id.textView2);
        tv2 =(TextView)findViewById(R.id.textView22);
        tv3 =(TextView)findViewById(R.id.textView222);

        //ربط الاصوات ..
        mp1 =MediaPlayer.create(this,R.raw.first);
        mp2 =MediaPlayer.create(this,R.raw.sacand);
        mp3 =MediaPlayer.create(this,R.raw.therd);

        //////ربط النص لنقوم بعملية التكبير والتصغير..
        tv1.setTextSize(ss1);
        tv2.setTextSize(ss2);
        tv3.setTextSize(ss3);

        //////////////////////////////////////////////////////////////
        //زر التشغيل str ..عملية التفعيل لزر.
        str1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                mp1.start();
            }
        });

        str2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                mp2.start();
            }
        });

        str3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                mp3.start();
            }
        });

        //زر التوقف stop..
        stop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                mp1.pause();
            }
        });

        stop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                mp2.pause();
            }
        });

        stop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                mp3.pause();
            }
        });

        //زر التكبير..
        up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                if(ss1<30) {
                    ss1++;
                }
                    else{
                        Toast.makeText(Page1.this, "عفوا ﻻ يمكن تكبير النص اكثر", Toast.LENGTH_SHORT).show();
                    }
                tv1.setTextSize(ss1);



            }
        });

        up2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                if(ss2<30) {
                    ss2++;
                }
                else{
                    Toast.makeText(Page1.this, "عفوا ﻻ يمكن تكبير النص اكثر", Toast.LENGTH_SHORT).show();
                }
                tv2.setTextSize(ss2);



            }
        });

        up3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                if(ss3<30) {
                    ss3++;
                }
                else{
                    Toast.makeText(Page1.this, "عفوا ﻻ يمكن تكبير النص اكثر", Toast.LENGTH_SHORT).show();
                }
                tv3.setTextSize(ss3);




            }
        });

        //زر التصغير..
        don1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                if(ss1>15) {
                    ss1--;
                }
                else{
                    Toast.makeText(Page1.this, "عفوا ﻻ يمكن تصغير النص اكثر", Toast.LENGTH_SHORT).show();
                }
                tv1.setTextSize(ss1);




            }
        });

        don2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                if(ss2>15) {
                    ss2--;
                }
                else{
                    Toast.makeText(Page1.this, "عفوا ﻻ يمكن تصغير النص اكثر", Toast.LENGTH_SHORT).show();
                }
                tv2.setTextSize(ss2);



            }
        });

        don3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////////////
                if(ss3>15) {
                    ss3--;
                }
                else{
                    Toast.makeText(Page1.this, "عفوا ﻻ يمكن تصغير النص اكثر", Toast.LENGTH_SHORT).show();
                }
                tv3.setTextSize(ss3);



            }
        });






    }
}

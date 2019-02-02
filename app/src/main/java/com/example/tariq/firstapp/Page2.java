package com.example.tariq.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        b1 =(Button)findViewById(R.id.but1);
        b2 =(Button)findViewById(R.id.but2);
        b3 =(Button)findViewById(R.id.but3);

        /////////////////////////////////////////

        ///زر عرض التطبيقات
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /////////
                String developerName = "AndRody";     //ضع هنا اسم المبرمج الاسم المستخدم في المتجر
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=" + developerName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=" + developerName)));
                }
            }


        });
        ////زر تقييم التطبيق

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /////////
                final String appPackageName = getPackageName(); // getPackageName() طلبنا اسم الباكيج الخاص للتطبيق من هذا التطبيق, لو أردت تقييم تطبيق اخر ضع اسم الباكيج الخاصة به
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /////////
                Intent i =new Intent(Intent.ACTION_SEND);
                i.setType("text/Plain");
                i.putExtra(Intent.EXTRA_SUBJECT,"تطبيق اذكار منوعة");
                i.putExtra(Intent.EXTRA_TEXT,"تطبيق اذكار منوعة ، جرب الان .. التطبيق اكثر من رائع ومفيدhttps//play.google.com/store/apps/details?id=com.example.tariq.firstapp) \n  ");
                startActivity(Intent.createChooser(i,""));


            }
        });
    }
}

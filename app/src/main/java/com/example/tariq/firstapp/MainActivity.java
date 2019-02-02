package com.example.tariq.firstapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 =(ImageView)findViewById(R.id.imageView1);
        img2 =(ImageView)findViewById(R.id.imageView2);
        img3 =(ImageView)findViewById(R.id.imageView3);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////
                Intent go1 =new Intent(MainActivity.this,Page1.class);
                startActivity(go1);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /////////////////////
                Intent go2 = new  Intent(MainActivity.this,Page2.class);
                startActivity(go2);

            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //////////////////////
                //finish();
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);
                builder.setTitle("إغلاق التطبيق"); // العنوان
                builder.setMessage("هل متأكد من خروج من التطبيق :("); // المحتوى
                builder.setPositiveButton("نعم", // الزر الاول
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // الاوامر التي تحدث بعد الضغط على الزر الأاول
                                finish();

                            }
                        });
                builder.setNegativeButton("لا", // الزر الثاني
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // اوامر الزر الثاني


                            }
                        });
                builder.show();
            }

        });
    }
}

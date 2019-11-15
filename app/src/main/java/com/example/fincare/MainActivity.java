package com.example.fincare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_frst,btntwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_frst = (Button) findViewById(R.id.btn_frst);
        btntwo = (Button) findViewById(R.id.btntwo);
        btn_frst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardOneActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, 0);
            }
        });

        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardTwo.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, 0);
            }
        });


    }



}

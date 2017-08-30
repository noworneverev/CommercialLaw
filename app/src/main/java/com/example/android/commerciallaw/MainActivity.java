package com.example.android.commerciallaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnCorp;
    public Button btnSec;
    public Button btnAcc;
    public Button btnSec2;

    public void init(){
        btnCorp = (Button)findViewById(R.id.btnCorp);
        btnCorp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy  = new Intent(MainActivity.this, Corp.class);
                startActivity(toy);
            }
        });
    }

    public void sec(){
        btnSec = (Button)findViewById(R.id.btnSec);
        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intSec  = new Intent(MainActivity.this, Sec.class);
                startActivity(intSec);
            }
        });
    }

    public void acc(){
        btnAcc = (Button)findViewById(R.id.btnAcc);
        btnAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intAcc  = new Intent(MainActivity.this, Acc.class);
                startActivity(intAcc);
            }
        });
    }

    public void sec2(){
        btnSec2 = (Button)findViewById(R.id.btnSec2);
        btnSec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intSec2  = new Intent(MainActivity.this, Sec2.class);
                startActivity(intSec2);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        sec();
        acc();
        sec2();

    }

}

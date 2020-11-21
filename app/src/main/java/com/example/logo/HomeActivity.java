package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class HomeActivity extends AppCompatActivity {

    Button omir, audar;
    Button olen, qara;
    Button jana;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        omir = findViewById(R.id.omir);
        audar = findViewById(R.id.audar);
        olen = findViewById(R.id.olen);
        qara = findViewById(R.id.qara);
        jana = findViewById(R.id.jana);


        olen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(HomeActivity.this, olender.class);
                startActivity(intent);
            }
        });

        audar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(HomeActivity.this, qosymsha.class);
                startActivity(intent);
            }
        });
        omir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(HomeActivity.this, Omirbayan.class);
                startActivity(intent);
            }
        });
        qara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(HomeActivity.this, QaraSozder.class);
                startActivity(intent);

            }
        });
        jana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(HomeActivity.this, Janalyktar.class);
                startActivity(intent);

            }
        });
    }
}
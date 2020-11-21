package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class olender extends AppCompatActivity {
    Button mahabbat,din;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olender);

        mahabbat = findViewById(R.id.mahabbat);
        din=findViewById(R.id.din);


        mahabbat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(olender.this, Mahabbat.class);
                startActivity(intent);
            }
        });
    }
}
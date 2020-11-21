package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QaraSozder extends AppCompatActivity {
    Button bir, eki;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bir = findViewById(R.id.bir);
        eki = findViewById(R.id.eki);

        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(QaraSozder.this,
                        irinshisi.class);
                startActivity(intent);
            }
        });
    }
}
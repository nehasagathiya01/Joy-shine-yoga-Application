package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Yogalist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogalist);

        final Button button7= (Button)  findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),surya_namaskar.class);
                startActivity(i);

            }
        });

        final Button button8= (Button)  findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Dhanurasan.class);
                startActivity(i);

            }
        });

        final Button button9= (Button)  findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Gaumukhasana.class);
                startActivity(i);

            }
        });
        final Button button10= (Button)  findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Shavasan.class);
                startActivity(i);

            }
        });
        final Button button11= (Button)  findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Trikonasan.class);
                startActivity(i);

            }
        });
        final Button button12= (Button)  findViewById(R.id.button12);

        button12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Chakrasan.class);
                startActivity(i);

            }
        });

        final Button button13= (Button)  findViewById(R.id.button13);

        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),bhujangasan.class);
                startActivity(i);

            }
        });
    }
}
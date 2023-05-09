package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class meditationlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditationlist);

        final Button button14= (Button)  findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),padmasana.class);
                startActivity(i);

            }
        });

        final Button button15= (Button)  findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),sukhasana.class);
                startActivity(i);

            }
        });

        final Button button16= (Button)  findViewById(R.id.button16);

        button16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),siddhasana.class);
                startActivity(i);

            }
        });
        final Button button17= (Button)  findViewById(R.id.button17);

        button17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),vajrasana.class);
                startActivity(i);

            }
        });
        final Button button18= (Button)  findViewById(R.id.button18);

        button18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),swastikasana.class);
                startActivity(i);

            }
        });
        final Button button19= (Button)  findViewById(R.id.button19);

        button19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),bhadrasana.class);
                startActivity(i);

            }
        });

        final Button button20= (Button)  findViewById(R.id.button20);

        button20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),samasana.class);
                startActivity(i);

            }
        });
    }
}
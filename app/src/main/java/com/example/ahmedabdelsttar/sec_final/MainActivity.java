package com.example.ahmedabdelsttar.sec_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ahmedabdelsttar.sec_final.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1= (Button) findViewById(R.id.bokl);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(MainActivity.this,courses.class);

                mintent.putExtra("number",1);

                startActivity(mintent);
            }
        });


        Button button2= (Button) findViewById(R.id.proof);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(MainActivity.this,courses.class);

                mintent.putExtra("number",2);

                startActivity(mintent);
            }
        });



        Button button3= (Button) findViewById(R.id.exp_ministry);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(MainActivity.this,courses.class);

                mintent.putExtra("number",3);
                startActivity(mintent);
            }
        });

        Button button4= (Button) findViewById(R.id.past_exam);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(MainActivity.this,courses.class);

                mintent.putExtra("number",4);

                startActivity(mintent);
            }
        });

        Button button5= (Button) findViewById(R.id.sudan_exam);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(MainActivity.this,courses.class);

                mintent.putExtra("number",5);

                startActivity(mintent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }



}

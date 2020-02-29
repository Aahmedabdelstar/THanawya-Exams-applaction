package com.example.ahmedabdelsttar.sec_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ahmed Abdelsttar on 14/04/2017.
 */
public class courses extends AppCompatActivity {


    public int num;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);



        Button biolog= (Button) findViewById(R.id.biology);
        Button geolog= (Button) findViewById(R.id.geology);
        Button chimstr= (Button) findViewById(R.id.chemistry);
        Button arabi= (Button) findViewById(R.id.Arabic);
        Button frenc= (Button) findViewById(R.id.French);
        Button englis= (Button) findViewById(R.id.English);
        Button geograph= (Button) findViewById(R.id.geography);

        Button histor= (Button) findViewById(R.id.history);
        Button math1= (Button) findViewById(R.id.math1);
        Button math2= (Button) findViewById(R.id.math2);
        Button physic= (Button) findViewById(R.id.physics);
        Button philo= (Button) findViewById(R.id.philos);
        Button psych= (Button) findViewById(R.id.psych);
        Button sudan_2017= (Button) findViewById(R.id.sud_2017);


        Intent intent = getIntent();
        num = intent.getExtras().getInt("number");

        if(num==5)
        {
            sudan_2017.setVisibility(View.VISIBLE);

        }


        biolog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                     intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proof_instead.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",1);
                startActivity(intent);

            }
        });

        geolog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");
                if(num==1) {
                   intent = new Intent(courses.this, bokolit.class);

                }
                else if(num==2) {
                   intent = new Intent(courses.this, proof_instead.class);

                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);
                }

                intent.putExtra("number",2);
                startActivity(intent);

            }
        });

        chimstr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");
                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);

                }
                else if(num==2) {
                    intent = new Intent(courses.this, proof_instead.class);

                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);
                }

                intent.putExtra("number",3);
                startActivity(intent);

            }
        });

        arabi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proofExam.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",4);
                startActivity(intent);

            }
        });


        frenc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proofExam.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",5);
                startActivity(intent);

            }
        });

        englis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proofExam.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",6);
                startActivity(intent);

            }
        });

        geograph.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proofExam.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",7);
                startActivity(intent);

            }
        });

        histor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proofExam.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",8);
                startActivity(intent);

            }
        });

        math1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proofExam.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",9);
                startActivity(intent);

            }
        });

        math2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proofExam.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",10);
                startActivity(intent);

            }
        });

        physic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proof_instead.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",11);
                startActivity(intent);

            }
        });

        philo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proof_instead.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",12);
                startActivity(intent);

            }
        });

        psych.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                if(num==1) {
                    intent = new Intent(courses.this, bokolit.class);
                }
                else if(num==2) {
                    intent = new Intent(courses.this, proof_instead.class);
                }
                else if(num==3) {
                    intent = new Intent(courses.this, expe_Exam.class);
                }
                else if(num==4) {
                    intent = new Intent(courses.this, pastExam.class);

                }
                else if(num==5) {
                    intent = new Intent(courses.this, sudanExam.class);

                }
                intent.putExtra("number",13);
                startActivity(intent);

            }
        });

        sudan_2017.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                num = intent.getExtras().getInt("number");

                intent = new Intent(courses.this, sudan_2017.class);
                startActivity(intent);

            }
        });


    }


}

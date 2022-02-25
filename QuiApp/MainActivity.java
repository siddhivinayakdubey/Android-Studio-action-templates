package com.example.quiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String[] questions ={"Iron Man was the first film in the MCU.","Ho Yinsen is secretly the leader of a Ten Rings cell.","Don Cheadle was replaced by Terrence Howard as Rhodey.","Howard Stark, Tony Stark's father, created Captain America's shield using vibranium.","The Hulk's first movie appearance was outside of the MCU.","Nick Fury makes a cameo in The Incredible Hulk to ask Bruce if he wants to join the Avengers.","Erik \"Killmonger\" Stevens' real name is N'Jadaka.","The Jabari tribe worships the panther god, Bast."};
    public final boolean[] answer ={true,false,false,true,true,false,true,false};


    private int score=0;
    private int index=0;

    private TextView quest;
    private TextView sc;

    Button truebtn;
    Button falsebtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quest=findViewById(R.id.questions);
        sc=findViewById(R.id.score);
        truebtn=findViewById(R.id.truebtn);
        falsebtn=findViewById(R.id.falsebtn);

        quest.setText(questions[index]);

        truebtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(index==questions.length){
                    Toast.makeText(MainActivity.this, "arey bhai kyu pareshaan hora hai?", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(answer[index]){
                        score+=1;
                        index+=1;
                        if(index==questions.length){
                            Toast.makeText(MainActivity.this, "Rukja bhai", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            quest.setText(questions[index]);
                            sc.setText("Your score is: " + score);
                        }
                    }
                    else{
                        index+=1;
                        if(index==questions.length){
                            Toast.makeText(MainActivity.this, "Rukja bhai", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            quest.setText(questions[index]);
                            sc.setText("Your score is: " + score);
                        }

                    }

                }

            }
        });

        falsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index==questions.length){
                    Toast.makeText(MainActivity.this, "arey bhai kyu pareshaan hora hai?", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(!answer[index]){
                        score+=1;
                        index+=1;
                        if(index==questions.length){
                            Toast.makeText(MainActivity.this, "Rukja bhai", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            quest.setText(questions[index]);
                            sc.setText("Your score is: " + score);
                        }
                    }
                    else{
                        index+=1;
                        if(index==questions.length){
                            Toast.makeText(MainActivity.this, "Rukja bhai", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            quest.setText(questions[index]);
                            sc.setText("Your score is: " + score);
                        }

                    }

                }
            }
        });


    }
}
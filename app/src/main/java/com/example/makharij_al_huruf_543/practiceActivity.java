package com.example.makharij_al_huruf_543;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class practiceActivity extends AppCompatActivity {


    String question,answer;
    String[][] QnA_Array={
            {"Halqiyah Sound Produced from End of Throat",       "أ ہ","غ خ","ق","ک"},
            {"Halqiyah Sound Produced from Middle of Throat",    "أ ہ" ,"غ خ","ق","ع ح"},
            {"Halqiyah Sound Produced from Start of Throat",     "ق","ع ح","أ ہ","غ خ"},
            {"Lahatiyah Sound Produced from Base of Tongue which is near Uvula touching the mouth roof",       "أ ہ","غ خ","ق","ک"},
            {"Lahatiyah Sound Produced from Portion of Tongue near its base touching the roof of mouth",       "غ خ","ق","ع ح","ک"},
    };
    String[] A={
            "أ ہ","ع ح","غ خ","ق","ک"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        Random rand=new Random();
        int rand_num= rand.nextInt(5);
        TextView textView= findViewById(R.id.questionID);
        textView.setText(QnA_Array[rand_num][0]);

        RadioButton op1btn= findViewById(R.id.op1ID);
        RadioButton op2btn= findViewById(R.id.op2ID);
        RadioButton op3btn= findViewById(R.id.op3ID);
        RadioButton op4btn= findViewById(R.id.op4ID);
        op1btn.setText(QnA_Array[rand_num][1]);
        op2btn.setText(QnA_Array[rand_num][2]);
        op3btn.setText(QnA_Array[rand_num][3]);
        op4btn.setText(QnA_Array[rand_num][4]);

    }

    public void nextQuestion(View view){
        Intent intent = new Intent(this, practiceActivity.class);
        startActivity(intent);
    }




}
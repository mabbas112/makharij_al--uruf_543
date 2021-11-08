package com.example.makharij_al_huruf_543;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class examActivity extends AppCompatActivity {
    String question,answer;
    int rand_num=0,count=0;
    String[][] QnA_Array={
            {"Halqiyah Sound Produced from End of Throat",       "أ ہ","غ خ","ق","ک"},
            {"Halqiyah Sound Produced from Middle of Throat",    "أ ہ" ,"غ خ","ق","ع ح"},
            {"Tarfiyah Sound Produced from Rounded tip of the tongue touching the base of the frontal 6 teeth",    "أ ہ" ,"غ خع ح","None" ,"ن"},
            {"Halqiyah Sound Produced from Start of Throat",     "ق","ع ح","أ ہ","غ خ"},
            {"Lahatiyah Sound Produced from Base of Tongue which is near Uvula touching the mouth roof",       "أ ہ","غ خ","ق","ک"},
            {"Lahatiyah Sound Produced from Portion of Tongue near its base touching the roof of mouth",       "غ خ","ق","ع ح","ک"},
            {"Shajariyah-Haafiyah Sound Produced from Tongue touching the center of the mouth roof",       " خ","ج ش ی","عح","ک"},
            {"Shajariyah-Haafiyah Sound Produced from One side of the tongue touching the molar teeth",       " خ","ج ی","ض","ک"},
            {"Tarfiyah Sound Produced from Rounded tip of the tongue touching the base of the frontal 8 teeth",  "ل","ج ی","ض","ک"},
            {"Tarfiyah Sound Produced from Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth", "ر","ج ی","ض","ک"},
    };
    String[] A={
            "أ ہ","ع ح","ن","غ خ","ق","ک","ج ش ی","ض","ل","ر"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam_activity);
        if(count<=5) {
            Random rand = new Random();
            rand_num = rand.nextInt(5);
            TextView textView = findViewById(R.id.questionID);
            textView.setText(QnA_Array[rand_num][0]);

            RadioButton op1btn = findViewById(R.id.op1ID);
            RadioButton op2btn = findViewById(R.id.op2ID);
            RadioButton op3btn = findViewById(R.id.op3ID);
            RadioButton op4btn = findViewById(R.id.op4ID);
            op1btn.setText(QnA_Array[rand_num][1]);
            op2btn.setText(QnA_Array[rand_num][2]);
            op3btn.setText(QnA_Array[rand_num][3]);
            op4btn.setText(QnA_Array[rand_num][4]);
        }else{
            finalScoreActivity();
        }
    }
    public void nextQuestion(View view){
        Intent intent = new Intent(this, examActivity.class);
        startActivity(intent);
    }
    public void finalScoreActivity(){
        Intent intent = new Intent(this, examActivity.class);
        startActivity(intent);
    }

    RadioButton opbtn;
    String choice;
    public void btn1Click(View view){
        opbtn= findViewById(R.id.op1ID);
        choice = opbtn.getText().toString();
        choiceColorChange(choice);
    }
    public void btn2Click(View view){
        opbtn= findViewById(R.id.op3ID);
        choice = opbtn.getText().toString();
        choiceColorChange(choice);
    }
    public void btn3Click(View view){
        opbtn= findViewById(R.id.op3ID);
        choice = opbtn.getText().toString();
        choiceColorChange(choice);
    }
    public void btn4Click(View view){
        opbtn= findViewById(R.id.op4ID);
        choice = opbtn.getText().toString();
        choiceColorChange(choice);
    }
    void choiceColorChange(String choice){
        if(choice.equals(A[rand_num]))
            opbtn.setTextColor(Color.parseColor("#00FF00"));
        else
            opbtn.setTextColor(Color.parseColor("#FF0000"));
    }

}
package com.example.makharij_al_huruf_543;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class finalScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        Intent intent = getIntent();

        int count = intent.getIntExtra("count",0);
        int right = intent.getIntExtra("right",1);

        TextView textView= findViewById(R.id.textViewID);
        textView.setText(right + "/" + count);
        if(right>(count/2)){
            textView.setText("\n Congratulations");
        }
        else{
            textView.setText("\n Sad Try Again");
        }
    }
    public void shareBtnFunction(View view){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}
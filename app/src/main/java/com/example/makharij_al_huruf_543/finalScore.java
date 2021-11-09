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
        if(right>(count/2)){
            textView.setText("\n Congratulations\n\n Gain ("+ right + ") / Total (" + count+")");
        }
        else{
            textView.setText("\n Don't give up! Try Again.\n\n Gain ("+ right + ") / Total (" + count+")");
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
    public void backMainActivity(View view){
        Intent intent = new Intent(finalScore.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
package com.example.makharij_al_huruf_543;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openLink(View view) {
        // Repository link
        Intent repoLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/mabbas112/makharij_al--uruf_543"));
        startActivity(repoLink);
    }
    public void practice_activity_open(View view) {
        Intent intent = new Intent(MainActivity.this, practiceActivity.class);
        startActivity(intent);
    }
    public void exam_activity_open(View view) {
        Intent intent = new Intent(MainActivity.this, examActivity.class);
        startActivity(intent);
    }

}
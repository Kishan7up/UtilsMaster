package com.dhruveni.utilmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class InstaGramEditor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_gram_editor);

        Toast.makeText(this, "Helllooooo", Toast.LENGTH_SHORT).show();
    }
}
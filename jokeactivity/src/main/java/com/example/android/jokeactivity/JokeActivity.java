package com.example.android.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public final static String JOKE_INTENT_KEY = "supplied_joke";
    public final static String JOKE_PREF_KEY = "joke_pref_key";
    private String joke;
    TextView jokeTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        joke = getIntent().getStringExtra(JOKE_INTENT_KEY);
        jokeTextView = (TextView) findViewById(R.id.joke_textview);
        jokeTextView.setText(joke);
    }
}

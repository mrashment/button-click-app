package com.gmail.masonashment.buttonclickapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button button;
    private TextView textView;
    private static final String TAG = "MainActivity";
    private final String TEXT_CONTENTS = "TextContents";


    //called automatically when you run the app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in here");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning variables to Views in activity_main.xml
        userInput = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        //clearing and adding scrolling capabilities
        userInput.setText("");
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());

        //listener for the button
        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();
                result += "\n";
                textView.append(result);
                userInput.setText("");
            }
        };
        button.setOnClickListener(ourOnClickListener);
        Log.d(TAG, "onCreate: out");
    } //onCreate

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: in");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: in");
        super.onRestoreInstanceState(savedInstanceState);
        String savedString = savedInstanceState.getString(TEXT_CONTENTS);
        textView.setText(savedString);
        Log.d(TAG, "onRestoreInstanceState: out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: in");
        super.onResume();
        Log.d(TAG, "onResume: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: in");
        outState.putString(TEXT_CONTENTS, textView.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: in");
        super.onDestroy();
        Log.d(TAG, "onDestroy: out");
    }
} //MainActivity










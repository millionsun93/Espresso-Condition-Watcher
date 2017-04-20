package com.quanlt.conditionwatcher;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mSubmitButton;
    private EditText mEmailEditText;
    private TextView mGreetingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSubmitButton = (Button) findViewById(R.id.button_submit);
        mEmailEditText = (EditText) findViewById(R.id.edit_email);
        mGreetingTextView = (TextView) findViewById(R.id.text_greeting);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mGreetingTextView.setText("Hello " + mEmailEditText.getText().toString());
                    }
                }, 1500);
            }
        });
    }
}

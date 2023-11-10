package com.example.petproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mText;

    int clickCount = MainVM.getCount();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = findViewById(R.id.button);
        mText = findViewById(R.id.textView);

        mText.setText( MainVM.getCount() == 0 ? "Empty" :  String.valueOf(MainVM.getCount()));

        mButton.setOnClickListener(view -> {
            MainVM.setCount(++clickCount);

            mText.setText( String.valueOf(MainVM.getCount()));
            Log.d("test", "MainVM.getCount()=" + MainVM.getCount());
        });
    }
}
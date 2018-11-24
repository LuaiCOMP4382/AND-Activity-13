package com.example.sumactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        TextView mTextViewSumResult = findViewById(R.id.tv_sum_result);

        Intent i = getIntent();

        if (i != null)
            mTextViewSumResult.setText(String.valueOf(i.getFloatExtra("sum_result", 0f)));

    }
}

package com.example.luai.andactivity13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.sumactivity.SumActivity;
import com.example.sumer.Sumer;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextNumber1;
    private EditText mEditTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextNumber1 = findViewById(R.id.et_number_1);
        mEditTextNumber2 = findViewById(R.id.et_number_2);

    }

    public void openSumActivity(View view) {

        float float1 = Float.parseFloat(mEditTextNumber1.getText().toString());
        float float2 = Float.parseFloat(mEditTextNumber2.getText().toString());

        float floatSum = Sumer.sum(float1, float2);

        Intent i = new Intent(this, SumActivity.class);
        i.putExtra("sum_result", floatSum);
        startActivity(i);

    }

}

package com.example.home12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Number1;
    private EditText Number2;
    private Button Sum1;
    private TextView Result1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1 = (EditText)findViewById(R.id.Num1);
        Number2 = (EditText)findViewById(R.id.Num2);
        Sum1 = (Button)findViewById(R.id.Sum12);
        Result1 = (TextView)findViewById(R.id.Answer1);

        Sum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Number1.getText().toString());
                int number2 = Integer.parseInt(Number2.getText().toString());
                int Sum1 = number1 + number2;
                Result1.setText("Result: "+Sum1);
            }
        });
    }
}
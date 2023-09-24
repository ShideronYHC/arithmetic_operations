package com.example.arithmeticoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button_calculate = findViewById(R.id.CalculateButton);
        TextView sum = findViewById(R.id.SummationField);
        TextView sub = findViewById(R.id.SubtractionField);
        TextView mul = findViewById(R.id.MultiplicationField);
        TextView div = findViewById(R.id.DivisionField);

        EditText number_First = findViewById(R.id.FirstNumberInput);
        EditText number_Second = findViewById(R.id.SecondNumberInput);



        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstString = number_First.getText().toString();
                String secondString = number_Second.getText().toString();

                Float first = Float.parseFloat(firstString);
                Float second = Float.parseFloat(secondString);
                Float resultSum = first + second;
                Float resultSub = first - second;
                Float resultMul = first * second;
                Float resultDiv = first / second;

                sum.setText(resultSum.toString());
                sub.setText(resultSub.toString());
                mul.setText(resultMul.toString());
                div.setText(resultDiv.toString());
            }
        });
    }
}
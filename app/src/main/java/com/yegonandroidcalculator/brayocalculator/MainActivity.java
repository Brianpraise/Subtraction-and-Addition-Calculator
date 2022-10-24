package com.yegonandroidcalculator.brayocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addBtn, subBtn;
    EditText num1, num2;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (Button) findViewById(R.id.ADD);
        subBtn = (Button) findViewById(R.id.SUB);

        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);

        results = (TextView) findViewById(R.id.result);
        results.setText("");

        //sum
        addBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                int addition;
                   try {
                       addition= Sum(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                       results.setText("Results is " + addition);
                   }catch (Exception e){
                     results.setText((CharSequence) num1);
                   }
            }
        });

        //sub
        subBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                //results
                int subs;
                try {
                    subs = Sub(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                    results.setText("Results is " + subs);
                }catch (Exception e){
                    results.setText((CharSequence) num1);
                }
            }
        });
    }

    //sum
    int Sum(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    //sub
    int Sub(int num1, int num2)
    {
        int sub = num1 - num2;
        return sub;
    }

}
package com.example.jdcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    double op1 = 0, op2 = 0;
    char operation;
    EditText input1, input2;
    TextView output;
    Button plus, minus, multi, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.et_input1);
        input2 = (EditText) findViewById(R.id.et_input2);
        output = (TextView) findViewById(R.id.et_output);
     
        plus = (Button) findViewById(R.id.button_plus);
        minus = (Button) findViewById(R.id.button_minus);
        multi = (Button) findViewById(R.id.button_multi);
        divide = (Button) findViewById(R.id.button_div);
 
        plus.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        multi.setOnClickListener(listener);
        divide.setOnClickListener(listener);


    }


    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
       
            String inputText1 = input1.getText().toString();
            String inputText2 = input2.getText().toString();
            op1 = Double.valueOf(inputText1);
            op2 = Double.valueOf(inputText2);
            switch (v.getId()) {
                case R.id.button_div:
                case R.id.button_multi:
                case R.id.button_minus:
                case R.id.button_plus:
                    operation = ((Button) v).getText().toString().charAt(0);
                    dealEqual(operation, op1, op2);
                    break;
            }
        }
    };
   public void dealEqual(char ch, double op1, double op2) {

            if (ch == '+')
                op1 += op2;
            else if (ch == '-')
                op1 -= op2;
            else if (ch == '*')
                op1 *= op2;
            else if (ch == '/')
                op1 /= op2;
            output.setText(String.valueOf(op1));
        }
    }





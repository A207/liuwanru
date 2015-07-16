package com.example.newcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity{
    double op1=0,op2=0;
    char operation;
    EditText input;
    boolean isInputChar=false;
    Button plus,minus,multi,divide,equal;
    Button cleanAll, back,point,sign;
    Button[] btn=new Button[11];
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(EditText)findViewById(R.id.et_input);
        plus=(Button)findViewById(R.id.button_plus);
        minus=(Button)findViewById(R.id.button_minus);
        multi=(Button)findViewById(R.id.button_multi);
        divide=(Button)findViewById(R.id.button_div);
        equal=(Button)findViewById(R.id.button_equal);
        back=(Button)findViewById(R.id.button_bk);
        cleanAll=(Button)findViewById(R.id.button_c);
        back.setOnClickListener(listener);
        plus.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        multi.setOnClickListener(listener);
        divide.setOnClickListener(listener);
        equal.setOnClickListener(listener);
        cleanAll.setOnClickListener(listener);
        btn[0]=(Button)findViewById(R.id.button_0);
        btn[1]=(Button)findViewById(R.id.button_1);
        btn[2]=(Button)findViewById(R.id.button_2);
        btn[3]=(Button)findViewById(R.id.button_3);
        btn[4]=(Button)findViewById(R.id.button_4);
        btn[5]=(Button)findViewById(R.id.button_5);
        btn[6]=(Button)findViewById(R.id.button_6);
        btn[7]=(Button)findViewById(R.id.button_7);
        btn[8]=(Button)findViewById(R.id.button_8);
        btn[9]=(Button)findViewById(R.id.button_9);
        btn[10]=(Button)findViewById(R.id.button_00);
        for(int i=0;i<11;i++){
            btn[i].setOnClickListener(listener);
        }
        point=(Button)findViewById(R.id.button_point);
        point.setOnClickListener(listener);
        sign=(Button)findViewById(R.id.button_sign);
        sign.setOnClickListener(listener);
    }



    private OnClickListener listener=new OnClickListener(){
        public void onClick(View v) {
            String inputText=input.getText().toString();
            switch(v.getId()){
                case R.id.button_bk:
                    if(inputText.length()>1)
                        input.setText(inputText.substring(0, inputText.length()-1));
                    else if(inputText.length()==1){
                        input.setText("0");
                    }
                    if(input.getText().toString().compareTo("-")==0){
                        input.setText("0");
                    }
                    break;

                case R.id.button_c:
                    input.setText("0");
                    op1=0;
                    op2=0;
                    isInputChar=false;
                    break;

                case R.id.button_point:
                    boolean nopoint=(inputText.indexOf(".")==-1);
                    if(nopoint)
                        input.append(".");
                    break;

                case R.id.button_sign:
                    try{
                        double data=Double.parseDouble(inputText);
                        if(data!=0){
                            data=data*(-1);
                            input.setText(String.valueOf(data));
                        }
                        else
                            input.setText("-");
                    }catch(NumberFormatException err){
                        input.setText("!!!!!");
                    }
                    break;

                case R.id.button_div:
                case R.id.button_multi:
                case R.id.button_minus:
                case R.id.button_plus:
                    operation=((Button)v).getText().toString().charAt(0);
                    isInputChar=true;
                    op1=Double.valueOf(inputText);
                    input.setText(" ");
                    break;

                case R.id.button_equal:
                    op2=Double.valueOf(inputText);
                    dealEqual(operation,op1,op2);
                    break;

                default:
                    String num=((Button)v).getText().toString();
                    if(inputText.length()==1){
                        if(inputText.compareTo("0")==0)
                            input.setText(num);
                        else
                            input.append(num);
                    }
                    else
                        input.append(num);
                    break;
            }
        }
    };



    public void dealEqual(char ch,double op1,double op2){
        if(isInputChar){
            if(ch=='+')
                op1+=op2;
            else if(ch=='-')
                op1-=op2;
            else if(ch=='*')
                op1*=op2;
            else if(ch=='/')
                op1/=op2;
        }
        input.setText(String.valueOf(op1));
    }

}


package com.example.testactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.testactivity.Eval.eval;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button button_clear;
    Button button_mult;
    Button button_sum;
    Button button_sub;
    Button button_div;
    Button button_eq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.expression);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_sum = (Button) findViewById(R.id.button_sum);
        button_clear = (Button) findViewById(R.id.button_clear);
        button_sub = (Button) findViewById(R.id.button_sub);
        button_div = (Button) findViewById(R.id.button_div);
        button_mult = (Button) findViewById(R.id.button_mult);
        button_eq = (Button) findViewById(R.id.button_eq);

        editText.setFocusableInTouchMode(false);
        editText.setFocusable(false);

    }

    @SuppressLint("SetTextI18n")
    public void _1(View view) {
        editText.setText(editText.getText() + "1");
    }
    @SuppressLint("SetTextI18n")
    public void _2(View view) {
        editText.setText(editText.getText() + "2");
    }
    @SuppressLint("SetTextI18n")
    public void _3(View view) {
        editText.setText(editText.getText() + "3");
    }
    @SuppressLint("SetTextI18n")
    public void _4(View view) {
        editText.setText(editText.getText() + "4");
    }
    @SuppressLint("SetTextI18n")
    public void _5(View view) {
        editText.setText(editText.getText() + "5");
    }
    @SuppressLint("SetTextI18n")
    public void _6(View view) {
        editText.setText(editText.getText() + "6");
    }
    @SuppressLint("SetTextI18n")
    public void _7(View view) {
        editText.setText(editText.getText() + "7");
    }
    @SuppressLint("SetTextI18n")
    public void _8(View view) {
        editText.setText(editText.getText() + "8");
    }
    @SuppressLint("SetTextI18n")
    public void _9(View view) {
        editText.setText(editText.getText() + "9");
    }
    @SuppressLint("SetTextI18n")
    public void _0(View view) {
        editText.setText(editText.getText() + "0");
    }
    @SuppressLint("SetTextI18n")
    public void _sum(View view) {
        editText.setText(editText.getText() + "+");
    }
    @SuppressLint("SetTextI18n")
    public void _sub(View view) {
        editText.setText(editText.getText() + "-");
    }
    @SuppressLint("SetTextI18n")
    public void _mult(View view) {
        editText.setText(editText.getText() + "*");
    }
    @SuppressLint("SetTextI18n")
    public void _div(View view) {
        editText.setText(editText.getText() + "/");
    }
    @SuppressLint("SetTextI18n")
    public void _clear(View view) {
        editText.setText("");
    }
    @SuppressLint("SetTextI18n")
    public void _eq(View view) {
        editText.setText(Double.toString(eval(editText.getText().toString())));
    }

}
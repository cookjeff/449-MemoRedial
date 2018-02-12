package com.example.memoredial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainDialActivity extends AppCompatActivity {

    PhoneNumberHelper phoneNum;
    TextView numberText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dial);
        phoneNum = new PhoneNumberHelper();
        numberText = findViewById(R.id.numberText);
    }

    private void updateNumber() {
        numberText.setText(phoneNum.toString());
    }

    public void click1(View v) {
        phoneNum.addNumber(1);
        updateNumber();
    }

    public void click2(View v) {
        phoneNum.addNumber(2);
        updateNumber();
    }

    public void click3(View v) {
        phoneNum.addNumber(3);
        updateNumber();
    }

    public void click4(View v) {
        phoneNum.addNumber(4);
        updateNumber();
    }

    public void click5(View v) {
        phoneNum.addNumber(5);
        updateNumber();
    }

    public void click6(View v) {
        phoneNum.addNumber(6);
        updateNumber();
    }

    public void click7(View v) {
        phoneNum.addNumber(7);
        updateNumber();
    }
    public void click8(View v) {
        phoneNum.addNumber(8);
        updateNumber();
    }

    public void click9(View v) {
        phoneNum.addNumber(9);
        updateNumber();
    }

    public void click0(View v) {
        phoneNum.addNumber(0);
        updateNumber();
    }


}

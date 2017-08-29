package com.example.shoppingcarty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView priceTextView;
    TextView countTextView;
    TextView totalTextView;
    TextView roubleTextView;
    TextView totalNumberView;

    EditText priceEditText;
    EditText countEditText;

    FrameLayout keyboardFrame;

    Button numberButton1;
    Button numberButton2;
    Button numberButton3;
    Button numberButton4;
    Button numberButton5;
    Button numberButton6;
    Button numberButton7;
    Button numberButton8;
    Button numberButton9;
    Button numberButton0;
    Button clearButton;
    Button dotButton;
    Button enterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceTextView = (TextView) findViewById(R.id.priceTextView);
        countTextView = (TextView) findViewById(R.id.countTextView);
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        roubleTextView = (TextView) findViewById(R.id.roubleTextView);
        totalNumberView = (TextView) findViewById(R.id.totalNumberView);

        countEditText = (EditText) findViewById(R.id.countEditText);

        priceEditText = (EditText) findViewById(R.id.priceEditText);

        keyboardFrame = (FrameLayout) findViewById(R.id.keyboardFrame);

        numberButton1 = (Button) findViewById(R.id.numberButton1);
        numberButton2 = (Button) findViewById(R.id.numberButton2);
        numberButton3 = (Button) findViewById(R.id.numberButton3);
        numberButton4 = (Button) findViewById(R.id.numberButton4);
        numberButton5 = (Button) findViewById(R.id.numberButton5);
        numberButton6 = (Button) findViewById(R.id.numberButton6);
        numberButton7 = (Button) findViewById(R.id.numberButton7);
        numberButton8 = (Button) findViewById(R.id.numberButton8);
        numberButton9 = (Button) findViewById(R.id.numberButton9);
        numberButton0 = (Button) findViewById(R.id.numberButton0);
        clearButton = (Button) findViewById(R.id.clearButton);
        dotButton = (Button) findViewById(R.id.dotButton);
        enterButton = (Button) findViewById(R.id.enterButton);







    }
}

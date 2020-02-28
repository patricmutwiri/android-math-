package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnExit;
    private Button add;
    private Button subtract;
    private TextView output;
    public TextView fnumber;
    public TextView snumber;
    double number1 = 0.0;
    double number2 = 0.0;
    double results;
    String msg = "Simple Math : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnumber = (EditText) findViewById(R.id.editText);
        snumber = (EditText) findViewById(R.id.editText2);
        // output label
        output = findViewById(R.id.textView4);

        // add event
        add = findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(fnumber.getText().toString());
                number2 = Float.parseFloat(snumber.getText().toString());
                results = number1+number2;
                output.setText(""+results+"");
                Log.v(msg,"Addition Results "+results);
            }
        });

        // subtract
        subtract = findViewById(R.id.button2);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(fnumber.getText().toString());
                number2 = Float.parseFloat(snumber.getText().toString());
                results = number1-number2;
                output.setText(""+results+"");
                Log.v(msg,"Subtraction Results "+results);
            }
        });

        // exit event
        btnExit = findViewById(R.id.button3);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(msg,"Exit now");
                finish();
            }
        });
    }
}

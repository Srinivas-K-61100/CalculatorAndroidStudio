package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText ent1;
    private EditText ent2;
    private EditText entresult;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ent1 = (EditText) findViewById(R.id.ent1);
        ent2 = (EditText) findViewById(R.id.ent2);
        entresult = (EditText)  findViewById(R.id.entresult);
    }

    public void btnadd(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int sum = n1 + n2;
        entresult.setText(String.valueOf(sum));
    }

    public void btnsub(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int sub = n1 - n2;
        entresult.setText(String.valueOf(sub));
    }

    public void btnmul(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int mul = n1 * n2;
        entresult.setText(String.valueOf(mul));
    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(ent1.getText().toString());
        int n2 = Integer.parseInt(ent2.getText().toString());
        int div = n1 / n2;
        entresult.setText(String.valueOf(div));
    }
}
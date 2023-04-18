package com.example.ex_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Click(View view) {
        EditText vis = findViewById(R.id.visota);
        EditText osn = findViewById(R.id.osnovanie);
        TextView text = findViewById(R.id.textView);
        double visota = Double.parseDouble(vis.getText().toString());
        double osnovaanie = Double.parseDouble(osn.getText().toString());
        double result = visota * osnovaanie / 2;
        text.setText(Double.toString(result));
        vis.setText("");
        osn.setText("");
    }
}


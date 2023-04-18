package com.example.ex_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    String true_password = "12345";
    String true_username = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_click (View view){
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Button button = (Button) view;
        if(true_password.equals(password.getText().toString()) && true_username.equals(username.getText().toString())){
            username.setText("Успешная авторизация");
            password.setText("");
        }
        else{
            button.setText("Неправильный логин или пароль");
        }
    }
    public void Next(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}
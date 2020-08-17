package com.umang.umangsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText etPass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.username);
        etPass = findViewById(R.id.pwd);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=editText.getText().toString().trim();
                String password=etPass.getText().toString();
                Intent intent=new Intent(MainActivity.this,Welcomepage.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });
    }
}
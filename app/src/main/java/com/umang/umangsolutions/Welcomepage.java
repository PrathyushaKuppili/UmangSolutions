package com.umang.umangsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcomepage extends AppCompatActivity {

    TextView text;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        text=findViewById(R.id.text);
        back=findViewById(R.id.back);
        Intent intent=getIntent();
        String data=intent.getStringExtra("username");
        String datapwd=intent.getStringExtra("password");
        text.setText(" Your Username"+data+"Your Password"+datapwd);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Welcomepage.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
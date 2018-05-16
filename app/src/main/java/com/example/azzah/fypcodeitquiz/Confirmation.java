package com.example.azzah.fypcodeitquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    Button btnLog;
    TextView tvHeader1, tvHeader2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_page);
        tvHeader1 = (TextView) findViewById(R.id.tvHeader);
        tvHeader2 = (TextView) findViewById(R.id.tvHeader2);
        btnLog = (Button) findViewById(R.id.btnLog);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Confirmation.this, Login.class);
                startActivity(intent);
            }
        });


    }
}

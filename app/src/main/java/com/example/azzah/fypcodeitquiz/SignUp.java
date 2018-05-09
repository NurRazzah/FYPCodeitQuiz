package com.example.azzah.fypcodeitquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {


    TextView tvTitle, tvTitle2;
    Button btnCreate, btnSignUp;
    EditText editTextUser, editTextPassword, editTextEmail, editTextConfirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        tvTitle2 = (TextView)findViewById(R.id.tvTitle2);
        btnCreate = (Button)findViewById(R.id.btnCreate);
        editTextConfirm = (EditText)findViewById(R.id.etConfirm);
        editTextEmail =(EditText)findViewById(R.id.etEmail);
        editTextEmail = (EditText)findViewById(R.id.etEmail);
        editTextUser = (EditText)findViewById(R.id.etUserName);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this, Confirmation.class);
                startActivity(intent);
            }
        });



    }
}


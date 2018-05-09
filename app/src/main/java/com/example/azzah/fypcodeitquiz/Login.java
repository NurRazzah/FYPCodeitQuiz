package com.example.azzah.fypcodeitquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

   Button login;
   EditText editName, editPassword;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = (Button)findViewById(R.id.button);
        editName=(EditText)findViewById(R.id.editText1);
        editPassword=(EditText)findViewById(R.id.editText2);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}

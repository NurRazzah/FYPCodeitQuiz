package com.example.azzah.fypcodeitquiz;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {


    TextView tvTitle, tvTitle2;
    Button btnCreate, btnSignUp;
    EditText editTextUser, editTextPassword, editTextEmail, editTextConfirm;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvTitle2 = (TextView) findViewById(R.id.tvTitle2);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        editTextUser = (EditText) findViewById(R.id.etUserName);
        editTextConfirm = (EditText) findViewById(R.id.etConfirm);
        editTextEmail = (EditText) findViewById(R.id.etEmail);
        editTextPassword = (EditText) findViewById(R.id.etPass);

        mAuth = FirebaseAuth.getInstance();
//        progressDialog = new progressDialog(this);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

        private void registerUser(){
            String username = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            // check whether the strings we retrieving are empty or not
            // TextUtils is to group functions
            if (username.isEmpty()) {
                //email is empty
                Toast.makeText(this, "Email is required", Toast.LENGTH_LONG).show();
                // stopping the function execution further
                return;
            }

//        progressDialog.setMessage("Register User....");
//        progressDialog.show();
            if (password.isEmpty()) {
                // password is empty
                Toast.makeText(this, "Please enter password", Toast.LENGTH_LONG).show();
                //stopping the function exceution further
                return;
            }


//             this method takes to string argument - name & passwod
//
//            onlistener will execute the method when on complete



            Log.i("ttt",username+password);


            mAuth.createUserWithEmailAndPassword(username, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        // user is successfull registered and logged us
                        // we will start the profile activity here
                        // right now lets display toast
                        Toast.makeText(SignUp.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(SignUp.this, "Unable to register Successfully", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }





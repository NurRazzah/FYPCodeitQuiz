package com.example.azzah.fypcodeitquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    Button login;
    EditText editUsername, editPassword;
    TextView textViewSignUp;
    // internet operation  and it will take time to show the progress dialog
//   ProgressDialog progressDialog;

    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = (Button) findViewById(R.id.btnLog);
        editUsername = (EditText) findViewById(R.id.editName);
        editPassword = (EditText) findViewById(R.id.editPassword);
        textViewSignUp = (TextView) findViewById(R.id.tvSignUp);


        firebaseAuth = FirebaseAuth.getInstance();
//        progressDialog = new progressDialog(this);

        if(firebaseAuth.getCurrentUser() !=null){
             //profile activty here
        }


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();
            }
        });

        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
            }
        });


    }

    public void userLogin() {
        String email = editUsername.getText().toString().trim();
        String password = editPassword.getText().toString().trim();


        // check whether the strings we retrieving are empty or not
        // TextUtils is to group functions
        if (email.isEmpty()) {
            //email is empty
            Toast.makeText(this, "Please enter name", Toast.LENGTH_LONG).show();
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

        // this method takes to string argument - name & passwod

        //onlistener will execute the method when on complete


        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    //start profile activty
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
//                    Toast.makeText(Login.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //if validations are ok
        //we will first show a progress
    }

}




package com.example.root.git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

    public void login(){
        Button login_obj=(Button)findViewById(R.id.loginbtn);
        login_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username_obj=(EditText)findViewById(R.id.username);
                EditText password_obj=(EditText)findViewById(R.id.password);

                if(username_obj.getText().toString().equals("admin") && password_obj.getText().toString().equals("admin")){
                    AdminAccess();
                    //Toast.makeText(Login.this,"you are admin",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Login.this,"you are not admin go to hell",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public void AdminAccess(){
        Intent admin_intent=new Intent("com.example.root.git.Admin");
        startActivity(admin_intent);
    }
}

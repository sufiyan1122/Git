package com.example.root.git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
        register();
    }

    public void login(){
        loginBtn=(Button)findViewById(R.id.login);
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent login_intent=new Intent("com.example.root.git.Login");
                startActivity(login_intent);

            }
        });

    }


    public void register(){
        loginBtn=(Button)findViewById(R.id.register);
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent reg_intent=new Intent("com.example.root.git.Register");
                startActivity(reg_intent);

            }
        });

    }


}

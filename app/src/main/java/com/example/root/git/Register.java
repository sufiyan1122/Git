package com.example.root.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register();

    }

    public void register(){
        Button regBtn=(Button) findViewById(R.id.register);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name_obj=(EditText)findViewById(R.id.name);
                EditText email_obj=(EditText)findViewById(R.id.email);
                EditText pass_obj=(EditText)findViewById(R.id.password);
                EditText phone_obj=(EditText)findViewById(R.id.contact);

                Toast.makeText(Register.this, "you have registered sucessfully\n name "+name_obj.getText().toString()+"\n email "+email_obj.getText().toString()+"\n password "+pass_obj.getText().toString()+"\n contact "+phone_obj.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

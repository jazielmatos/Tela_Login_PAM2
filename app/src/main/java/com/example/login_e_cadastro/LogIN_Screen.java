package com.example.login_e_cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIN_Screen extends AppCompatActivity {

    EditText email;
    EditText password;
    Button singup;
    Button singin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        email=(EditText) findViewById(R.id.EdtEmail);
        password=(EditText) findViewById(R.id.EdtPassword);
        singup=(Button)findViewById(R.id.BtnSignUP);
        singin=(Button)findViewById(R.id.BtnSignIN);

        singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    Toast.makeText(LogIN_Screen.this,"Email ou Senha Inválidos",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(LogIN_Screen.this,"Escreva Todos os Campos",Toast.LENGTH_LONG).show();
                }

            }
        });

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SingUP_Screen.class);
                startActivity(intent);
            }
        });


    }
}
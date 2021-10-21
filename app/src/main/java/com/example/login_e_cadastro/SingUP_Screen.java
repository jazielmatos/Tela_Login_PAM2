package com.example.login_e_cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SingUP_Screen extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText password;
    Button singup;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_screen);

        name = (EditText) findViewById(R.id.EdtCreateName);
        email = (EditText)findViewById(R.id.EdtCreateEmail);
        password = (EditText) findViewById(R.id.EdtCreatePassword);
        singup = (Button) findViewById(R.id.BtnCreateSingUP);
        cancel = (Button) findViewById(R.id.BtnCreateCancel);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty() && !name.getText().toString().isEmpty()){
                    String Semail = email.getText().toString();
                    String Spassword = password.getText().toString();
                    String Sname = name.getText().toString();

                    Intent IntentEnviadora = new Intent(getApplicationContext(), User_Screen.class);
                    Bundle parametros = new Bundle();
                    parametros.putString("Chave_email", Semail);
                    parametros.putString("Chave_name", Sname);
                    parametros.putString("Chave_password",Spassword);

                    IntentEnviadora.putExtras(parametros);

                    startActivity(IntentEnviadora);

                    finish();

                }else{
                    Toast.makeText(SingUP_Screen.this,"Escreva Todos os Campos",Toast.LENGTH_LONG).show();
                }

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
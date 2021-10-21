package com.example.login_e_cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class User_Screen extends AppCompatActivity {

    TextView txtname;
    TextView txtemail;
    TextView txtpassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__screen);


        txtname = (TextView)findViewById(R.id.TxtUserName);
        txtemail = (TextView)findViewById(R.id.TxtUserEmail);
        txtpassword = (TextView)findViewById(R.id.TxtUserPassword);

        Intent IntentRecebedora = getIntent();
        Bundle parametros = IntentRecebedora.getExtras();

        String name = parametros.getString("Chave_name");
        String email = parametros.getString("Chave_email");
        String password = parametros.getString("Chave_password");

        txtname.setText(name);
        txtemail.setText(email);
        txtpassword.setText(password);

        Toast.makeText(User_Screen.this,"Bem Vindo " + name ,Toast.LENGTH_LONG).show();

    }
}
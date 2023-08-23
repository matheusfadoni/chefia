package com.example.chefia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ipdoserver;
    private EditText user;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
        ipdoserver = findViewById(R.id.ipdoserver);


    }

    public void acessarServidor() {

    }

    private EditText getIpdoserver() {
        return ipdoserver;
    }

    private EditText getUser() {
        return user;
    }

    private EditText getPassword() {
        return password;
    }
}
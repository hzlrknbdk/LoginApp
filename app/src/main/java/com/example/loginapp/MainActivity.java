package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText username;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        username =(EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( username.getText().toString().equals("hazal") && password.getText().toString().equals("budak")){

                    Intent intent = new Intent(MainActivity.this, GYKActivity.class);
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.finish();

                }else{

                    Toast.makeText(MainActivity.this, "Lütfen bilgilerinizi giriniz...", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}

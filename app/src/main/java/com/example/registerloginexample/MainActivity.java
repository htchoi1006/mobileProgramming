package com.example.registerloginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_id, tv_pass, tv_name, tv_address, tv_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_main);


        tv_id = findViewById(R.id.tv_id);
        tv_pass = findViewById(R.id.tv_pass);
        tv_name = findViewById(R.id.tv_name);
        tv_address = findViewById(R.id.tv_address);
        tv_phone = findViewById(R.id.tv_phone);


        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        String userPass = intent.getStringExtra("userPass");
        String userName = intent.getStringExtra("userName");
        String userAddress = intent.getStringExtra("userAddress");
        String userPhone = intent.getStringExtra("userPhone");


        tv_id.setText(userID);
        tv_pass.setText(userPass);
        tv_name.setText(userName);
        tv_address.setText(userAddress);
        tv_phone.setText(userPhone);

    }
}
package com.example.sona.medicosv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class HospitalSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_signup);
    }

    public void onClickRegisterHosp(View view){
        Toast.makeText(this, "Registering...", Toast.LENGTH_LONG).show();
    }

    public void onClickLogInRedirect(View view){
        Intent i = new Intent(this, HospitalLogin.class);
        startActivity(i);
    }
}

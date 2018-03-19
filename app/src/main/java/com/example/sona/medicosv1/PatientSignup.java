package com.example.sona.medicosv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class PatientSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_signup);
    }

    public void onClickRegister(View view){
        Toast.makeText(this, "Registering....", Toast.LENGTH_LONG).show();
    }

    public void onClickLogInBack(View view){
        Intent i = new Intent(this, PatientLogin.class);
        startActivity(i);
    }

}

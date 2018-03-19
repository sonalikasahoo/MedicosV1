package com.example.sona.medicosv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class PatientLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
    }

    public void onClickPatientLogin(View view){
        Toast.makeText(this, "logging in", Toast.LENGTH_LONG).show();
    }

    public void onClickPatientSignUp(View view){
        Intent i = new Intent(this, PatientSignup.class);
        startActivity(i);
    }
}

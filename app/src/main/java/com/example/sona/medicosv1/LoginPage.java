package com.example.sona.medicosv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void onClickPatient(View view){
        Intent i = new Intent(this, PatientLogin.class);
        startActivity(i);
    }

    public void onClickHospital(View view){
        Intent i = new Intent(this, HospitalLogin.class);
        startActivity(i);
    }
}

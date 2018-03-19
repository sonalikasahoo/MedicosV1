package com.example.sona.medicosv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;
import android.view.View;

public class HospitalLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_login);
    }

    public void onClickLogInHosp(View view){
        Toast.makeText(this, "Login....", Toast.LENGTH_LONG).show();
    }

    public void onClickHospSignupRedirect(View view){
        Intent i = new Intent(this, HospitalSignup.class);
        startActivity(i);
    }
}

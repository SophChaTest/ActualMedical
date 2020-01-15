package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PatientSignUp extends AppCompatActivity {
    private TextView TxtBoxEmail;
    private Button bttnRetSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_sign_up);
        TxtBoxEmail = findViewById(R.id.TxtBoxEmail);
        bttnRetSignIn = findViewById(R.id.BttnReturn);
    }

    public void ReturnToSignIn(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }


   /* public void clearText(View v){
                TxtBoxEmail.setText("");
    }
    */

}

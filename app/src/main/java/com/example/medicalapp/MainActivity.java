package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button patSignUp;
    private Button docSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void OpenPatSignUp(View v){
        Intent intent = new Intent(this, PatientSignUp.class);
        startActivity(intent);
        finish();
    }

    public void OpenDocSignUp(View v){
        Intent intent = new Intent(this, DoctorSignUp.class);
        startActivity(intent);
        finish();
    }


}

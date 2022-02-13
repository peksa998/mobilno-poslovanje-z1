package com.prvi.zadatak1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    TextView ime, podaci;
    Button prijavi;
    Putnik putnik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ime=findViewById(R.id.ime2);
        podaci=findViewById(R.id.podaci);
        prijavi=findViewById(R.id.prosledi);
    }

    @Override
    protected void onStart() {
        super.onStart();


        putnik = (Putnik) getIntent().getSerializableExtra("putnik");
    }

    @Override
    protected void onResume() {
        super.onResume();

        ime.setText(putnik.getIme() + " " + putnik.getPrezime());

        String string = putnik.getMail() + " , " + putnik.getBrojTelefona() + " , " + putnik.getDestinacija();
        podaci.setText(string);
    }

    public void potvrdiPrijavu(View view) {
        finish();
    }


}
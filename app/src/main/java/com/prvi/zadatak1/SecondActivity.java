package com.prvi.zadatak1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
        EditText ime, prezime,mail, telefon;
        TextView destinacija;
        Button posalji;
        Putnik putnik;
        String destinacije;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_second);

        ime=findViewById(R.id.ime);
        prezime=findViewById(R.id.prezime);
        telefon=findViewById(R.id.telefon);
        mail=findViewById(R.id.email);
        destinacija = findViewById(R.id.destinacija);
        putnik = new Putnik();
    }

    @Override
    protected void onStart() {
        super.onStart();
        destinacije=(String) getIntent().getSerializableExtra("destinacija");
        destinacija.setText(destinacije);
    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    private Boolean pokupljeneVredosti(String ime, String prezime, String mail, String telefon
    , String destinacija){

        if(!ime.isEmpty()){
            putnik.setIme(ime);
        }else{
            this.ime.setError("Niste uneli ime");
            this.ime.requestFocus();
            return false;
        }if(!prezime.isEmpty()){
            putnik.setPrezime(prezime);
        }else{
            this.prezime.setError("Niste uneli prezime");
            this.prezime.requestFocus();
            return false;
        }
        if(!telefon.isEmpty()){
            putnik.setBrojTelefona(telefon);
        }else{
            this.telefon.setError("Niste uneli telefon");
            this.telefon.requestFocus();
            return false;
        }
        if(!mail.isEmpty()){
            putnik.setMail(mail);
        }else{
            this.mail.setError("Niste uneli mail");
            this.mail.requestFocus();
            return false;
        }
        putnik.setDestinacija(destinacija);


        return true;
    }

    protected void onRestart() {
        super.onRestart();
        finish();
    }

    public void posaljiPodatke(View view) {
        Boolean vrednosti=pokupljeneVredosti(ime.getText().toString().trim(),
                prezime.getText().toString().trim(),
                mail.getText().toString().trim(),
                telefon.getText().toString().trim(), destinacije);

        if(vrednosti) {
            Intent i1 = new Intent(SecondActivity.this,ThirdActivity.class);
            i1.putExtra("putnik", putnik);
            startActivity(i1);
        }

    }
}

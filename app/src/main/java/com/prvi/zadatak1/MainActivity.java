package com.prvi.zadatak1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button btnsledeci, btnopis, btnpotvrdi, btnprethodni;
    ImageView slika;
    CheckBox cbIzaberi;
    TextView naziv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsledeci = findViewById(R.id.btnSledeci);
        btnopis = findViewById(R.id.btnPonuda);
        btnpotvrdi = findViewById(R.id.btnPotvrdi);
        slika = findViewById(R.id.slika);
        cbIzaberi = findViewById(R.id.cbIzaberi);
        naziv = findViewById(R.id.naziv);
        btnprethodni = findViewById(R.id.btnprethodni);
        btnpotvrdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("destinacija", naziv.getText().toString());
                startActivity(i);
            }
        });
    }

    public void sledeci(View view) {
        naziv.setText("Tara");
        naziv.setTextColor(getResources().getColor(R.color.purple_200));
        slika.setImageResource(R.drawable.tara);
    }

    public void prethodni(View view) {
        naziv.setText("Zlatibor");
        naziv.setTextColor(getResources().getColor(R.color.black));
        slika.setImageResource(R.drawable.tibor);
        naziv.setTextSize(30);
    }

    public void ponuda(View view) {
        Toast.makeText(this, "U ponudi su Zlatibor i Tara", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        cbIzaberi.setChecked(false);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private Boolean izabran(CheckBox Izaberi) {

        return Izaberi.isChecked();
    }
}
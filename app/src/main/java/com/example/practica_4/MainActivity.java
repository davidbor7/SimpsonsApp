package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirActivityPrimos(View view)
    {
        Intent i = new Intent(this, PrimosActivity.class);
        this.startActivity(i);
    }

    public void abrirActivityDesplazandoImagenes(View view)
    {
        Intent i = new Intent(this, DesplazandoImagenesActivity.class);
        this.startActivity(i);
    }

    public void abrirActivitySeleccionandoImagenes(View view)
    {
        Intent i = new Intent(this, SeleccionandoImagenesActivity.class);
        this.startActivity(i);
    }

    public void abrirActivityJuegoDeAciertos(View view)
    {
        Intent i = new Intent(this, JuegoDeAciertosActivity.class);
        this.startActivity(i);
    }
}

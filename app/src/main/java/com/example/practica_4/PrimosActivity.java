package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrimosActivity extends AppCompatActivity
{

    private TextView textoCabecera;
    private Typeface simpson;
    private String fuente;
    private EditText textoNumeros;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primos);
        this.setTitle("Números Primos");


        textoNumeros = (EditText) findViewById(R.id.editTextPrimos);
        textoCabecera = (TextView) findViewById(R.id.textViewCabeceraPrimos);
        fuente = "fuentes/akbar.ttf";
        simpson = Typeface.createFromAsset(getAssets(),fuente);
        textoCabecera.setTypeface(simpson);


    }

    public void cerrarActivity(View view)
    {
        finish();
    }


    public void compruebaNumero(View view)
    {

        try
        {
            boolean primo = true;
            float numero;
            numero = Float.valueOf(textoNumeros.getText().toString());

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo)
            {
                Toast.makeText(this, "El número es primo", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this, "El número no es primo", Toast.LENGTH_LONG).show();
            }

        }catch (Exception e)
        {
            Toast.makeText(this, "Introduce un número", Toast.LENGTH_SHORT).show();
        }

    }
}

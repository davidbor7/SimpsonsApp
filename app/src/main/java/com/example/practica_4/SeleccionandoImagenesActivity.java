package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.practica_4.fragment.BartFragment;
import com.example.practica_4.fragment.HomerFragment;
import com.example.practica_4.fragment.LisaFragment;
import com.example.practica_4.fragment.MargeFragment;

public class SeleccionandoImagenesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);
        this.setTitle("Seleccionando Imágenes");
    }

    public void cerrarActivity(View view)
    {
        finish();
    }

    public void cargarImagenHomer(View view)
    {
        //CARGAMOS EL FRAGMENT
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFrameLayout, new HomerFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                .commit();
    }

    public void cargarImagenMarge(View view)
    {
        //CARGAMOS EL FRAGMENT
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFrameLayout, new MargeFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                .commit();
    }

    public void cargarImagenLisa(View view)
    {
        //CARGAMOS EL FRAGMENT
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFrameLayout, new LisaFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                .commit();
    }

    public void cargarImagenBart(View view)
    {
        //CARGAMOS EL FRAGMENT
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFrameLayout, new BartFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                .commit();
    }
}

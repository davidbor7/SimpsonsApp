package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.View;
import com.example.practica_4.adapater.ViewPagerDesplazandoImagenes;

public class DesplazandoImagenesActivity extends AppCompatActivity {

    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);
        this.setTitle("Desplazando Imágenes");

        viewpager = findViewById(R.id.viewPager);
        viewpager.setAdapter(new ViewPagerDesplazandoImagenes(getSupportFragmentManager()));
    }

    public void cerrarActivity(View view)
    {
        finish();
    }
}

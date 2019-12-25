package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.practica_4.fragment.AciertoFragment;
import com.example.practica_4.fragment.ErrorFragment;

public class JuegoDeAciertosActivity extends AppCompatActivity {

    private TextView textoPais;
    private TextView textoCapital;
    private Typeface simpson;
    private String fuente;

    Button btn_Comprueba;

    String cadena_pais ;
    String cadena_capital;

    ListView paises;
    ListView capitales;

    Fragment fragmentoCapitales;
    Fragment fragmentoPaises;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);
        this.setTitle("Juego de Aciertos");

        cadena_pais = "";
        cadena_capital = "";

        // Cabeceras Pais y Capital
        textoPais = (TextView) findViewById(R.id.textViewPais);
        textoCapital = (TextView) findViewById(R.id.textViewCapital);
        fuente = "fuentes/akbar.ttf";
        simpson = Typeface.createFromAsset(getAssets(),fuente);
        textoPais.setTypeface(simpson);
        textoCapital.setTypeface(simpson);
        //-----------------------------------

        //Rescatamos los fragments para trabajar con ellos
        fragmentoPaises = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fragmentsuperior);
        fragmentoCapitales = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fragmentinferior);
        //-----------------------------------

        //Enlazamos los objetos del fragments con los que hemos creado en esta clase
        paises = (ListView) fragmentoPaises.getActivity().findViewById(R.id.listadepaises);
        capitales = (ListView) fragmentoCapitales.getActivity().findViewById(R.id.listadecapitales);

        btn_Comprueba = (Button) findViewById(R.id.btnComrpobar);

        //Escuchadores de las listas cuando hacemos clic en ellas. Recogen lo que has pulsado y lo guardan en un String.

        paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                cadena_pais = paises.getItemAtPosition(position).toString();

                textoPais.setText(cadena_pais);
            }
        });

        capitales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                cadena_capital = capitales.getItemAtPosition(position).toString();
                textoCapital.setText(cadena_capital);
            }
        });

        //Realizamos las comprobaciones
        btn_Comprueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cadena_pais.equals("ESPAÑA") && cadena_capital.equals("MADRID") || cadena_pais.equals("SPAIN") && cadena_capital.equals("MADRID") || cadena_pais.equals("SPANIEN") && cadena_capital.equals("MADRID"))
                {
                    //CARGAMOS EL FRAGMENT
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                            .commit();
                }
                else
                    if(cadena_pais.equals("FRANCIA") && cadena_capital.equals("PARÍS") || cadena_pais.equals("FRANCE") && cadena_capital.equals("PARIS") || cadena_pais.equals("FRANKREICH") && cadena_capital.equals("PARIS"))
                    {
                        //CARGAMOS EL FRAGMENT
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                .commit();
                    }
                    else
                    {
                        if (cadena_pais.equals("PORTUGAL") && cadena_capital.equals("LISBOA") && cadena_pais.equals("PORTUGAL") && cadena_capital.equals("LISBON") || cadena_pais.equals("PORTUGAL") && cadena_capital.equals("LISSAABON"))
                        {
                            //CARGAMOS EL FRAGMENT
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                    .commit();
                        }
                        else
                        {
                            if (cadena_pais.equals("REINO UNIDO") && cadena_capital.equals("LONDRES") || cadena_pais.equals("UNITED KINGDOM") && cadena_capital.equals("LONDON") || cadena_pais.equals("VEREINIGTES KÖNIGREICH") && cadena_capital.equals("LONDON"))
                            {
                                //CARGAMOS EL FRAGMENT
                                getSupportFragmentManager()
                                        .beginTransaction()
                                        .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                        .commit();
                            }
                            else
                            {
                                if (cadena_pais.equals("ALEMANIA") && cadena_capital.equals("BERLÍN") || cadena_pais.equals("GERMANY") && cadena_capital.equals("BERLIN") || cadena_pais.equals("DEUTSCHLAND") && cadena_capital.equals("BERLIN"))
                                {
                                    //CARGAMOS EL FRAGMENT
                                    getSupportFragmentManager()
                                            .beginTransaction()
                                            .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                            .commit();
                                }
                                else
                                {
                                    if (cadena_pais.equals("SUIZA") && cadena_capital.equals("BERNA") && cadena_pais.equals("SWITZERLAND") && cadena_capital.equals("BERN") && cadena_pais.equals("SCHWEIZ") && cadena_capital.equals("BERN"))
                                    {
                                        //CARGAMOS EL FRAGMENT
                                        getSupportFragmentManager()
                                                .beginTransaction()
                                                .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                                .commit();
                                    }
                                    else
                                    {
                                        if (cadena_pais.equals("PAÍSES BAJOS") && cadena_capital.equals("AMSTERDAM") || cadena_pais.equals("NETHERLANDS") && cadena_capital.equals("AMSTERDAM") || cadena_pais.equals("NIEDERLANDE") && cadena_capital.equals("AMSTERDAM"))
                                        {
                                            //CARGAMOS EL FRAGMENT
                                            getSupportFragmentManager()
                                                    .beginTransaction()
                                                    .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                                    .commit();
                                        }
                                        else
                                        {
                                            if (cadena_pais.equals("NORUEGA") && cadena_capital.equals("OSLO") || cadena_pais.equals("NORWAY") && cadena_capital.equals("OSLO") || cadena_pais.equals("NORWEGEN") && cadena_capital.equals("OSLO"))
                                            {
                                                //CARGAMOS EL FRAGMENT
                                                getSupportFragmentManager()
                                                        .beginTransaction()
                                                        .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                                        .commit();
                                            }
                                            else
                                            {
                                                if (cadena_pais.equals("ITALIA") && cadena_capital.equals("ROMA") || cadena_pais.equals("ITALy") && cadena_capital.equals("ROME") || cadena_pais.equals("ITALIEN") && cadena_capital.equals("ROM"))
                                                {
                                                    //CARGAMOS EL FRAGMENT
                                                    getSupportFragmentManager()
                                                            .beginTransaction()
                                                            .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                                            .commit();
                                                }
                                                else
                                                {
                                                    if (cadena_pais.equals("IRLANDA") && cadena_capital.equals("DUBLÍN") || cadena_pais.equals("IRELAND") && cadena_capital.equals("DUBLIN") || cadena_pais.equals("IRLAND") && cadena_capital.equals("DUBLIN"))
                                                    {

                                                        //CARGAMOS EL FRAGMENT
                                                        getSupportFragmentManager()
                                                                .beginTransaction()
                                                                .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                                                .commit();
                                                    }
                                                    else
                                                    {
                                                        if (cadena_pais.equals("GRECIA") && cadena_capital.equals("ATENAS") || cadena_pais.equals("GREECE") && cadena_capital.equals("ATHENS") || cadena_pais.equals("GRIECHENLAND") && cadena_capital.equals("ATHEN"))
                                                        {
                                                            //CARGAMOS EL FRAGMENT
                                                            getSupportFragmentManager()
                                                                    .beginTransaction()
                                                                    .replace(R.id.fragmentaciertoerror, new AciertoFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                                                    .commit();
                                                        }
                                                        else {
                                                            getSupportFragmentManager()
                                                                    .beginTransaction()
                                                                    .replace(R.id.fragmentaciertoerror, new ErrorFragment()) //EL PRIMER PARÁMETRO ES DÓNDE SE CARGA, Y EL SEGUNDO UNA INSTANCIA DEL FRAGMENT
                                                                    .commit();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
        });
    }

    public void cerrarActivity(View view)
    {
        finish();
    }
}

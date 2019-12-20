package com.example.practica_4.fragment;


import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.practica_4.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaisesFragment extends Fragment {

    private ArrayList<String> paises;
    private ListView lv1;


    public PaisesFragment()
    {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_paises, container, false);
    }

    public void onActivityCreated (Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        paises = new ArrayList<String>();
        paises.add(getString(R.string.ESPANA));
        paises.add(getString(R.string.PORTUGAL));
        paises.add(getString(R.string.FRANCIA));
        paises.add(getString(R.string.REINOUNIDO));
        paises.add(getString(R.string.IRLANDA));
        paises.add(getString(R.string.NORUEGA));
        paises.add(getString(R.string.ITALIA));
        paises.add(getString(R.string.SUIZA));
        paises.add(getString(R.string.PAISESBAJOS));
        paises.add(getString(R.string.AUSTRIA));
        paises.add(getString(R.string.GRECIA));
        paises.add(getString(R.string.ALEMANIA));

        Collections.sort(paises);

        lv1 = (ListView) getActivity().findViewById(R.id.listadepaises);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_view_, paises);
        lv1.setAdapter(adapter);


    }
}

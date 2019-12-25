package com.example.practica_4.fragment;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.practica_4.R;
import java.util.ArrayList;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class CapitalesFragment extends Fragment {


    private ArrayList<String> capitales;
    private ListView lv2;


    public CapitalesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_capitales, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        capitales = new ArrayList<String>();
        capitales.add(getString(R.string.MADRID));
        capitales.add(getString(R.string.LISBOA));
        capitales.add(getString(R.string.PARIS));
        capitales.add(getString(R.string.LONDRES));
        capitales.add(getString(R.string.DUBLIN));
        capitales.add(getString(R.string.OSLO));
        capitales.add(getString(R.string.ROMA));
        capitales.add(getString(R.string.BERNA));
        capitales.add(getString(R.string.AMSTERDAM));
        capitales.add(getString(R.string.VIENA));
        capitales.add(getString(R.string.ATENAS));
        capitales.add(getString(R.string.BERLIN));

        Collections.sort(capitales);

        lv2 = (ListView) getActivity().findViewById(R.id.listadecapitales);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_view_2, capitales);
        lv2.setAdapter(adapter);

    }
}

package com.example.practica_4.adapater;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.practica_4.fragment.AyuntamientoFragment;
import com.example.practica_4.fragment.BadulaqueFragment;
import com.example.practica_4.fragment.BarMoeFragment;
import com.example.practica_4.fragment.CasaFragment;
import com.example.practica_4.fragment.CentralNuclearFragment;
import com.example.practica_4.fragment.EscuelaFragment;
import com.example.practica_4.fragment.HospitalFragment;
import com.example.practica_4.fragment.IglesiaFragment;
import com.example.practica_4.fragment.PensionFragment;

public class ViewPagerDesplazandoImagenes extends FragmentPagerAdapter
{

    public ViewPagerDesplazandoImagenes(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new CasaFragment();
            case 1:
                return new BarMoeFragment();

            case 2:
                return new CentralNuclearFragment();

            case 3:
                return new EscuelaFragment();

            case 4:
                return new PensionFragment();

            case 5:
                return new HospitalFragment();

            case 6:
                return new BadulaqueFragment();

            case 7:
                return new IglesiaFragment();

            case 8:
                return  new AyuntamientoFragment();

        }


        return null;
    }

    @Override
    public int getCount() {
        return 9;
    }
}

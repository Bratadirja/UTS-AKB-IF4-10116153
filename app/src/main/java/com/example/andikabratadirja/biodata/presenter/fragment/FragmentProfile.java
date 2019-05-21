package com.example.andikabratadirja.biodata.presenter.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.andikabratadirja.biodata.R;

/*
    Tanggal Pengerjaan : 19 - 05 - 2019
    Nim : 10116153
    Nama : Andika Bratadirja
    Kelas : IF - 4
*/

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentProfile extends Fragment {

    public FragmentProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragement_profile = inflater.inflate(R.layout.fragment_profile, container, false);
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}

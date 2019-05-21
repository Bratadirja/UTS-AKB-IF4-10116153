package com.example.andikabratadirja.biodata.presenter.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
public class FragmentKontak extends Fragment {

    TextView textViewInstagram,textViewLine,textViewGithub,textViewFacebook,textViewGmail;

    public FragmentKontak( ) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragement_kontak = inflater.inflate(R.layout.fragment_kontak, container, false);
        textViewInstagram = fragement_kontak.findViewById(R.id.instagram);
        textViewLine = fragement_kontak.findViewById(R.id.line);
        textViewGithub = fragement_kontak.findViewById(R.id.github);
        textViewGmail = fragement_kontak.findViewById(R.id.gmail);
        textViewFacebook = fragement_kontak.findViewById(R.id.facebook);

        textViewInstagram.setMovementMethod(LinkMovementMethod.getInstance());
        textViewLine.setMovementMethod(LinkMovementMethod.getInstance());
        textViewGithub.setMovementMethod(LinkMovementMethod.getInstance());
        textViewGmail.setMovementMethod(LinkMovementMethod.getInstance());
        textViewFacebook.setMovementMethod(LinkMovementMethod.getInstance());

        return fragement_kontak;
    }

}

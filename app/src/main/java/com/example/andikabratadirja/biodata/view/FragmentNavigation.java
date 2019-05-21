package com.example.andikabratadirja.biodata.view;


import com.example.andikabratadirja.biodata.presenter.fragment.FragmentKontak;
import com.example.andikabratadirja.biodata.presenter.fragment.FragmentProfile;
import com.example.andikabratadirja.biodata.presenter.fragment.FragmentTeman;

public interface FragmentNavigation {
    interface View{
        void atachPresenter(Presenter presenter);
    }

    interface Presenter{
        void addFragmentProfile(FragmentProfile fragment);
        void addFragmentKontak(FragmentKontak fragment);
        void addFragmentTeman(FragmentTeman fragment);

    }
}

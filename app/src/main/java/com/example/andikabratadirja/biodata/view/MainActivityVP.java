package com.example.andikabratadirja.biodata.view;


import android.support.v4.app.FragmentPagerAdapter;

public interface MainActivityVP {
    interface View{
        void setFragment(FragmentPagerAdapter manager);
    }

    interface Presenter{
        void getRandomFragment();
    }
}

package com.example.andikabratadirja.biodata.presenter.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/*
    Tanggal Pengerjaan : 19 - 05 - 2019
    Nim : 10116153
    Nama : Andika Bratadirja
    Kelas : IF - 4
*/

public class FragmentAdater extends FragmentPagerAdapter {
    private List<Fragment> Fragment = new ArrayList<>();
    private List<String> NamePage = new ArrayList<>();

    public FragmentAdater(FragmentManager manager) {
        super(manager);
    }


    public void add(Fragment Frag, String Title) {
        Fragment.add(Frag);
        NamePage.add(Title);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return NamePage.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
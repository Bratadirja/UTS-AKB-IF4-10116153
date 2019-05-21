package com.example.andikabratadirja.biodata;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.example.andikabratadirja.biodata.presenter.fragment.FragmentAdater;
import com.example.andikabratadirja.biodata.presenter.fragment.FragmentKontak;
import com.example.andikabratadirja.biodata.presenter.fragment.FragmentProfile;
import com.example.andikabratadirja.biodata.presenter.fragment.FragmentTeman;

/*
    Tanggal Pengerjaan : 19 - 05 - 2019
    Nim : 10116153
    Nama : Andika Bratadirja
    Kelas : IF - 4
*/

public class MainActivity extends AppCompatActivity  {
    ViewPager viewPager;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigation);
       navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        viewPager = findViewById(R.id.viewpager);
        setupFm(getSupportFragmentManager(),viewPager);
        viewPager.setCurrentItem(0);
        viewPager.setOnPageChangeListener(new PageChange());

    }

    public static void setupFm(FragmentManager fragmentManager, ViewPager viewPager){
        FragmentAdater Adapter = new FragmentAdater(fragmentManager);

        Adapter.add(new FragmentProfile(), "Page One");
        Adapter.add(new FragmentKontak(), "Page Two");
        Adapter.add(new FragmentTeman(), "Page Three");


        viewPager.setAdapter(Adapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.profil_menu:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.kontak_menu:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.teman_menu:
                    viewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }
    };

    public class PageChange implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
        @Override
        public void onPageSelected(int position) {
            switch (position) {
                case 0:
                    navigationView.setSelectedItemId(R.id.profil_menu);
                    break;
                case 1:
                    navigationView.setSelectedItemId(R.id.kontak_menu);
                    break;
                case 2:
                    navigationView.setSelectedItemId(R.id.teman_menu);
                    break;
            }
        }
        @Override
        public void onPageScrollStateChanged(int state) {
        }
    }

}

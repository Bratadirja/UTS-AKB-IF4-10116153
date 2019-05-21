package com.example.andikabratadirja.biodata.view;

public interface FragmentVP {
    interface View{
        void setText(String str);
    }

    interface Presenter{
        void getText();
    }
}

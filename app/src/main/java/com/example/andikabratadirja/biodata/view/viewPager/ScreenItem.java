package com.example.andikabratadirja.biodata.view.viewPager;

/*
    Tanggal Pengerjaan : 19 - 05 - 2019
    Nim : 10116153
    Nama : Andika Bratadirja
    Kelas : IF - 4
*/

public class ScreenItem {
    private String Title;
    private String Description;
    private int ScreenImg;

    public ScreenItem(String title, String description, int screenImg){
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}

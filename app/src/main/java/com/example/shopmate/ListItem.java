package com.example.shopmate;

import android.support.v7.app.AppCompatActivity;

public class ListItem extends AppCompatActivity {
    private int mImageResource;
    private String mItem;
    private String mPrice;

    public ListItem(int imageResourse, String item, String price) {
        mImageResource = imageResourse;
        mItem = item;
        mPrice = price;
    }

    public int getImageResource(){
        return mImageResource;
    }

    public String getText1(){
        return mItem;
    }

    public String getText2(){
        return mPrice;
    }
}

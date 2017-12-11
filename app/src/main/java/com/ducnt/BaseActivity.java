package com.ducnt;


import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private int mValue;

    protected int getValue() {
        return mValue;
    }

    protected void setValue(int mValue) {
        this.mValue = mValue;
    }
}

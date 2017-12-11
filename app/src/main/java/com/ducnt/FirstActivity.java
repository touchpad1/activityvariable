package com.ducnt;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setValue(10);
        Log.d("FirstActivity","Value = "+ getValue());
    }

    public void startSecondActivity(View view) {
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }
}

package com.mtn.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        User user = new User.UserBuilder("Testing","OK")
                .age(11)
                .phone("10010101")
                .build();


        Log.d(TAG, "onCreate: "+user.toString());
    }
}

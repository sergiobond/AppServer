package com.sbv_tech.remindme;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by sergey.bondarenok on 12/21/15.
 */
public class MainActivity extends Activity {

 @Override
    protected void onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
 }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity started");
    }

}

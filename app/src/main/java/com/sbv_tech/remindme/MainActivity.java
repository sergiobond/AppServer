package com.sbv_tech.remindme;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by sergey.bondarenok on 12/21/15.
 */
public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_main;

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;



 @Override
    protected void onCreate(Bundle savedInstanceState){
     setTheme(R.style.AppDefault);
     super.onCreate(savedInstanceState);
     setContentView(LAYOUT);

     initToolbar();

     initNavigationView();
 }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity started");
    }

    private void initToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);

    }




    private void initNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

    }
}

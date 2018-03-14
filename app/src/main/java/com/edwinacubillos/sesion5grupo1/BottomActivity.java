package com.edwinacubillos.sesion5grupo1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {

    private TextView mTextMessage;
    FragmentManager fm;
    FragmentTransaction ft;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            ft = fm.beginTransaction();

            switch (item.getItemId()) {
                case R.id.mSuperman:
                    SupermanFragment frag = new SupermanFragment();
                    ft.replace(android.R.id.content, frag).commit();
                    return true;
                case R.id.mBatman:
                    BatmanFragment frag2 = new BatmanFragment();
                    ft.replace(android.R.id.content, frag2).commit();
                    return true;
                case R.id.mFlash:
                    FlashFragment frag3 = new FlashFragment();
                    ft.replace(android.R.id.content, frag3).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        SupermanFragment frag = new SupermanFragment();
        ft.add(android.R.id.content, frag).commit();



    }

}

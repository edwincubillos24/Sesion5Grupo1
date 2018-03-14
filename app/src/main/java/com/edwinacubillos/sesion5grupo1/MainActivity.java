package com.edwinacubillos.sesion5grupo1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        BatmanFragment fragment = new BatmanFragment();
        ft.add(android.R.id.content, fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        ft = fm.beginTransaction();

        switch(id){
            case R.id.mBatman:
                BatmanFragment fragment = new BatmanFragment();
                ft.replace(android.R.id.content, fragment).commit();
                break;
            case R.id.mSuperman:
                SupermanFragment fragment2 = new SupermanFragment();
                ft.replace(android.R.id.content, fragment2).commit();
                break;
            case R.id.mFlash:
                FlashFragment fragment3 = new FlashFragment();
                ft.replace(android.R.id.content, fragment3).commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
/*

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

            if (id==R.id.mBatman) {
                BatmanFragment fragment = new BatmanFragment();
                ft.replace(android.R.id.content, fragment).commit();
            }

            if  (id==R.id.mSuperman) {
                SupermanFragment fragment2 = new SupermanFragment();
                ft.replace(android.R.id.content, fragment2).commit();
            }

            if (id==R.id.mFlash) {
                FlashFragment fragment3 = new FlashFragment();
                ft.replace(android.R.id.content, fragment3).commit();
            }

 */
package com.example.healthkeeper_new;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.healthkeeper_new.ui.home.HomeFragment;
import com.example.healthkeeper_new.ui.inbody.InbodyFragment;
import com.example.healthkeeper_new.ui.setting.SettingFragment;
import com.example.healthkeeper_new.ui.trainerbot.TrainerbotFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //
    private FragmentManager fragmentManager = getSupportFragmentManager();

    private HomeFragment homeFragment = new HomeFragment();
    private InbodyFragment inbodyFragment = new InbodyFragment();
    private SettingFragment settingFragment = new SettingFragment();
    private TrainerbotFragment trainerbotFragment = new TrainerbotFragment();
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        //첫 화면 지정
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, homeFragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new
        BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.navigation_home: {
                        transaction.replace(R.id.frame_layout, homeFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_trainerbot: {
                        transaction.replace(R.id.frame_layout, trainerbotFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_inbody: {
                        transaction.replace(R.id.frame_layout, inbodyFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_setting: {
                        transaction.replace(R.id.frame_layout, settingFragment).commitAllowingStateLoss();
                        break;
                    }
                }

                return true;
            }
        });
    }
}

/////지웠던거 넣기


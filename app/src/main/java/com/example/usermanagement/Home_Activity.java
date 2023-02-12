package com.example.usermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usermanagement.NavFragment.DashBoard_Fragment;
import com.example.usermanagement.NavFragment.Profile_Fragment;
import com.example.usermanagement.NavFragment.Users_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView Bottom_Nav;
    ImageView Github_Link;
    TextView Project_Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*<------------Night mode disable--------->*/

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        /*---------------Hooks----------------*/

        Bottom_Nav = findViewById(R.id.Bottom_Nav);
        Bottom_Nav.setOnNavigationItemSelectedListener(this);
        Github_Link = findViewById(R.id.Github_Link3);
        Project_Link = findViewById(R.id.Project_Link3);

        /*---------------First fragment Load----------------*/

        loadFragment(new DashBoard_Fragment());

//        /*---------------Hide Status Bar----------------*/
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*<------------Handle_Github_link_On_click_Listener--------->*/

        Github_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joymridha2004"));
                startActivity(intent);
            }
        });

        /*<------------Handle_Github_Project_Link_On_click_Listener--------->*/

        Project_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joymridha2004/UserManagement_Java_Application"));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.Dashboard: {
                fragment = new DashBoard_Fragment();
                break;
            }
            case R.id.Users: {
                fragment = new Users_Fragment();
                break;
            }
            case R.id.Profile: {
                fragment = new Profile_Fragment();
                break;
            }

        }
        if (fragment != null) {
            loadFragment(fragment);
        }
        return true;
    }

    public void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.relative_Layout, fragment).commit();
    }
}
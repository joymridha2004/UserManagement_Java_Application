package com.example.usermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    EditText ED_Email, ED_PassWord;
    Button Login_Button;
    TextView Register_Link, Project_Link;
    ImageView Github_Link;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*<------------Night mode disable--------->*/

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        /*---------------Hooks----------------*/

        ED_Email = findViewById(R.id.ED_Email);
        ED_PassWord = findViewById(R.id.ED_PassWord);

        Login_Button = findViewById(R.id.Login_Button);

        Register_Link = findViewById(R.id.Register_Link);

        Github_Link = findViewById(R.id.Github_Link1);

        Project_Link = findViewById(R.id.Project_Link1);
//        /*---------------Hide Status Bar----------------*/
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*---------------On Click Listener On Register Button---------------*/

        Login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Login_Activity.this, Home_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        /*---------------On Click Listener On Login Link---------------*/

        Register_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, Register_Activity.class);
                startActivity(intent);
                finish();
            }
        });

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
}
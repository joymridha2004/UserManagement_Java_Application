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

public class Register_Activity extends AppCompatActivity {

    TextView Login_Link, Project_Link;
    Button Register_Button;
    EditText ED_Name, ED_Email, ED_PassWord;
    ImageView Github_Link;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        /*<------------Night mode disable--------->*/

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

//        /*---------------Hide Status Bar----------------*/
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*---------------Hooks----------------*/

        ED_Name = findViewById(R.id.ED_Name);
        ED_Email = findViewById(R.id.ED_Email);
        ED_PassWord = findViewById(R.id.ED_PassWord);

        Register_Button = findViewById(R.id.Register_Button);

        Login_Link = findViewById(R.id.Login_Link);

        Github_Link = findViewById(R.id.Github_Link2);

        Project_Link = findViewById(R.id.Project_Link2);

        /*---------------On Click Listener On Register Button---------------*/

        Register_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Register Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        /*---------------On Click Listener On Login Link---------------*/

        Login_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register_Activity.this, Login_Activity.class);
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
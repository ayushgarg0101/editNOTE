package com.illiganweapon.editNote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t=new Thread() {
            public void run() {

                try {
                    //sleep thread for 10 seconds
                    sleep(5000);

                    //Call Main activity
                    Intent i=new Intent(Splash.this, com.illiganweapon.editNote.EditorActivity.class);
                    startActivity(i);

                    //destroying Splash activity
                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        //start thread
        t.start();
    }
}

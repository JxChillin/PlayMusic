package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button playbtn, stopbtn;
    MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playbtn = findViewById(R.id.playbtn);
        stopbtn = findViewById(R.id.stopbtn);

        //option 1
        // mp = MediaPlayer.create(getApplicationContext(),R.raw.drake);

        //option 2
        mp = MediaPlayer.create(this,R.raw.drake);
        /* option 1
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
            }
        });

         */


    }
    //option 2
    public void StartMusic(View v){
        mp.start();
    }

    public void StopMusic(View v){
        mp.stop();
        //Calling the method that creates the song in order to restart it
        mp = MediaPlayer.create(this,R.raw.drake);
    }

}
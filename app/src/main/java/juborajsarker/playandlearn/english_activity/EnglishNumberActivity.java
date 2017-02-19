package juborajsarker.playandlearn.english_activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import juborajsarker.playandlearn.ActivityAboutMe;
import juborajsarker.playandlearn.MainActivity;
import juborajsarker.playandlearn.R;

public class EnglishNumberActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_number);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-8776197178118665/6149246635");

        AdView mAdView = (AdView) findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return true;
    }



    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(EnglishNumberActivity.this, ActivityAboutMe.class);
        startActivity(about_me);
    }



    public void onClick3(View view) {

        switch (view.getId()) {
            case R.id.one: {
                mediaPlayer = MediaPlayer.create(this, R.raw.one1);
                mediaPlayer.start();

                break;

            }

        }


        switch (view.getId()) {
            case R.id.two: {
                mediaPlayer = MediaPlayer.create(this, R.raw.two2);
                mediaPlayer.start();

                break;

            }

        }



        switch (view.getId()) {
            case R.id.three: {
                mediaPlayer = MediaPlayer.create(this, R.raw.three3);
                mediaPlayer.start();

                break;

            }

        }



        switch (view.getId()) {
            case R.id.four: {
                mediaPlayer = MediaPlayer.create(this, R.raw.four4);
                mediaPlayer.start();


                break;

            }

        }



        switch (view.getId()) {
            case R.id.five: {
                mediaPlayer = MediaPlayer.create(this, R.raw.five5);
                mediaPlayer.start();


                break;

            }

        }



        switch (view.getId()) {
            case R.id.six: {
                mediaPlayer = MediaPlayer.create(this, R.raw.six6);
                mediaPlayer.start();


                break;

            }

        }




        switch (view.getId()) {
            case R.id.seven: {
                mediaPlayer = MediaPlayer.create(this, R.raw.seven7);
                mediaPlayer.start();


                break;

            }

        }



        switch (view.getId()) {
            case R.id.eight: {
                mediaPlayer = MediaPlayer.create(this, R.raw.eight8);
                mediaPlayer.start();


                break;

            }

        }



        switch (view.getId()) {
            case R.id.nine: {
                mediaPlayer = MediaPlayer.create(this, R.raw.nine9);
                mediaPlayer.start();


                break;

            }

        }



        switch (view.getId()) {
            case R.id.zero: {
                mediaPlayer = MediaPlayer.create(this, R.raw.zero);
                mediaPlayer.start();

                break;

            }

        }





    }

    public void home_go(View view) {

        startActivity(new Intent(EnglishNumberActivity.this, MainActivity.class));
    }
}
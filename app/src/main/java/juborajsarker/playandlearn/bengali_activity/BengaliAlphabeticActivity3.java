package juborajsarker.playandlearn.bengali_activity;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import juborajsarker.playandlearn.ActivityAboutMe;
import juborajsarker.playandlearn.MainActivity;
import juborajsarker.playandlearn.R;

public class BengaliAlphabeticActivity3 extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_alphabetic3);

        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-8776197178118665/1719047034");

        AdView mAdView = (AdView) findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





    }

    private void createDialog() {

        dialog=new Dialog(this);

        //SET TITLE
        dialog.setTitle("A for Apple");

        //set content
        dialog.setContentView(R.layout.custom_layout);


        cancelBtn= (ImageView) dialog.findViewById(R.id.cancelTxt);

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(BengaliAlphabeticActivity3.this, ActivityAboutMe.class);
        startActivity(about_me);
    }






    public void onClick_b3(View view) {

        switch (view.getId()) {
            case R.id.so: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa31);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.ho: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa32);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.rro: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa33);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.rra: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa34);
                mediaPlayer.start();

                break;
            }

        }



        switch (view.getId()) {
            case R.id.ya: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa35);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.tto: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa36);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.ong: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa37);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.bisorgo: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa38);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.last: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa39);
                mediaPlayer.start();
                break;

            }

        }

    }







    public void goto_home_from_bengali3(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity3.this, MainActivity.class));
    }

    public void back_to_bengali2(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity3.this, BengaliAlphabeticActivity2.class));
    }
}

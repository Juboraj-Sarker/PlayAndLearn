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

public class BengaliVowelActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_vowel);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-8776197178118665/9242313839");

        AdView mAdView = (AdView) findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();

        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }

    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(BengaliVowelActivity.this, ActivityAboutMe.class);
        startActivity(about_me);
    }



    private void createDialog() {

        dialog=new Dialog(this);

        //SET TITLE
        dialog.setTitle("A for Apple");

        //set content
        dialog.setContentView(R.layout.custom_layout);


        cancelBtn= (ImageView) dialog.findViewById(R.id.cancelTxt);

    }








    public void onClick_v(View view) {

        switch (view.getId()) {
            case R.id.ojogor: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ojogor);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.aam: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aam);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.idur: {
                mediaPlayer = MediaPlayer.create(this, R.raw.idur);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.eid: {
                mediaPlayer = MediaPlayer.create(this, R.raw.eid);
                mediaPlayer.start();
                break;
            }

        }



        switch (view.getId()) {
            case R.id.ut: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ut);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.usha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.usha);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.rishi: {
                mediaPlayer = MediaPlayer.create(this, R.raw.rishi);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.ektara: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ektara);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.oirabot: {
                mediaPlayer = MediaPlayer.create(this, R.raw.oirabot);
                mediaPlayer.start();
                break;

            }

        }






        switch (view.getId()) {
            case R.id.okay: {
                mediaPlayer = MediaPlayer.create(this, R.raw.okay);
                mediaPlayer.start();
                break;

            }

        }







        switch (view.getId()) {
            case R.id.oshud: {
                mediaPlayer = MediaPlayer.create(this, R.raw.osudh);
                mediaPlayer.start();
                break;

            }

        }

    }


    public void home_from_vowel(View view) {

        startActivity(new Intent(BengaliVowelActivity.this, MainActivity.class));
    }
}

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

public class BengaliNumberActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_number);


        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-8776197178118665/9102713035");

        AdView mAdView = (AdView) findViewById(R.id.adView6);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }





    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(BengaliNumberActivity.this, ActivityAboutMe.class);
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





    public void onClick_bn(View view) {

        switch (view.getId()) {
            case R.id.ek_one: {
                mediaPlayer = MediaPlayer.create(this, R.raw.one_ek);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.dui: {
                mediaPlayer = MediaPlayer.create(this, R.raw.dui_two);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.tin: {
                mediaPlayer = MediaPlayer.create(this, R.raw.tin_three);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.chaar: {
                mediaPlayer = MediaPlayer.create(this, R.raw.char_four);
                mediaPlayer.start();
                break;
            }

        }



        switch (view.getId()) {
            case R.id.pach: {
                mediaPlayer = MediaPlayer.create(this, R.raw.five_pach);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.choy: {
                mediaPlayer = MediaPlayer.create(this, R.raw.soy_six);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.sat: {
                mediaPlayer = MediaPlayer.create(this, R.raw.shat_seven);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.aat: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aat_eight);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.noy: {
                mediaPlayer = MediaPlayer.create(this, R.raw.noy_nine);
                mediaPlayer.start();
                break;

            }

        }






        switch (view.getId()) {
            case R.id.dosh: {
                mediaPlayer = MediaPlayer.create(this, R.raw.dosh_ten);
                mediaPlayer.start();
                break;

            }

        }

    }




    public void home_from_bengali_numbers(View view) {

        startActivity(new Intent(BengaliNumberActivity.this, MainActivity.class));
    }
}

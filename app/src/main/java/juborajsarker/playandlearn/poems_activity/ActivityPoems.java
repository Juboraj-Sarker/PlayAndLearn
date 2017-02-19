package juborajsarker.playandlearn.poems_activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import juborajsarker.playandlearn.ActivityAboutMe;
import juborajsarker.playandlearn.MainActivity;
import juborajsarker.playandlearn.R;

public class ActivityPoems extends AppCompatActivity {

    ImageView twinckle, abc, kathbirali;
    VideoView videoView;
    MediaController mediaC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poems);

        twinckle = (ImageView) findViewById(R.id.twinckle);
        abc = (ImageView) findViewById(R.id.abc);
        kathbirali = (ImageView) findViewById(R.id.kathbirali);

        videoView = (VideoView) findViewById(R.id.videoView);
        mediaC = new  MediaController (this);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6975935091508632/3744614107");

        AdView mAdView = (AdView) findViewById(R.id.adView7);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.home, menu);
        inflater.inflate(R.menu.menu_for_all, menu);


        return true;
    }

    public void home(MenuItem item) {

        Intent homeIntent = new Intent(ActivityPoems.this, MainActivity.class);
        startActivity(homeIntent);
    }





    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(ActivityPoems.this, ActivityAboutMe.class);
        startActivity(about_me);
    }

    public void twinckle(View view) {


        String videoPath = "android.resource://juborajsarker.playandlearn/"+ R.raw.twinkle_twinkle_little_star;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
    }

    public void abc(View view) {


        String videoPath = "android.resource://juborajsarker.playandlearn/"+ R.raw.abc_new;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();

    }

    public void kathbirali(View view) {

        String videoPath = "android.resource://juborajsarker.playandlearn/"+ R.raw.kathbirali;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();

    }
}
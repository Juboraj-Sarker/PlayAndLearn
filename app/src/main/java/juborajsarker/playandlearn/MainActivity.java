package juborajsarker.playandlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import juborajsarker.playandlearn.bengali_activity.BengaliAlphabeticActivity1;
import juborajsarker.playandlearn.bengali_activity.BengaliNumberActivity;
import juborajsarker.playandlearn.bengali_activity.BengaliVowelActivity;
import juborajsarker.playandlearn.english_activity.EnglishAlphabeticActivity1;
import juborajsarker.playandlearn.english_activity.EnglishNumberActivity;
import juborajsarker.playandlearn.poems_activity.ActivityPoems;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6975935091508632/5199497704");

        AdView mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }



    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(MainActivity.this, ActivityAboutMe.class);
        startActivity(about_me);
    }

    public void alphabetic_activity(View view) {

        startActivity(new Intent(MainActivity.this, EnglishAlphabeticActivity1.class));
    }

    public void numerical_activity(View view) {

        startActivity(new Intent(MainActivity.this, EnglishNumberActivity.class));

    }

    public void color(View view) {
        startActivity(new Intent(MainActivity.this, BengaliVowelActivity.class));


    }

    public void bengali_activity(View view) {

        startActivity(new Intent(MainActivity.this, BengaliAlphabeticActivity1.class));
    }

    public void bengali_number(View view) {

        startActivity(new Intent(MainActivity.this, BengaliNumberActivity.class));
    }

    public void kobita(View view) {

        startActivity(new Intent(MainActivity.this, ActivityPoems.class));


    }
}

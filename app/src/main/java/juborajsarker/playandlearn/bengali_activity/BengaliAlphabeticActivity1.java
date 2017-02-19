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

import juborajsarker.playandlearn.ActivityAboutMe;
import juborajsarker.playandlearn.MainActivity;
import juborajsarker.playandlearn.R;

public class BengaliAlphabeticActivity1 extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_alphabetic1);

        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }



    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(BengaliAlphabeticActivity1.this, ActivityAboutMe.class);
        startActivity(about_me);
    }
    public void home(MenuItem item) {

        Intent homeIntent = new Intent(BengaliAlphabeticActivity1.this, MainActivity.class);
        startActivity(homeIntent);
    }


    private void createDialog() {

        dialog=new Dialog(this);

        //SET TITLE
        dialog.setTitle("A for Apple");

        //set content
        dialog.setContentView(R.layout.custom_layout);


        cancelBtn= (ImageView) dialog.findViewById(R.id.cancelTxt);

    }







    public void onClick_b(View view) {

        switch (view.getId()) {
            case R.id.ka: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa1);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.kha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa2);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.ga: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa3);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.gha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa4);
                mediaPlayer.start();
                break;
            }

        }



        switch (view.getId()) {
            case R.id.ungo: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa5);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.ca: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa6);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.cha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa7);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.ja: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa8);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.jha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa9);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.eiyo: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa10);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.ta: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa11);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.tha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa12);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.da: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa13);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.dha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa14);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.nio: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa15);
                mediaPlayer.start();
                break;

            }

        }




    }











    public void goto_second_bengali(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity1.this, BengaliAlphabeticActivity2.class));
    }

    public void home_from_bengali1(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity1.this, MainActivity.class));
    }
}

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

public class BengaliAlphabeticActivity2 extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_alphabetic2);

        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);
        return true;
    }

    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(BengaliAlphabeticActivity2.this, ActivityAboutMe.class);
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







    public void onClick_b2(View view) {

        switch (view.getId()) {
            case R.id.to: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa16);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.tho: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa17);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.doo: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa18);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.dho: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa19);
                mediaPlayer.start();
                break;
            }

        }



        switch (view.getId()) {
            case R.id.no: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa20);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.pa: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa21);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.fa: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa22);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.ba: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa23);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.bha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa24);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.ma: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa25);
                mediaPlayer.start();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.jo: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa26);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.ra: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa27);
                mediaPlayer.start();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.la: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa28);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.sha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa29);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.ssha: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aaa30);
                mediaPlayer.start();
                break;

            }

        }




    }








    public void back(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity2.this, BengaliAlphabeticActivity1.class));
    }

    public void mainPage(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity2.this, MainActivity.class));

    }

    public void goto_third_bengali(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity2.this, BengaliAlphabeticActivity3.class));
    }
}

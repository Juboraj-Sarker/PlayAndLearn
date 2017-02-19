package juborajsarker.playandlearn.english_activity;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import juborajsarker.playandlearn.ActivityAboutMe;
import juborajsarker.playandlearn.MainActivity;
import juborajsarker.playandlearn.R;

public class EnglishAlphabeticActivity2 extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabetic2);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-8776197178118665/4672513435");

        AdView mAdView = (AdView) findViewById(R.id.adView4);
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

        Intent about_me = new Intent(EnglishAlphabeticActivity2.this, ActivityAboutMe.class);
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



    public void alphabetic_first(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity2.this, EnglishAlphabeticActivity1.class));
    }


    public void onClick2(View view) {

        switch (view.getId()) {
            case R.id.p: {
                mediaPlayer = MediaPlayer.create(this, R.raw.pp);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("P for Pizza");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("P for Pizza");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.p);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.q: {
                mediaPlayer = MediaPlayer.create(this, R.raw.qq);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("Q for Queen");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("Q for Queen");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.q);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.r: {
                mediaPlayer = MediaPlayer.create(this, R.raw.rr);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("R for Rose");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("R for Rose");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.r);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.s: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ss);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("S for Superman");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("S for Superman");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.s);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
            }

        }



        switch (view.getId()) {
            case R.id.t: {
                mediaPlayer = MediaPlayer.create(this, R.raw.tt);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("T for Tiger");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("T for Tiger");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.t);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.u: {
                mediaPlayer = MediaPlayer.create(this, R.raw.uu);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("U for Umbrella");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("U for Umbrella");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.u);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.v: {
                mediaPlayer = MediaPlayer.create(this, R.raw.vv);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("V for Vegetables");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("V for Vegetables");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.v);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.w: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ww);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("W for Window");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("W for window");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.w);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.x: {
                mediaPlayer = MediaPlayer.create(this, R.raw.xx);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("X for X-Ray");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("X for X-Ray");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.x);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.y: {
                mediaPlayer = MediaPlayer.create(this, R.raw.yy);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("Y for Yellow");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("Y for Yellow");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.y);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }




        switch (view.getId()) {
            case R.id.z: {
                mediaPlayer = MediaPlayer.create(this, R.raw.zz);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("Z for Zebra");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("Z for Zebra");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.z);


                ImageView cancelTxt = (ImageView)dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }




    }

    public void goto_home2(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity2.this, MainActivity.class));
    }
}
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
import android.widget.Toast;

import juborajsarker.playandlearn.ActivityAboutMe;
import juborajsarker.playandlearn.MainActivity;
import juborajsarker.playandlearn.R;

public class EnglishAlphabeticActivity1 extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabetic1);

        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();



    }




    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }



    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(EnglishAlphabeticActivity1.this, ActivityAboutMe.class);
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




    public void goto_second_alphabetic(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity1.this, EnglishAlphabeticActivity2.class));
    }


    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.a: {
                mediaPlayer = MediaPlayer.create(this, R.raw.aa);
                mediaPlayer.start();
                dialog.show();
                Toast.makeText(this, "A for Apple", Toast.LENGTH_SHORT).show();

                break;

            }

        }


        switch (view.getId()) {
            case R.id.cancelTxt: {
                dialog.dismiss();
                break;

            }

        }



        switch (view.getId()) {
            case R.id.b: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bb);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("B for Ball");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("B for Ball");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.b);


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
            case R.id.c: {
                mediaPlayer = MediaPlayer.create(this, R.raw.cc);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("C for Cat");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("C for Cat");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.c);


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
            case R.id.d: {
                mediaPlayer = MediaPlayer.create(this, R.raw.dd);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("D for Dog");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("D for Dog");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.d);


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
            case R.id.e: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ee);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("E for Elephant");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("E for Elephant");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.e);


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
            case R.id.f: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ff);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("F for Frog");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("F for Frog");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.f);


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
            case R.id.g: {
                mediaPlayer = MediaPlayer.create(this, R.raw.gg);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("G for Goat");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("G for Goat");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.g);


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
            case R.id.h: {
                mediaPlayer = MediaPlayer.create(this, R.raw.hh);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("H for Horse");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("H for Horse");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.h);


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
            case R.id.i: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ii);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("I for Internet");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("I for Internet");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.i);


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
            case R.id.j: {
                mediaPlayer = MediaPlayer.create(this, R.raw.jj);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("J for Jug");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("J for Jug");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.j);


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
            case R.id.k: {
                mediaPlayer = MediaPlayer.create(this, R.raw.kk);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("K for Kangaroo");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("K for Kangaroo");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.f);


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
            case R.id.l: {
                mediaPlayer = MediaPlayer.create(this, R.raw.ll);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("L for Lion");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("L for Lion");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.l);


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
            case R.id.m: {
                mediaPlayer = MediaPlayer.create(this, R.raw.mm);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("M for Monkey");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("M for Monkey");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.m);


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
            case R.id.n: {
                mediaPlayer = MediaPlayer.create(this, R.raw.nn);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("N for Nut");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("N for Nut");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.n);


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
            case R.id.o: {
                mediaPlayer = MediaPlayer.create(this, R.raw.oo);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("O for Orange");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("O for Orange");

                ImageView image = (ImageView)dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.o);


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

    public void goto_home(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity1.this, MainActivity.class));


    }
}


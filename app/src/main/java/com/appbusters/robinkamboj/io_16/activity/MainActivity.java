package com.appbusters.robinkamboj.io_16.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.appbusters.robinkamboj.io_16.R;
import com.bumptech.glide.Glide;

//api key: 13befb0c6409e8c61c5e9ec4265a1d1c

public class MainActivity extends AppCompatActivity {

    ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        Glide
                .with(this)
                .load("http://vignette4.wikia.nocookie.net/batman/images/2/2f/Robin.jpg/revision/latest?cb=20080527194531")
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .crossFade()
                .into(imageView1);

        Glide
                .with(this)
                .load("https://www.allaboutbirds.org/guide/PHOTO/LARGE/009538-060-02.jpg")
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .crossFade()
                .into(imageView2);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
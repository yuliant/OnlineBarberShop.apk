package com.example.android.onlinebarbershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
LinearLayout alamat;
LinearLayout web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        alamat = (LinearLayout) findViewById(R.id.alamat);
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://bit.ly/2nOSHR8"));
                startActivity(intent);
            }
        });

        web = (LinearLayout) findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://therootsbarbershop.com/"));
                startActivity(intent);
            }
        });
    }
    public void undercut(View view) {
        Intent intent = new Intent(Home.this, UnderCut.class);
        startActivity(intent);
    }
    public void desainer(View view) {
        Intent intent = new Intent(Home.this, desainer.class);
        startActivity(intent);
    }
    public void owner(View view) {
        Intent intent = new Intent(Home.this, owner.class);
        startActivity(intent);
    }
    public void fade(View view) {
        Intent intent = new Intent(Home.this, fade.class);
        startActivity(intent);
    }
    public void manbun(View view) {
        Intent intent = new Intent(Home.this, manbun.class);
        startActivity(intent);
    }
    public void pompadour(View view) {
        Intent intent = new Intent(Home.this, pompadour.class);
        startActivity(intent);
    }
    public void sbs(View view) {
        Intent intent = new Intent(Home.this, sbs.class);
        startActivity(intent);
    }
    public void sidepart(View view) {
        Intent intent = new Intent(Home.this, sidepart.class);
        startActivity(intent);
    }
    public void top(View view) {
        Intent intent = new Intent(Home.this, top.class);
        startActivity(intent);
    }
}

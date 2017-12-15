package com.example.android.onlinebarbershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {
LinearLayout alamat;
LinearLayout web;

int harga_fade = 15000;
int harga_manbun = 15000;
int harga_pompadour = 15000;
int harga_sbs = 15000;
int harga_sidepart = 15000;
int harga_topknot = 15000;
int harga_undercut = 15000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView fade = (TextView) findViewById(R.id.harga_fade);
        fade.setText("Rp. "+harga_fade);
        TextView manbun = (TextView) findViewById(R.id.harga_manbun);
        manbun.setText("Rp. "+harga_manbun);
        TextView pompadour = (TextView) findViewById(R.id.harga_pompadour);
        pompadour.setText("Rp. "+harga_pompadour);
        TextView sbs = (TextView) findViewById(R.id.harga_sbs);
        sbs.setText("Rp. "+harga_sbs);
        TextView sidepart = (TextView) findViewById(R.id.harga_sidepart);
        sidepart.setText("Rp. "+harga_sidepart);
        TextView topknot = (TextView) findViewById(R.id.harga_topknot);
        topknot.setText("Rp. "+harga_topknot);
        TextView undercut = (TextView) findViewById(R.id.harga_undercut);
        undercut.setText("Rp. "+harga_undercut);

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

package com.example.android.onlinebarbershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class desainer extends AppCompatActivity {
LinearLayout alex;
LinearLayout sitompul;
LinearLayout wakdoyok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desainer);

        alex = (LinearLayout) findViewById(R.id.alex);
        alex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/alexabbad/?hl=id"));
                startActivity(intent);
            }
        });

        sitompul = (LinearLayout) findViewById(R.id.sitompul);
        sitompul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/henochsitompul/?hl=id"));
                startActivity(intent);
            }
        });
        wakdoyok = (LinearLayout) findViewById(R.id.wakdoyok);
        wakdoyok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/wakdoyok/?hl=id"));
                startActivity(intent);
            }
        });

    }
}

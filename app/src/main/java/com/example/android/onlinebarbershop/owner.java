package com.example.android.onlinebarbershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class owner extends AppCompatActivity {

    ImageView instagram;
    ImageView facebook1;
    ImageView git;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        String text2 = "Nama saya adalah Masrizal Eka Yulinto."+
                " Lahir di Sidoarjo tanggal 04 Juli 1997, saya pernah mengenyam pendidikan di SMA Negeri 3 Sidoarjo."+
                " dan sekarang saya sedang berjuang untuk memperoleh gelar sarjana S1 teknik informatika di Universitas Muhammadiyah Sidoarjo.\n";

        WebView riwayat2 = (WebView) findViewById(R.id.riwayat2);
        riwayat2.loadData("<p style=\"text-align: justify\">"+ text2 +"</p>", "text/html", "UTF-8");

        String text3="Saya adalah developer dari aplikasi ini. "+
                "Aplikasi ini saya buat dengan tujuan untuk menyelesaikan Postest Praktikum yang saya ikuti. "+
                "Saya membuat aplikasi BARBER SHOP ONLINE dimana akan mempermudah dalam hal mencukur rambut. " +
                "Karena dengan aplikasi ini anda tidak perlu datang ke tempat cukur rambut. " +
                "Cukup pesan , dan kami akan menyambangi rumah anda. " +
                "Secara khusus, saya juga membagikan source code aplikasi ini diakun github saya. "+
                "Saya harap aplikasi yang saya bagikan dapat berguna bagi orang lain dan dapat dikembangkan secara signifikan";

        WebView riwayat3 = (WebView) findViewById(R.id.riwayat3);
        riwayat3.loadData("<p style=\"text-align: justify\">"+ text3 +"</p>", "text/html", "UTF-8");

        instagram = (ImageView) findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/masrizaleka/"));
                startActivity(intent);
            }
        });

        facebook1 = (ImageView) findViewById(R.id.facebook1);
        facebook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/rizal.ekayulianto"));
                startActivity(intent);
            }
        });

        git = (ImageView) findViewById(R.id.git);
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/yuliant"));
                startActivity(intent);
            }
        });
    }
}

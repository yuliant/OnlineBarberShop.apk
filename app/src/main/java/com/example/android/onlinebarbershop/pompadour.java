package com.example.android.onlinebarbershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

public class pompadour extends AppCompatActivity {
    int quantity = 15000;
    String gaya="Pompadour";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pompadour);
        String text = "Pompadour pada umumnya ditandai dengan volume rambut yang banyak pada bagian " +
                "atasnya. Jenis rambut pria Pompadour ini banyak sekali jenisnya dan untuk membuat " +
                "gaya rambut ini lebih rapih sebaiknya kamu juga menggunakan pomade agar kegantengan " +
                "menggunakan rambut pompadour ini lebih maksimal.";

        WebView riwayat = (WebView) findViewById(R.id.deskripsi);
        riwayat.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
    }
    private String createOrderSummary(String name,String alamat,String telp){
        String priceMessage="Name : "+name;
        priceMessage +="\nAlamat : "+alamat;
        priceMessage +="\nNo. Telp : "+telp;
        priceMessage +="\nHarga Rp. "+quantity;
        priceMessage +="\nTerima Kasih!";
        return priceMessage;
    }
    public void pesan(View view){

        EditText text = (EditText)findViewById(R.id.nama);
        String name = text.getText().toString();

        EditText text2 = (EditText)findViewById(R.id.alamat);
        String alamat = text2.getText().toString();

        EditText text3 = (EditText)findViewById(R.id.telp);
        String telp = text3.getText().toString();

        if(text.length()==0||text2.length()==0||text3.length()==0){
            Toast.makeText(this, "Isi dulu bro !!!", Toast.LENGTH_SHORT).show();
        }else{
            String priceMessage=createOrderSummary(name,alamat,telp);

            Intent intent=new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto: masrizal04@gmail.com")); //hanya email app yang bisa menangani ini
            intent.putExtra(Intent.EXTRA_SUBJECT,gaya+" Bang!!! dari "+name);
            intent.putExtra(Intent.EXTRA_TEXT,priceMessage);
            if(intent.resolveActivity(getPackageManager())!=null){
                startActivity(intent);
            }
        }
//====================

    }
}

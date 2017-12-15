package com.example.android.onlinebarbershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sidepart extends AppCompatActivity {
    int quantity = 15000;
    String gaya="Sidepart";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidepart);

        TextView quantityTextView = (TextView) findViewById(R.id.harga_sidepart);
        quantityTextView.setText("Rp. "+quantity);

        String text = "Model rambut ini biasa kita kenal dengan model rambut belah samping atau " +
                "belang pinggir. Model ini sudah sangat umum di lingkungan kita dan masih tetap " +
                "eksis hingga sekarang. Kalangan professional umumnya memakai potongan rambut ini " +
                "karna terlihat rapih dan tidak terkesan aneh-aneh. Setidaknya pasti kamu pernah " +
                "menggunakan model rambut belah pinggir ini kan atau mungkin memang model belah " +
                "pinggir ini yang sedang kamu gunakan saat ini.";

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

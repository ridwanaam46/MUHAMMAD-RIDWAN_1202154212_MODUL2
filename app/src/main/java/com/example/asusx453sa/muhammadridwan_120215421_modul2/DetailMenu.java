package com.example.asusx453sa.muhammadridwan_120215421_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    private TextView Nmenu,harga,komposisimenu;
    private ImageView imgmenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //inisiasi id yang sesuai

        Nmenu = (TextView) findViewById(R.id.namamenu);
        harga= (TextView) findViewById(R.id.textView_harga);
        komposisimenu = (TextView) findViewById(R.id.textView_komposisi);
        imgmenu = (ImageView) findViewById(R.id.image_img);


//melalukan get data dari menu
        Intent data = getIntent();
        String menu = data.getStringExtra("menu");
        String hrga = data.getStringExtra("harga");
        String kmposisi= data.getStringExtra("komposisi");
        Integer gmbr = data.getIntExtra("gambar",0);

        //melakukan setText untukk data dari activity sebelumnya
        Nmenu.setText(menu);
        harga.setText(hrga);
        komposisimenu.setText(kmposisi);
        imgmenu.setImageResource(gmbr);
    }}
package com.example.asusx453sa.muhammadridwan_120215421_modul2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;

    //Daftar Menu makanan yang akan di tampilkan
    private String[] Judulmenu = {"Nasi Goreng",
            "Mie Goreng Spesial",
            "Mie Kuah Spesial",
            "Sate Madura",
            "Nasi Wagyu",
            "Mie Kuah Upnormal",
            "nasi goreng Bawang"};

    //daftar harga yang akan di tampilka
    private String[] HargaM = {"Rp.15000",
            "Rp.10000",
            "Rp.10000",
            "Rp.25000",
            "Rp.30000",
            "Rp.15000",
            "Rp.250000"};

    //Daftar Gambar yang akan muncul
    private int[] Gambar = {R.drawable.nasigoreng,
            R.drawable.miegoteng,
            R.drawable.miekuah,
            R.drawable.satemadura,
            R.drawable.nasiwagyu,
            R.drawable.miekuahupnormal,
            R.drawable.nasigorengbawang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);


//mendeklrasikan array data menu, harga, image
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        //inisisasi
        rvView = (RecyclerView) findViewById(R.id.Rview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);

    }
    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem() {
        for (int w = 0; w < Judulmenu.length; w++) {
            dataMenu.add(Judulmenu[w]);
            dataHarga.add(HargaM[w]);
            gambar.add(Gambar[w]);
        }
    }
}




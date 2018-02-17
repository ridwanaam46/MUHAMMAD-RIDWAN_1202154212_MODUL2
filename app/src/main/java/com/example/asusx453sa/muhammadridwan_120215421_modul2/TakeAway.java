package com.example.asusx453sa.muhammadridwan_120215421_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
Button buttonP;
EditText nama, phone, alamat, catatn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        Toast.makeText(TakeAway.this,"Take Away", Toast.LENGTH_LONG).show();
        //mencari id

        nama = (EditText)findViewById(R.id.editText_nama);
        phone = (EditText)findViewById(R.id.editText_phone);
        alamat = (EditText)findViewById(R.id.editText_alamat);
        catatn = (EditText)findViewById(R.id.editText_catatan);
        buttonP = (Button)findViewById(R.id.button_pilihpesanan);


//memberikan aksi perintah ketika diklik

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mnengcek form naam
                if(nama.getText().toString().length()==0){
                    nama.setError("harap isi nama");
                    Toast.makeText(TakeAway.this,"isi dulu nama", Toast.LENGTH_SHORT).show();

                }else if (phone.getText().toString().length()==0){
                    phone.setError("harap masukan no phone ");
                    Toast.makeText(TakeAway.this,"isi dulu no hp", Toast.LENGTH_SHORT).show();
                }else if(alamat.getText().toString().length()==0){
                    alamat.setError("harap masukan alamat");
                    Toast.makeText(TakeAway.this,"isi dulu alamat", Toast.LENGTH_SHORT).show();
                }else if (catatn.getText().toString().length()==0){
                    catatn.setError("harap masukan catatan");
                    Toast.makeText(TakeAway.this,"isi dulu catatn", Toast.LENGTH_SHORT).show();
                }else {
                    Intent take = new Intent(TakeAway.this, DaftarMenu.class);
                    startActivity(take);
                    Toast.makeText(TakeAway.this,"Terima Kasih telah menginputkan data", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}

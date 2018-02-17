package com.example.asusx453sa.muhammadridwan_120215421_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MenuUtama extends AppCompatActivity {
    TextView pilihmenu;
    RadioButton Dinein, Takeaway;
    Button btnpesansekarang;
    RadioGroup radiogrup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

//mencari id yang sesuai

        pilihmenu = (TextView)findViewById(R.id.pilihmenu);
        Dinein = (RadioButton)findViewById(R.id.radioButton_DineIn);
        Takeaway = (RadioButton)findViewById(R.id.radioButton_TakeAway);
        btnpesansekarang = (Button)findViewById(R.id.button_pesansekarang);
        radiogrup = (RadioGroup)findViewById(R.id.grupradio);


        //membuat perinta ketika button di klik dan agar bisa berpindah activity
btnpesansekarang.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int selectIid = radiogrup.getCheckedRadioButtonId();
        if (selectIid == Dinein.getId()) {
            Intent intentD = new Intent(MenuUtama.this, DIneIn.class);
            startActivity(intentD);
        }if(selectIid == Takeaway.getId()){
            Intent intentD = new Intent(MenuUtama.this,TakeAway.class);
            startActivity(intentD);
        }

    }
});
    }
}

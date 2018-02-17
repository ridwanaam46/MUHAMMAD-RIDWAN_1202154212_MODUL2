package com.example.asusx453sa.muhammadridwan_120215421_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DIneIn extends AppCompatActivity {
Spinner SP;
Button btnpesnanan2;
EditText nmcostumer;

    String[] items = {
            "Meja 1",
            "Meja 2",
            "Meja 3",
            "Meja 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);




//inisiasi sesuai id

        nmcostumer = (EditText)findViewById(R.id.editText_costumer);

        SP = (Spinner) findViewById(R.id.spinner);
        btnpesnanan2 = (Button)findViewById(R.id.button_pilihpesanan2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        SP.setAdapter(adapter);

        Toast.makeText(DIneIn.this,"Dine In", Toast.LENGTH_LONG).show();

        //memberikan aksi ketika spinner di klik

        SP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int index = SP.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), items[index] + " Telah terpilih" ,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


            public  void onNothingSeleted(AdapterView<?>View){}
        });

        //memberikan aksi ketika buttuon diklik agar bisa berpindah acivity

btnpesnanan2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (nmcostumer.getText().toString().length()==0){
            nmcostumer.setError(" harap isi dulu nama");
            Toast.makeText(DIneIn.this,"isi dulu nama terlebih dahulu", Toast.LENGTH_SHORT).show();

        }else {

        Intent a = new Intent(DIneIn.this, DaftarMenu.class);
        startActivity(a);
            Toast.makeText(DIneIn.this,"terimakasih telah menginputkan nama", Toast.LENGTH_SHORT).show();

        }

    }
});

    }
}

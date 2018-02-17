package com.example.asusx453sa.muhammadridwan_120215421_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS X453SA on 2/17/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private ArrayList<String> rvDatamenu,rvHarga;
    private ArrayList<Integer> rvImg;


    public RecyclerViewAdapter(ArrayList<String> dataMenu, ArrayList<String> dataHarga, ArrayList<Integer> gambar) {

        rvDatamenu = dataMenu;
        rvHarga = dataHarga;
        rvImg = gambar;

    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            tvTitle = (TextView) itemView.findViewById(R.id.tittle);
            tvSubtitle = (TextView) itemView.findViewById(R.id.sub_tittle);
            a = (ImageView) itemView.findViewById(R.id.image_gambar);
            ItemList = itemView.findViewById(R.id.layout_item);

            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myintent = new Intent(context,DetailMenu.class);
                    String resep = "";
                    switch (getAdapterPosition()){

                        case 0 :
                            myintent.putExtra("menu",rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            resep = "Nasi,Kecap, cabe, garam, sayur, daging";
                            myintent.putExtra("komposisi",resep);
                            context.startActivity(myintent);
                            break;
                        case 1 :
                            myintent.putExtra("menu",rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                          resep = "Mie, sayur, tomat, garam, cabe";
                            myintent.putExtra("komposisi",resep);
                            context.startActivity(myintent);
                            break;

                        case 2 :
                            myintent.putExtra("judul",rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            resep= "Air, garam, mie, daging, telur";
                            myintent.putExtra("komposisi",resep);
                            context.startActivity(myintent);
                            break;
                        case 3 :
                            myintent.putExtra("judul",rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            resep = "daging, keceap, nasi, sayur";
                            myintent.putExtra("komposisi",resep);
                            context.startActivity(myintent);
                            break;
                        case 4 :
                            myintent.putExtra("menu",rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            resep = "Nasi, daging sapi, telur, sayur, tomat";
                            myintent.putExtra("komposisi",resep);
                            context.startActivity(myintent);
                            break;
                        case 5 :
                            myintent.putExtra("menu",rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            resep = "Mie, air , nasi, saledri ,tomat";
                            myintent.putExtra("komposisi", resep);
                            context.startActivity(myintent);
                            break;
                        case 6 :
                            myintent.putExtra("menu",rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            resep = "Nasi, baeang ,telur, cabe ,tomat";
                            myintent.putExtra("komposisi",resep);
                            context.startActivity(myintent);
                            break;
                    }
                }
            });
        }
    }
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vholder = new ViewHolder(v);
        return vholder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        final String name = rvDatamenu.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = rvImg.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.a.setImageResource(test);


    }

    @Override
    public int getItemCount() {
        return rvDatamenu.size();
    }
}

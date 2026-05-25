package com.example.tugas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {
    private List<com.example.tugas.Penjualan> listPenjualan;
    private Context context;
    public adpater(Context context, List<com.example.tugas.Penjualan>list){
        this.context = context;
        this.listPenjualan = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,return new ViewHolder(view));
    }
    public void  onBindViewHolder(ViewHolder holder, int position){
        com.example.tugas.Penjualan pnj = listPenjualan.get(position);
        holder.tvNama.setText(pnj.getNama());
        holder.tvDesk.setText(pnj.getDeskripsi());
        holder.tvRating.setText("Rating :" + pnj.getRating());
        holder.tvHarga.setText(pnj.getHarga());
        holder.imgMakanan.setText(pnj.getGambar());
    }
    @Override
    public int getItemCount(){ return listPenjualan.size();}
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNama, tvDesk, tvRating, tvHarga;
        ImageView imgMakanan;
        public ViewHolder(View itemView){
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvDesk = itemView.findViewById(R.id.tvDesk);
            tvRating = itemView.findViewById(R.id.tvRating);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            imgMakanan = itemView.findViewById(R.id.imgMakanan);

        }
    }
}

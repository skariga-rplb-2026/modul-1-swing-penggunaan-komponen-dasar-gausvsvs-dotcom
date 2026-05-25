package com.example.detailactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.detailactivity.R;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {

    private List<Mahasiswa> listMahasiswa;
    private Context context;
    public MahasiswaAdapter(Context context, List<Mahasiswa> list){
        this.context = context;
        this.listMahasiswa = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.item_mahasiswa,parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Mahasiswa mhs = listMahasiswa.get(position);
        holder.tvNama.setText(mhs.getNama());
        holder.tvNIM.setText("Nim :" + mhs.getNIM());
        holder.tvProdi.setText(mhs.getProdi());
        holder.tvIpk.setText("IPK :" + mhs.getIpk());
    }
    @Override
    public int getItemCount (){ return listMahasiswa.size();}

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNama, tvNIM, tvProdi, tvIpk;
        public ViewHolder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNIM = itemView.findViewById(R.id.tvNIM);
            tvProdi = itemView.findViewById(R.id.tvProdi);
            tvIpk = itemView.findViewById(R.id.tvIpk);
        }
    }
}

package com.example.detailactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rc;
    MahasiswaAdapter adapter;
    private List<Mahasiswa> listSiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rc = findViewById(R.id.rc);
        rc.setLayoutManager(new LinearLayoutManager(this));

        isiDataSiswa();

        adapter = new MahasiswaAdapter(this,listSiswa);
        rc.setAdapter(adapter);
    }
    private void isiDataSiswa(){
        listSiswa.add(new Mahasiswa("Agni","23220001","Teknik Informatika",9.0));
        listSiswa.add(new Mahasiswa("Alexa","23220002","Sistem Informasi",8.5));
        listSiswa.add(new Mahasiswa("Marsha","23220003","Manajemen Informatika",9.5));
        listSiswa.add(new Mahasiswa("Elva","23220004","Teknik Informatika",8.0));
        listSiswa.add(new Mahasiswa("Mutia","23220005","Sistem Informasi",9.0));

    }
}
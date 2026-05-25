package com.example.detailactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView tvNm, tvNim, tvPs;
    Button btnK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        tvNm = findViewById(R.id.tvNm);
        tvNim = findViewById(R.id.tvNIM);
        tvPs = findViewById(R.id.tvPs);
        btnK = findViewById(R.id.btnK);

        String nm = getIntent().getStringExtra("nm");
        String nim = getIntent().getStringExtra("nim");
        String ps = getIntent().getStringExtra("ps");

        tvNm.setText("Nama : " + nm);
        tvNim.setText("Nim : " + nim);
        tvPs.setText("Priodi : " + ps);

        findViewById(R.id.btnK).setOnClickListener(view -> finish());
    }
}
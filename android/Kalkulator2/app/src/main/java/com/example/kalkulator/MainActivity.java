package com.example.kalkulator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText eta1, eta2;
    Button btnTm, btnKr, btnKl, btnBg;
    TextView tvHsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Binding view
        eta1 = findViewById(R.id.eta1);
        eta2 = findViewById(R.id.eta2);
        btnTm = findViewById(R.id.btnTm);
        btnKr = findViewById(R.id.btnKr);
        btnKl = findViewById(R.id.btnKl);
        btnBg = findViewById(R.id.btnBg);
        tvHsl = findViewById(R.id.tvHsl);

        btnTm.setOnClickListener(v -> hitung("+"));
        btnKr.setOnClickListener(view -> hitung("-"));
        btnKl.setOnClickListener(view -> hitung("x"));
        btnBg.setOnClickListener(view -> hitung("/"));
    }
    private void hitung(String o){
        String s1 = eta1.getText().toString().trim();
        String s2 = eta2.getText().toString().trim();

        if (s1.isEmpty() || s2.isEmpty()){
            Toast.makeText(this,"Isi kedua angka!!",Toast.LENGTH_SHORT).show();
            return;
        }
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double hasil;

        switch (o) {
            case "+": hasil = a + b;
            break;
            case "-": hasil = a-b;
            break;
            case "x": hasil = a*b;
            break;
            case "/":
                if (b==0){
                    tvHsl.setText("Error:Tidak bisa dengan 0!");
                    return;
                }
                hasil = a/b;
                break;
            default:return;
        }
        if (hasil == (long) hasil){
            tvHsl.setText("Hasil:" + (long)hasil);
        }else{
            tvHsl.setText(("Hasil: ") + hasil);
        }
    }
}
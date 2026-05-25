package com.example.detailactivity;
public class Mahasiswa {
    private String Nama;
    private String NIM;

    private String Prodi;
    private double Ipk;

    public Mahasiswa (String nama, String nim, String ps, double ipk){
        this.Nama = nama;
        this.NIM = nim;
        this.Prodi = ps;
        this.Ipk = ipk;
    }

    public String getNama() {
        return Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getProdi() {
        return Prodi;
    }

    public double getIpk() {
        return Ipk;
    }
}

package com.example.tugas;
public class Penjualan {
    private String Nama;
    private String Deskripsi;
    private double Rating;
    private String Harga;
    private int Gambar;

    public Penjualan (String nama,String deskripsi, double rating, String harga, int gambar){
        this.Nama= nama;
        this.Deskripsi= deskripsi;
        this.Rating = rating;
        this.Harga = harga;
        this.Gambar = gambar;
    }
    public String getNama(){return Nama;}
    public String getDeskripsi(){return Deskripsi;}
    public String getHarga(){return Harga;}

    public double getRating(){return Rating;}
    public String getGambar(){return Gambar;}
}

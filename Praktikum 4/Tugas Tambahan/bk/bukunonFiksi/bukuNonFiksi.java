/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : bukuNonFiksi.java
 * Deskripsi    : Representasi dari objek buku non fiksi, turunan kelas buku
 */

package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukuNonFiksi extends Buku{
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this. harga = harga;
    }
    public String getSubjek(){
        return subjek;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setSubjek(String subjek){
        this.subjek = subjek;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view(){
        super.view();
        System.out.println("Subjek          : " + subjek);
        System.out.println("Jumlah halaman  : " + jumlahHalaman);
        System.out.println("Harga           : " + harga);
    }

}


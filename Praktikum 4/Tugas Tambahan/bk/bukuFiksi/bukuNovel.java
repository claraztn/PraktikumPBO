/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : bukuNovel.java
 * Deskripsi    : Representasi dari objek buku novel, turunan kelas buku fiksi
 */

package bk.bukuFiksi;

public class bukuNovel extends bukuFiksi{

    public bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }

}

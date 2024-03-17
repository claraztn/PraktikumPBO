/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : bukuAkademik.java
 * Deskripsi    : Representasi dari objek buku akademik, turunan kelas buku non fiksi
 */
package bk.bukunonFiksi;

public class bukuAkademik extends bukuNonFiksi{

    public bukuAkademik(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit, subjek, jumlahHalaman, harga);
    }

}

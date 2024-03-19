/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : Lingkaran.java
 * Deskripsi    : Kelas implementasi IArea berupa cara menghitung luas lingkaran
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
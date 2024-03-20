/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : MLingkaran.java
 * Deskripsi    : Implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran : ");
        Lingkaran L = new Lingkaran(scan.nextDouble());
        System.out.println("Luas lingkaran adalah : " + L.hitungLuas());
        // Lingkaran l = new Lingkaran(10.2);
        // System.out.println("Luas lingkaran dengan "+"jejari 10.2 satuan adalah "+l.hitungLuas());
    }
}

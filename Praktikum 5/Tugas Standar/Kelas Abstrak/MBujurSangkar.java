/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : MBujurSangkar.java
 * Deskripsi    : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}
/* Apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi
 * metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
 * 
 * Jawab :
 * Terjadi error. Karena kelas turunan harus mengimplementasikan metode kelas abstraknya.
 */
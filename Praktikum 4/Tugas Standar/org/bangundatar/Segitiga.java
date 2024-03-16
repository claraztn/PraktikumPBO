/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : Segitiga.java
 * Deskripsi    : Representasi dari objek segitiga, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas,tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi() + " sisi");
    }
}
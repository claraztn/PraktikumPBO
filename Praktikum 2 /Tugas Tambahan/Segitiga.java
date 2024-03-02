/*  Nama        : Clara Zita Nabilla
    NIM         : 24060122130057
    Nama File   : Segitiga.java 
    Deskripsi   : Program class Segitiga
*/

public class Segitiga{

    // Atribut
    private double alas;
    private double tinggi;

    // Konstruktor
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method
    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }
}
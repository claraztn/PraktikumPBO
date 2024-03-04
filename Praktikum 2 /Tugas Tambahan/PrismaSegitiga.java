/*  Nama        : Clara Zita Nabilla
    NIM         : 24060122130057
    Nama File   : PrismaSegitiga.java 
    Deskripsi   : Program class PrismaSegitiga
*/

public class PrismaSegitiga{

    // Atribut
    private Segitiga alas;
    private double tinggiPrisma;

    // Konstruktor
    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public Segitiga getAlas() {
        return alas;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    // Method
    public double hitungLuasPermukaan() {
        return (2 * alas.hitungLuas() + ((alas.getAlas() + alas.getTinggiSegitiga() + alas.sisiMiring()) * tinggiPrisma));
    }

    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }
}

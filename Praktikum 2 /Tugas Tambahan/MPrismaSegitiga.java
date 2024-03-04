/*  Nama        : Clara Zita Nabilla
    NIM         : 24060122130057
    Nama File   : MPrismaSegitiga.java 
    Deskripsi   : Main class dari program PrismaSegitiga
*/

public class MPrismaSegitiga {

    public static void main(String[] args) {
        Segitiga A;
        A = new Segitiga(3, 4);

        PrismaSegitiga pA;
        pA = new PrismaSegitiga(A, 5);

        System.out.println("Luas permukaan prisma segitiga: " + pA.hitungLuasPermukaan());
        System.out.println("Volume prisma segitiga: " + pA.hitungVolume());
    }
}

/*  Nama        : Clara Zita Nabilla
    NIM         : 24060122130057
    Nama File   : MTitik.java 
    Deskripsi   : Main class dari program Titik
*/

public class MTitik{
    public static void main(String[]args){
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);
        
        Titik t3;
        t3 = new Titik(5,6);

        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        // Jarak titik ke pusat
        // getJarakPusat() untuk menghitung jarak sebuah titik dengan titi pusat (0,0).
        System.out.println("Jarak t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ") ke pusat adalah " + t1.getJarakPusat());

        // Refleksi sumbu x
        // refleksiX() melakukan pencerminan titik terhadap sumbu X.
        t1.refleksiX();
        System.out.println("Refleksi sumbu x t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        // Refleski sumbu y
        // refleksiY() melakukan pencerminan titik terhadap sumbu Y.
        t1.refleksiY();
        System.out.println("Refleksi sumbu y t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        // Refleksi sumbu x tanpa mengubah titik aslinya
        // getRefleksiX() menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X.
        Titik tRefleksiX = t2.getRefleksiX();
        System.out.println("Refleksi sumbu x tRefleksiX(" + tRefleksiX.getAbsis() + ", " + tRefleksiX.getOrdinat() + ")");

        // Refleksi sumbu y tanpa mengubah titik aslinya
        // getRefleksiY() menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu Y.
        Titik tRefleksiY = t2.getRefleksiY();
        System.out.println("Refleksi sumbu y tRefleksiY(" + tRefleksiY.getAbsis() + ", " + tRefleksiY.getOrdinat() + ")");
    }
}
// Kesimpulan
/* Berdasarkan implementasi konsep enkapsulasi pada class titik ini, pada hasil eksperimen dapat disimpulkan bahwa
 * program Titik ini telah berhasil membuat objek titik dengan koordinat sumbu x dan sumbu y (x,y) yang telah sesuai.
 * Objek titik tersebut memiliki kemampuan untuk menghitung antara jarak titik ke pusat koordinat (0,0), 
 * serta mampu melakukan operasi refleksi terhadap sumbu x maupun sumbu y dengan metode yang sesuai.
 * Selain itu, program ini juga mampu menghasilkan titik baru yang merupakan hasil refleksi terhadap sumbu x dan sumbu y, 
 * tanpa mengubah titik aslinya. Sehingga, program Titik dapat digunakan untuk mengelola titik-titik dalam sistem koordinat
 * dengan baik dan efisien. */
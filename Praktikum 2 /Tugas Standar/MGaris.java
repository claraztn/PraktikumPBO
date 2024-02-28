/*  Nama        : Clara Zita Nabilla
    NIM         : 24060122130057
    Nama File   : MGaris.java 
    Deskripsi   : Main class dari program Garis
*/

public class MGaris{
    public static void main(String[] args){
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);
    
        Garis G = new Garis(t1, t2);

        Titik tAwal = G.getTitikAwal();
        Titik tAkhir = G.getTitikAkhir();

        System.out.println("Titik Awal  : (" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");

        // Panjang garis
        // getPanjang() menghitung Panjang garis.
        System.out.println("Panjang Garis G : " + G.getPanjang());

        // Gradien garis
        // getGradien() menghitung gradien garis.
        System.out.println("Gradien Garis G : " + G.getGradien());

        // Refleksi sumbu y tanpa mengubah garis aslinya
        // getRefleksiY() menghasilkan garis baru yang merupakan hasil pencerminan dengan sumbu Y.
        Garis getRefleksiY = G.getRefleksiY();
        Titik titikAwalRefleksiY = getRefleksiY.getTitikAwal();
        Titik titikAkhirRefleksiY = getRefleksiY.getTitikAkhir();

        System.out.println("Titik Awal  : (" + titikAwalRefleksiY.getAbsis() + ", " + titikAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" + titikAkhirRefleksiY.getAbsis() + ", " + titikAkhirRefleksiY.getOrdinat() + ")");

        // isTegakLurus(G: Garis) menghasilkan nilai True jika objek garis tegak lurus dengan garis G.    
        System.out.println("Garis G tegak lurus dengan garis GRefleksiY : " + G.isTegakLurus(getRefleksiY));
    }
}
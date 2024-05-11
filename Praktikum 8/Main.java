/*
Nama    : Clara Zita Nabilla
NIM     : 24060122130057
Lab     : B2
*/

public class Main {
    public static void main(String[] args) {

        // Ulat K = new Ulat();
        // Data<Kupu> anu = new Data<>();

        // Kamus
        Ulat K;
        Data<Kupu> anu;

        // Algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
    
}

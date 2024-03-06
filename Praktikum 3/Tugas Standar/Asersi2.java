/** 
 * File         : Asersi2.java
 * Penulis      : Clara Zita Nabilla
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input 
 *                jari-jari lingkaran yang bernilai nol
 */

import static java.lang.Math.PI;

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    } 
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    } 
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+ kelilingLingkaran);
    }
}

/* 
PERTANYAAN:
Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 
JAWAB:
Iya, secara konsep ada yang kurang tepat pada program tersebut. 
Asersi digunakan untuk memeriksa kondisi yang seharusnya selalu benar selama program berjalan.
Dalam konteks ini, asersi sedang digunakan untuk memastikan bahwa jari-jari lingkaran tidak bernilai nol, 
yang seharusnya tidak boleh terjadi dalam konteks perhitungan keliling lingkaran.

Namun, pada program ini, asersi ditempatkan setelah inisialisasi jariJari dengan nilai nol.
Hal ini berarti bahwa asersi tidak akan pernah terjadi, karena nilai jariJari sudah nol sebelum asersi dijalankan.

Sehingga, asersi seharusnya ditempatkan di dalam konstruktor class Lingkaran, tepatnya setelah 'public Lingkaran(double jariJari)'. 
Hal ini karena, asersi bertujuan untuk memastikan bahwa kondisi yang diinginkan terpenuhi saat objek Lingkaran dibuat.
*/
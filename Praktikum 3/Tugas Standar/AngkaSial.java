/** 
 * File         : AngkaSial.java
 * Penulis      : Clara Zita Nabilla
 * Deskripsi    : Program penggunaan exception buatan sendiri 
 *                pengenalan klausa 'throw' dan 'throws'
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}

/* 
PERTANYAAN:
Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java diatas dieksekusi?
Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

JAWAB:
Ketika eksepsi terjadi, karena angka yang diberikan sama dengan 13, maka baris 12 
'System.out.println(angka+" bukan angka sial")' tidak akan dieksekusi. 
Hal ini dikarenakan, program akan langsung beralih ke blok 'catch' setelah 'try',
dan tidak akan melanjutkan eksekusi di dalam metode 'cobaAngka'.

Iya, pada baris 21 yaitu 'catch(AngkaSialException ase)' dieksekusi,
karena berada dalam blok 'catch' yang akan dieksekusi saat terjadi 'AngkaSialException'.
*/
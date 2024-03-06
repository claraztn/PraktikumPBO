/** 
 * File         : ExceptionOnArray.java
 * Penulis      : Clara Zita Nabilla
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library java
 */

public class ExceptionOnArray{
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; //penyebab eksepsi, indeks harusnya sampai 3 saja [3]
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code...");
        }
    }
}

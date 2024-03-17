/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : Main.java
 * Deskripsi    : Driver class untuk buku, buku fiksi, buku novel, buku non fiksi, dan buku akademik
 */

package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    
    public static void main(String[] args) {
        bukuFiksi bukuFiksi1 = new bukuFiksi("Harry Potter", "J. K. Rowling", "1997", "Fantasy", 500, 200000);
        bukuNovel bukuNovel1 = new bukuNovel("Bumi Manusia", "Pramoedya Ananta", "1980", "History", 535, 100000);
        bukuNonFiksi bukuNonFiksi1 = new bukuNonFiksi("Pola Hidup Sehat", "M. Brahim", "2015", "Kesehatan", 100, 85000);
        bukuAkademik bukuAkademik1 = new bukuAkademik("Statistika", "Walpole", "2010", "Pendidikan", 200, 150000);
    
        System.out.println("Buku Fiksi");
        bukuFiksi1.view();
        System.out.println();

        System.out.println("Buku Novel");
        bukuNovel1.view();
        System.out.println();

        System.out.println("Buku Non Fiksi");
        bukuNonFiksi1.view();
        System.out.println();

        System.out.println("Buku Akademik");
        bukuAkademik1.view();
        System.out.println();

    }
}

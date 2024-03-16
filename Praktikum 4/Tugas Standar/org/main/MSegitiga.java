/** 
 * Nama         : Clara Zita Nabilla
 * NIM          : 24060122130057 
 * File         : MSegitiga.java
 * Deskripsi    : Driver class untuk poligon dan segitiga
 */

package org.main;

import org.bangundatar.*;

public class MSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(10,10,3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}

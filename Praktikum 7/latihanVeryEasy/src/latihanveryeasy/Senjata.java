/*
Nama    : Clara Zita Nabilla
NIM     : 24060122130057
Lab     : B2
*/

package latihanveryeasy;

public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
        if(peluru > 0) {
            System.out.println(getBunyi());
            setPeluru(getPeluru() - 1);
            System.out.println("Sisa Peluru: " + getPeluru());
        } else {
            System.out.println("Peluru habis");
        }
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}


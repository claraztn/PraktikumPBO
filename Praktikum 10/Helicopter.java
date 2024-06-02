/*
 * Nama     : Clara Zita Nabilla
 * NIM      : 24060122130057
 * Lab      : PBO B2
 */

public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(){

    }
    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }
}

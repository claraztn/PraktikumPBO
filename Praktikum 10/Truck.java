/*
 * Nama     : Clara Zita Nabilla
 * NIM      : 24060122130057
 * Lab      : PBO B2
 */

public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(){

    }
    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
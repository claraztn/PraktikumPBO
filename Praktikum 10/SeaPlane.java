/*
 * Nama     : Clara Zita Nabilla
 * NIM      : 24060122130057
 * Lab      : PBO B2
 */

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(){

    }
    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}

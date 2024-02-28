/*  Nama        : Clara Zita Nabilla
    NIM         : 24060122130057
    Nama File   : Titik.java 
    Deskripsi   : Program class Titik
*/

public class Titik{
    private double absis;
    private double ordinat;
    private static double counterTitik;
    
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }
    
    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static double getCounterTitik(){
        return counterTitik;
    }

    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}
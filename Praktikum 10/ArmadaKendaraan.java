/*
 * Nama     : Clara Zita Nabilla
 * NIM      : 24060122130057
 * Lab      : PBO B2
 */

import java.util.ArrayList;
import java.util.List;

public class ArmadaKendaraan {
    private List<Vehicle> armada;

    public ArmadaKendaraan() {
        this.armada = new ArrayList<>();
    }

    public void tambahArmada(List<? extends Vehicle> vehicles) {
        armada.addAll(vehicles);
    }

    public List<Vehicle> getAllArmada() {
        return armada;
    }
}

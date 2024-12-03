package br.edu.unifei.ecot12.xmen97;

public class HumanSentinel extends Sentinel{

    private Human disguise;
    private int freedom;
    private int machineControl;

    public int getMachineControl() {
        return machineControl;
    }

    public void setMachineControl(int machineControl) {
        this.machineControl = machineControl;
    }

    public int getFreedom() {
        return freedom;
    }

    public void setFreedom(int freedom) {
        this.freedom = freedom;
    }

    public Human getDisguise() {
        return disguise;
    }

    public void setDisguise(Human disguise) {
        this.disguise = disguise;
    }

}

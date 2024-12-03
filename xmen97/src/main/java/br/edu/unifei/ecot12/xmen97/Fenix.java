package br.edu.unifei.ecot12.xmen97;

public class Fenix {

    private static Fenix fenix = new Fenix();
    private boolean active;
    private Mutant possessed;

    private Fenix(){}

    public static Fenix getFenix() {
        return fenix;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Mutant getPossessed() {
        return possessed;
    }

    public void setPossessed(Mutant possessed) {
        this.possessed = possessed;
    }

    
}

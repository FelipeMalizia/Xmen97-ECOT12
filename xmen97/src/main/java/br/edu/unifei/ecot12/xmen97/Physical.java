package br.edu.unifei.ecot12.xmen97;

public class Physical extends Power{

    private int deformity;
    private float destructivePotencial;

    public float getDestructivePotencial() {
        return destructivePotencial;
    }

    public void setDestructivePotencial(float destructivePotencial) {
        this.destructivePotencial = destructivePotencial;
    }

    public int getDeformity() {
        return deformity;
    }

    public void setDeformity(int deformity) {
        this.deformity = deformity;
    }

    @Override
    public float attack() {
        return getDamage() * destructivePotencial;
    }
    
}

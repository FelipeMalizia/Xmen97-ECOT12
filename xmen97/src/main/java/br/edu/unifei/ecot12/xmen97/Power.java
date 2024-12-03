package br.edu.unifei.ecot12.xmen97;

public abstract class Power {

    private String description;
    private float damage;

    public abstract float attack();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}

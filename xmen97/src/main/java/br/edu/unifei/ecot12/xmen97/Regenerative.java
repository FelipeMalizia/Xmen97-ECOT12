package br.edu.unifei.ecot12.xmen97;

public class Regenerative extends Power{

    private float heal;

    public float getHeal() {
        return heal;
    }

    public void setHeal(float heal) {
        this.heal = heal;
    }

    @Override
    public float attack() {
        if(heal < 0)
            return getDamage() * heal;
        else
            return getDamage() * heal * (-1);
    }

}

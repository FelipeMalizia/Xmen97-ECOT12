package br.edu.unifei.ecot12.xmen97;

public class Psychic extends Power{

    private Long range;
    private float psychicDamage;

    public float getPsychicDamage() {
        return psychicDamage;
    }

    public void setPsychicDamage(float psychicDamage) {
        this.psychicDamage = psychicDamage;
    }

    public Long getRange() {
        return range;
    }

    public void setRange(Long range) {
        this.range = range;
    }

    @Override
    public float attack() {
        return getDamage() * psychicDamage;
    }

}

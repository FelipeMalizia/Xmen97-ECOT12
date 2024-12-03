package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.List;

public class Mutant extends Natural{

    private LevelEnum level;
    private List<Power> powers = new ArrayList<Power>();
    private PowerState powerState;

    public void attackPower(Being b){
        b.setLife(b.getLife() - usePower());
    }

    public void heal(Being b){
        powerState.checkPower(this);
        if(powerState.ableAttack())
            for(Power o : powers)
                if(o.attack() < 0)
                    b.setLife(b.getLife() - o.attack());
    }

    public float usePower(){
        float totaldamage = 0;
        powerState.checkPower(this);
        if(powerState.ableAttack())
            for(Power o : powers)
                if(o.attack() >= 0)
                    totaldamage += o.attack();
        
        return totaldamage;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public List<Power> getPowers() {
        return powers;
    }

    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }

    public PowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    
}

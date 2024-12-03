package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.List;

public class Modified extends Human{

    private String powerOrigin;
    private List<Power> powers = new ArrayList<Power>();

    public String getPowerOrigin() {
        return powerOrigin;
    }
    public void setPowerOrigin(String powerOrigin) {
        this.powerOrigin = powerOrigin;
    }
    public List<Power> getPowers() {
        return powers;
    }
    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }
    
    public void attackPower(Being b){
        float totaldamage = 0;
        for(Power o : powers)
            if(o.attack() >= 0)
                totaldamage += o.attack();
        
        b.setLife(b.getLife() - totaldamage);
    }

    public void healPower(Being b){
        for(Power o : powers)
            if(o.attack() < 0)
                b.setLife(b.getLife() - o.attack());
    }

}

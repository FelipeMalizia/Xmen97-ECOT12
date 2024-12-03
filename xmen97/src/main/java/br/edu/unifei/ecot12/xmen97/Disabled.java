package br.edu.unifei.ecot12.xmen97;

public class Disabled implements PowerState{

    @Override
    public void checkPower(Mutant mutant) {
        if(mutant.getAge() > 15)
            mutant.setPowerState(new Enabled());
    }

    @Override
    public boolean ableAttack() {
        return false;
    }

}

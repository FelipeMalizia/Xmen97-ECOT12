package br.edu.unifei.ecot12.xmen97;

public class Enabled implements PowerState{

    @Override
    public void checkPower(Mutant mutant) {
        if(mutant.getAge() <= 15)
            mutant.setPowerState(new Disabled());
    }

    @Override
    public boolean ableAttack() {
        return true;
    }


}

package br.edu.unifei.ecot12.xmen97;

public class MutantFacade {

    public Mutant createMutant(){
        Mutant m = new Mutant();
        Physical p = new Physical();
        p.setDamage(3);
        p.setDestructivePotencial(0.5f);
        m.getPowers().add(p);
        p.setDamage(7);
        p.setDestructivePotencial(0.4f);
        m.getPowers().add(p);
        m.setPowerState(new Enabled());
        m.setAge(25);
        return m;
    }
}

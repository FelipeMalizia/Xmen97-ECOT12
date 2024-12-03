package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.List;

public abstract class Sentinel extends Artificial{

    private List<Mutant> targets = new ArrayList<Mutant>();

    public List<Mutant> getTargets() {
        return targets;
    }

    public void setTargets(List<Mutant> targets) {
        this.targets = targets;
    }
    
}

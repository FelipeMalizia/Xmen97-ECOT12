package br.edu.unifei.ecot12.xmen97;

public class Clone extends Artificial{

    private String creationTechnique;
    private Mutant cloned;

    public Clone(Mutant cloned){
        this.cloned = cloned;
    }

    public String getCreationTechnique() {
        return creationTechnique;
    }

    public void setCreationTechnique(String creationTechnique) {
        this.creationTechnique = creationTechnique;
    }

    public Mutant getCloned() {
        return cloned;
    }

    public void setCloned(Mutant cloned) {
        this.cloned = cloned;
    }

}

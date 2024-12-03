package br.edu.unifei.ecot12.xmen97;

public abstract class Artificial extends Being{

    private Being creator;

    public Being getCreator() {
        return creator;
    }

    public void setCreator(Being creator) {
        this.creator = creator;
    }
    
}

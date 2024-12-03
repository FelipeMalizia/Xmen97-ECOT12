package br.edu.unifei.ecot12.xmen97;

public abstract class AlterEgo {
    private String name;

    public abstract void checkAlign(Being b);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

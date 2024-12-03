package br.edu.unifei.ecot12.xmen97;

public abstract class Tool {

    private float function;
    private String description;

    public abstract void useFunction(Being b);

    public float getFunction() {
        return function;
    }

    public void setFunction(float function) {
        this.function = function;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

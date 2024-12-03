package br.edu.unifei.ecot12.xmen97;

public class Technological extends Power{

    private boolean technovirus;
    private float communicationLevel;

    public boolean isTechnovirus() {
        return technovirus;
    }
    public void setTechnovirus(boolean technovirus) {
        this.technovirus = technovirus;
    }
    public float getCommunicationLevel() {
        return communicationLevel;
    }
    public void setCommunicationLevel(float communicationLevel) {
        this.communicationLevel = communicationLevel;
    }
    @Override
    public float attack() {
        return getDamage() * communicationLevel;
    }

}

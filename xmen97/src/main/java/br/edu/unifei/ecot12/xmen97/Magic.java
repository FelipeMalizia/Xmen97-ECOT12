package br.edu.unifei.ecot12.xmen97;

public class Magic extends Power{

    private String artifact;
    private float artifactpower;

    public String getArtifact() {
        return artifact;
    }

    public void setArtifact(String artifact) {
        this.artifact = artifact;
    }

    @Override
    public float attack() {
        return getDamage() * artifactpower;
    }

    public float getArtifactpower() {
        return artifactpower;
    }

    public void setArtifactpower(float artifactpower) {
        this.artifactpower = artifactpower;
    }

}

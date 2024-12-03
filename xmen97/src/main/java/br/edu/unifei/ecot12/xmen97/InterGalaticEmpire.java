package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.List;

public class InterGalaticEmpire {
    private String name;
    private String purpose;
    private Long fleet;
    private List<Planet> planets = new ArrayList<Planet>();
    
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public Long getFleet() {
        return fleet;
    }
    public void setFleet(Long fleet) {
        this.fleet = fleet;
    }
    public List<Planet> getPlanets() {
        return planets;
    }
    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

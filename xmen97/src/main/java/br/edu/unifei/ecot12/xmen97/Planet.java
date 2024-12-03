package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.List;

public class Planet{

    private String name;
    private String atmosfere;
    private List<Country> countries = new ArrayList<Country>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAtmosfere() {
        return atmosfere;
    }
    public void setAtmosfere(String atmosfere) {
        this.atmosfere = atmosfere;
    }
    public List<Country> getCountries() {
        return countries;
    }
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

}

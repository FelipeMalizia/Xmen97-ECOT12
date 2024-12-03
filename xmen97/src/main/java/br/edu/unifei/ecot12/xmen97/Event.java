package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Event {
    private Calendar begin;
    private String consequences;
    private String motivation;
    private List<Group> groups = new ArrayList<Group>();
    private Country location;
    
    public Calendar getBegin() {
        return begin;
    }
    public void setBegin(Calendar begin) {
        this.begin = begin;
    }
    public String getConsequences() {
        return consequences;
    }
    public void setConsequences(String consequences) {
        this.consequences = consequences;
    }
    public String getMotivation() {
        return motivation;
    }
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }
    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
    public Country getLocation() {
        return location;
    }
    public void setLocation(Country location) {
        this.location = location;
    }
    
}

package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private AlignEnum groupAlign;
    private Being lider;
    private List<Being> members = new ArrayList<Being>();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AlignEnum getGroupAlign() {
        return groupAlign;
    }
    public void setGroupAlign(AlignEnum groupAlign) {
        this.groupAlign = groupAlign;
    }
    public Being getLider() {
        return lider;
    }
    public void setLider(Being lider) {
        this.lider = lider;
    }
    public List<Being> getMembers() {
        return members;
    }
    public void setMembers(List<Being> members) {
        this.members = members;
    }
    
}

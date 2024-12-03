package br.edu.unifei.ecot12.xmen97;

import java.util.ArrayList;
import java.util.List;

public abstract class Being {

    private String name;
    private AlignEnum beingAlign;
    private AlterEgo alterEgo;
    private float life;
    private List<Tool> tools = new ArrayList<Tool>();
    private Caretaker caretaker;
    
    public Caretaker getCaretaker() {
        return caretaker;
    }
    public void setCaretaker(Caretaker caretaker) {
        this.caretaker = caretaker;
    }
    public float getLife() {
        return life;
    }
    public void setLife(float life) {
        this.life = life;
    }
    public RecordedAlterEgo createRecordedAlterEgo(){
        return new RecordedAlterEgo(alterEgo);
    }
    public void restoreAlterEgo(RecordedAlterEgo r){
        alterEgo = r.getAlterEgo();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AlignEnum getBeingAlign() {
        return beingAlign;
    }
    public void setBeingAlign(AlignEnum beingAlign) {
        this.beingAlign = beingAlign;
        if(alterEgo != null)
        alterEgo.checkAlign(this);
    }
    public AlterEgo getAlterEgo() {
        return alterEgo;
    }
    public void setAlterEgo(AlterEgo alterEgo) {
        this.alterEgo = alterEgo;
    }
    public List<Tool> getTools() {
        return tools;
    }
    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    
}

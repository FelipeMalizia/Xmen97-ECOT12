package br.edu.unifei.ecot12.xmen97;

import java.util.Stack;

public class Caretaker {
    private Stack<RecordedAlterEgo> alterEgos = new Stack<RecordedAlterEgo>();
    private Being being;

    public Being getBeing() {
        return being;
    }

    public void setBeing(Being being) {
        this.being = being;
    }

    public Stack<RecordedAlterEgo> getAlterEgos() {
        return alterEgos;
    }

    public void setAlterEgos(Stack<RecordedAlterEgo> alterEgos) {
        this.alterEgos = alterEgos;
    }

    public void restore(){
        being.setAlterEgo(alterEgos.pop().getAlterEgo());
    }
}

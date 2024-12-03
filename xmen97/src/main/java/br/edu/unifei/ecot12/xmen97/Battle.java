package br.edu.unifei.ecot12.xmen97;

public class Battle extends Event{

    private int duration;
    private Group winner;

    public Group getWinner() {
        return winner;
    }
    public void setWinner(Group winner) {
        this.winner = winner;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}

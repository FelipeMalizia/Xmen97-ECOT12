package br.edu.unifei.ecot12.xmen97;

public class Hero extends AlterEgo {

    private int goodness;
    
    @Override
    public void checkAlign(Being b) {
        if(b.getBeingAlign() == AlignEnum.EVIL){
            b.getCaretaker().getAlterEgos().add(b.createRecordedAlterEgo());
            b.setAlterEgo(new Villain());
        }
        else if(b.getBeingAlign() == AlignEnum.NEUTRAL){
            b.getCaretaker().getAlterEgos().add(b.createRecordedAlterEgo());
            b.setAlterEgo(new AntiHero());
        }
    }

    public int getGoodness() {
        return goodness;
    }

    public void setGoodness(int goodness) {
        this.goodness = goodness;
    }


}

package br.edu.unifei.ecot12.xmen97;

public class AntiHero extends AlterEgo{

    private String interests;
    
    @Override
    public void checkAlign(Being b) {
        if(b.getBeingAlign() == AlignEnum.EVIL){
            b.getCaretaker().getAlterEgos().add(b.createRecordedAlterEgo());
            b.setAlterEgo(new Villain());
        }
        else if(b.getBeingAlign() == AlignEnum.GOOD){
            b.getCaretaker().getAlterEgos().add(b.createRecordedAlterEgo());
            b.setAlterEgo(new Hero());
        }
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }
}

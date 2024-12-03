package br.edu.unifei.ecot12.xmen97;

public class Villain extends AlterEgo{

    private int villainy;

    @Override
    public void checkAlign(Being b) {
        if(b.getBeingAlign() == AlignEnum.GOOD){
            b.getCaretaker().getAlterEgos().add(b.createRecordedAlterEgo());
            b.setAlterEgo(new Hero());
        }
        else if(b.getBeingAlign() == AlignEnum.NEUTRAL){
            b.getCaretaker().getAlterEgos().add(b.createRecordedAlterEgo());
            b.setAlterEgo(new AntiHero());
        }
    }


    public int getVillainy() {
        return villainy;
    }


    public void setVillainy(int villainy) {
        this.villainy = villainy;
    }
}

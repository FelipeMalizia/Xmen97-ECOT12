package br.edu.unifei.ecot12.xmen97;

public class HealTool extends Tool{

    @Override
    public void useFunction(Being b) {
        b.setLife(b.getLife() + getFunction());
    }
}

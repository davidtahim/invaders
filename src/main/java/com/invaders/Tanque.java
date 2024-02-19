package com.invaders;

import java.awt.Color;
import java.awt.Graphics2D;

import com.invaders.base.Elemento;

public class Tanque extends Elemento {
    private final int cano = 8;
    private final int escotilha = 10;

    public Tanque() {
        setAltura(30);
        setLargura(15);
    }
@Override
public void atualiza(){

}    

@Override
public void desenha(Graphics2D g){
g.setColor(Color.GREEN);
g.fillRect(getPx()+getLargura()/2 - cano / 2, getPy()-cano, cano, cano);
g.fillRect(getPx(), getPy(), getLargura(), getAltura());

g.setColor(Color.YELLOW);
g.fillOval(getPx() + getLargura()/2 - escotilha/2, getPy()+getAltura()/2-escotilha/2, escotilha, escotilha);
}
    
}

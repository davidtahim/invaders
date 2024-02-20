package com.invaders;

import com.invaders.base.Elemento;

import java.awt.Color;
import java.awt.Graphics2D;

public class Tiro extends Elemento {
    private boolean inimigo;

    public Tiro(){
        setAltura(5);
        setLargura(5);

    }

    public Tiro(boolean inimigo) { 
        this();
        this.inimigo = inimigo;
    }

    @Override
    public void atualiza(){

    }

    @Override
    public void desenha(Graphics2D g){
        g.setColor(inimigo ? Color.RED : Color.WHITE);

        g.fillRect(getPx(), getPy(), getLargura(), getAltura());
    }


}

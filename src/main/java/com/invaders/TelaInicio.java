package com.invaders;

import java.awt.GridLayout;

import javax.swing.*;
import java.awt.*;

public class TelaInicio extends JFrame {

    public TelaInicio(){
        setTitle("Menu Inicial");
        setSize(540,680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//falta adicionar os botões para criar um jogo e ver o rank

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
    
    add(panel);
    setVisible(true);
    
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new TelaInicio();
            }
        });
    }
}



package com.invaders;

import java.awt.GridLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.invaders.Jogo;

public class TelaInicio extends JFrame {

    public TelaInicio(){
        setTitle("Menu Inicial");
        setSize(540,680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//falta adicionar os botões para criar um jogo e ver o rank



        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
    
JButton novoJogoButton = new JButton("Novo Jogo");
novoJogoButton.addActionListener (new ActionListener() {
    @Override
    public void actionPerformed (ActionEvent e) {
        dispose();
        iniciarNovoJogo();

    }

});

JButton verRankingButton = new JButton("Ver Ranking");
        verRankingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a tela atual
                verRanking();
            }
        });

    panel.add(novoJogoButton);    
    panel.add(verRankingButton);    
    add(panel);
    setVisible(true);
    
    }
private void iniciarJogo(){
    System.out.println("Iniciando um novo jogo...");
    Jogo jogo = new Jogo();
    jogo.carregarJogo();
    jogo.iniciarJogo();
}

private void verRanking(){
    System.out.println("Visualizando o Ranking");
    RankingJogadores ranking = new RankingJogadores();
    ranking.listarRanking();
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new TelaInicio();
            }
        });
    }
}



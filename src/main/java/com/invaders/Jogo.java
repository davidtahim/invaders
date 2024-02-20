package com.invaders;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jogo extends JFrame {
    private static final int FPS = 1000 / 20;
    private static final int JANELA_ALTURA = 680;
    private static final int JANELA_LARGURA = 540;

    private JPanel tela;
    private Graphics2D g2d;
    private BufferedImage buffer;
    private boolean[] controleTecla = new boolean[5];

    public Jogo() {
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                setaTecla(e.getKeyCode(), false);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                setaTecla(e.getKeyCode(), true);
            }
        });

        buffer = new BufferedImage(JANELA_LARGURA, JANELA_ALTURA, BufferedImage.TYPE_INT_RGB);
        g2d = buffer.createGraphics();

        tela = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(buffer, 0, 0, null);

            }
        };

        getContentPane().add(tela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);

    }

    private void setaTecla(int tecla, boolean pressionada){
        switch (tecla) {
            case KeyEvent.VK_UP:
                controleTecla[0] = pressionada;
                break;
            case KeyEvent.VK_DOWN:
                controleTecla[1] = pressionada;
                break;
            case KeyEvent.VK_LEFT:
                controleTecla[2] = pressionada;
                break;
            case KeyEvent.VK_RIGHT:
                controleTecla[3] = pressionada;
                break;
            case KeyEvent.VK_SPACE:
                controleTecla[4] = pressionada;
                break;
        
        }

    } 

    // Elementos do Jogo linha 97



}
package br.edu.jogoDaVelha.controls;

import javax.swing.*;
import java.util.ArrayList;

public class Controle {

    private String[][] velha = new String[3][3];
    private boolean x = true; // o = false
    String nomeJogadorX = "", nomeJogadorO = "";
    private boolean terminouOjogo = false;

    public Controle(String nomeJogadorX, String nomeJogadorO) {
        this.nomeJogadorO = nomeJogadorO;
        this.nomeJogadorX = nomeJogadorX;

        // inicializa o vetor de velha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = "";
            }
        }
    }

    public String marcar(int botao) {
        if (x) {
            gravarJogada(botao, "X");
            encontrarVencedor("X");
            return "X";
        } else {
            gravarJogada(botao, "O");
            encontrarVencedor("O");
            return "O";
        }
    }

    public boolean terminouOjogo() {
        return terminouOjogo;
    }

    public void mostarJogadorDaVez() {
        if (x) {
            JOptionPane.showMessageDialog(null, "Vez do: " + nomeJogadorX);
        } else {
            JOptionPane.showMessageDialog(null, "Vez do: " + nomeJogadorO);
        }
    }

    private String getJogadorDaVez() {
        if (x) {
            return nomeJogadorX;
        } else {
            return nomeJogadorO;
        }
    }

    public void mudarJogador() {
        if (x) {
            JOptionPane.showMessageDialog(null, "Vez do: " + nomeJogadorO);
            x = false; // o
        } else {
            JOptionPane.showMessageDialog(null, "Vez do: " + nomeJogadorX);
            x = true;
        }
    }

    private void gravarJogada(int casaJogada, String simbolo) {

        if ((casaJogada - 1) == 0) {
            velha[0][0] = simbolo;
        }
        if ((casaJogada - 1) == 1) {
            velha[0][1] = simbolo;
        }
        if ((casaJogada - 1) == 2) {
            velha[0][2] = simbolo;
        }

        if ((casaJogada - 1) == 3) {
            velha[1][0] = simbolo;
        }
        if ((casaJogada - 1) == 4) {
            velha[1][1] = simbolo;
        }
        if ((casaJogada - 1) == 5) {
            velha[1][2] = simbolo;
        }

        if ((casaJogada - 1) == 6) {
            velha[2][0] = simbolo;
        }
        if ((casaJogada - 1) == 7) {
            velha[2][1] = simbolo;
        }
        if ((casaJogada - 1) == 8) {
            velha[2][2] = simbolo;
        }
    }

    private void encontrarVencedor(String simbolo) {
        String jogadorDaVez = getJogadorDaVez();

        // Linhas
        if (velha[0][0].equals(simbolo) && velha[0][1].equals(simbolo) && velha[0][2].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }
        if (velha[1][0].equals(simbolo) && velha[1][1].equals(simbolo) && velha[1][2].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }
        if (velha[2][0].equals(simbolo) && velha[2][1].equals(simbolo) && velha[2][2].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }

        // Colunas
        if (velha[0][0].equals(simbolo) && velha[1][0].equals(simbolo) && velha[2][0].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }
        if (velha[0][1].equals(simbolo) && velha[1][1].equals(simbolo) && velha[2][1].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }
        if (velha[0][2].equals(simbolo) && velha[1][2].equals(simbolo) && velha[2][2].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }

        // Diagonais
        if (velha[0][0].equals(simbolo) && velha[1][1].equals(simbolo) && velha[2][2].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }
        if (velha[0][2].equals(simbolo) && velha[1][1].equals(simbolo) && velha[2][0].equals(simbolo)) {
            JOptionPane.showMessageDialog(null, "O vencedor é o " + jogadorDaVez);
            terminouOjogo = true;
        }
    }

    private void mostrarVetor() {
        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux.append(velha[i][j]).append("|");
            }
            aux.append("\n");
        }
        JOptionPane.showMessageDialog(null, aux);
    }
}

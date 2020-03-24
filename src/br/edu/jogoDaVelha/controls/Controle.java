package br.edu.jogoDaVelha.controls;

import javax.swing.*;
import java.util.ArrayList;

public class Controle {

    private String[][] velha = new String[3][3];
    private boolean x = true; // o = false

    public Controle() {
        // inicializa o vetor de velha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = "";
            }
        }
    }

    public String marcar(int botao) {
        if (x == true) {
            gravarJogada(botao, "O");
            return "O";
        } else {
            gravarJogada(botao, "X");
            return "X";
        }
    }

    public void mostarPrimeiroJogador(String nomeJogadorX, String nomeJogadorO) {
        if (x == true) {
            JOptionPane.showMessageDialog(null, "Vez do: " + nomeJogadorX);
        } else {
            JOptionPane.showMessageDialog(null, "Vez do: " + nomeJogadorO);
        }
    }

    public void mudarJogador(String nomeJogadorX, String nomeJogadorO) {
        if (x == true) {
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

    private void encontrarVencedor() {

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

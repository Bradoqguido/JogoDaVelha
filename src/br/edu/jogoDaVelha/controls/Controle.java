package br.edu.jogoDaVelha.controls;

import javax.swing.*;
import java.util.ArrayList;

public class Controle {

    private String[][] velha = new String[3][3];
    private boolean x = true; // o = false

    public Controle() {}

    public String marcar() {
        if (x == true) {
            return "O";
        } else {
            return "X";
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
}

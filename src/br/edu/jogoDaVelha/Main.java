package br.edu.jogoDaVelha;

import br.edu.jogoDaVelha.components.JogoDaVelha;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nomeJogadorX = "Jogador X: ";
        nomeJogadorX += JOptionPane.showInputDialog(null, "Digite o nome do jogador X:");

        String nomeJogadorO = "Jogador O: ";
        nomeJogadorO += JOptionPane.showInputDialog(null, "Digite o nome do jogador O:");
        new JogoDaVelha(nomeJogadorX, nomeJogadorO);
    }
}

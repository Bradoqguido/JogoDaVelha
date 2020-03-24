package br.edu.jogoDaVelha.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel jogadores;
    private JPanel jogodavelha;
    private JPanel southJpanel;
    private JPanel northJpanel;
    private JPanel centerJpanel;
    private JTextField jogadorXTextField;
    private JTextField jogadorOTextField;
    private JButton reiniciarButton;
    private JButton sairButton;
    private JLabel labelNomeO;
    private JLabel labelNomeX;

    public JogoDaVelha() {
        inicializarComponents();
        listeners();
    }

    private void inicializarComponents() {
        getContentPane().setLayout(new BorderLayout(0, 0));

        /// Declarações menu Jogadores ///

        jogadores = new JPanel();
        getContentPane().add(jogadores, BorderLayout.NORTH);
        jogadores.setLayout(new BorderLayout(0,0));

        northJpanel = new JPanel();
        reiniciarButton = new JButton("Reiniciar");
        northJpanel.add(reiniciarButton);

        sairButton = new JButton("Sair");
        northJpanel.add(sairButton);
        jogadores.add(northJpanel, BorderLayout.NORTH);

        southJpanel = new JPanel();
        jogadorOTextField = new JTextField("Digite o nome do Jogador O");
        southJpanel.add(jogadorOTextField);
        jogadores.add(southJpanel, BorderLayout.SOUTH);

        centerJpanel = new JPanel();
        jogadorXTextField = new JTextField("Digite o nome do Jogador X");
        centerJpanel.add(jogadorXTextField);
        jogadores.add(centerJpanel, BorderLayout.CENTER);


        /// Declarações Jogo da Velha ///

        jogodavelha = new JPanel();
        jogodavelha.setLayout(new GridLayout(3,3));
        getContentPane().add(jogodavelha, BorderLayout.CENTER);

        button1 = new JButton("");
        jogodavelha.add(button1);

        button2 = new JButton("");
        jogodavelha.add(button2);

        button3 = new JButton("");
        jogodavelha.add(button3);

        button4 = new JButton("");
        jogodavelha.add(button4);

        button5 = new JButton("");
        jogodavelha.add(button5);

        button6 = new JButton("");
        jogodavelha.add(button6);

        button7 = new JButton("");
        jogodavelha.add(button7);

        button8 = new JButton("");
        jogodavelha.add(button8);

        button9 = new JButton("");
        jogodavelha.add(button9);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void listeners() {

        /*carregarCandidatosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controle.preConfigCandidatos();
                carregarCandidatosButton.setVisible(false);
            }
        });

        buscarCandidatoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controle.buscarCategoria();
            }
        });

        iniciarVotacaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                controle.iniciarVotacao();
                setVisible(true);
            }
        });

        */
        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

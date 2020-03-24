import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Tela extends JFrame {
	private JPanel panelNome;
	private JButton btnOeste;
	private JTextField textOeste;
	private JPanel panelPrincipal;
	private JPanel panelIdentificacao;
	private JTextField textIdentificacao;
	private JButton btnIdentificacao;

	private void initComponents() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		panelPrincipal = new JPanel();
		getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		panelPrincipal.setLayout(new BorderLayout(0, 0));

		panelIdentificacao = new JPanel();
		panelIdentificacao.setBorder(new TitledBorder(null, "Identifica\u00e7\u00e3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPrincipal.add(panelIdentificacao);
		panelIdentificacao.setLayout(new BorderLayout(0, 0));

		textIdentificacao = new JTextField();
		panelIdentificacao.add(textIdentificacao);
		textIdentificacao.setColumns(10);

		btnIdentificacao = new JButton("Identifica\u00e7\u00e3o");
		panelIdentificacao.add(btnIdentificacao, BorderLayout.EAST);

		panelNome = new JPanel();
		panelNome.setBorder(new TitledBorder(null, "Nome", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelNome);

		textOeste = new JTextField("Digite seu nome");
		panelNome.add(textOeste);
		textOeste.setColumns(10);

		btnOeste = new JButton("Bot\u00e3o 1");
		btnOeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMensagem();
			}
		});
		panelNome.add(btnOeste);

		setSize(400, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	protected void mostrarMensagem() {
		JOptionPane.showMessageDialog(null, "Voc\u00ea digitou " + textOeste.getText());
	}

	public Tela() {
		initComponents();
	}

	public static void main(String[] args) {
		new Tela();
	}

}

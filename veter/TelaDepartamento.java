package interface_;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

import controle.ControleBasico;
import controle.ControleGeral;
import negocio.Departamento;
import util.Diversos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TelaDepartamento extends JFrame {

	private JPanel contentPane;
	private JTextField jTxtCodigo;
	private JTextField jTxtDescricao;
	private JButton btnIncluir;
	private JButton btnAlterar;
	private JButton btnConsultar;
	private JButton btnExcluir;
	private JButton btnLimpar;
	private JButton btnSair;
	private ControleBasico dO;
	private final String titulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDepartamento frame = new TelaDepartamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaDepartamento() {
		titulo = "Cadastrar departamentos";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 308);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblCdigo.setBounds(208, 43, 86, 27);
		contentPane.add(lblCdigo);
		
		jTxtCodigo = new JTextField();
		jTxtCodigo.setBounds(329, 48, 86, 20);
		contentPane.add(jTxtCodigo);
		jTxtCodigo.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblDescrio.setBounds(193, 94, 101, 27);
		contentPane.add(lblDescrio);
		
		jTxtDescricao = new JTextField();
		jTxtDescricao.setColumns(10);
		jTxtDescricao.setBounds(329, 94, 86, 20);
		contentPane.add(jTxtDescricao);
		
		btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIncluir.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnIncluir.setBounds(10, 190, 89, 23);
		contentPane.add(btnIncluir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAlterar.setBounds(109, 191, 89, 23);
		contentPane.add(btnAlterar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConsultar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnConsultar.setBounds(208, 191, 111, 23);
		contentPane.add(btnConsultar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnExcluir.setBounds(329, 191, 89, 23);
		contentPane.add(btnExcluir);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnLimpar.setBounds(428, 191, 89, 23);
		contentPane.add(btnLimpar);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnSair.setBounds(527, 191, 89, 23);
		contentPane.add(btnSair);
	}
	
	private void limpar() {
		
		jTxtCodigo.setText("");
		jTxtDescricao.setText("");
		
	}
	
	private void cadastrarDados(char opcao) {
		
		String resp = "";
		if (jTxtCodigo.getText().isEmpty() || jTxtDescricao.getText().isEmpty())
			resp = "Favor digitar os dados";
		else {
			Departamento d = new Departamento();
			d.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
			d.setDescricao(jTxtDescricao.getText());
			if (!dO.setManipular(d, opcao)) {
				resp = "Problemas ao "
						+ (opcao == 'A' ? "atualizar"
								: opcao == 'E' ? "remover" : " inserir")
						+ " os dados do(a) consumidor(a) " + d.getDescricao();
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnIncluir.setEnabled(false);
			} else {
				resp = "O departamento " + d.getDescricao();
				switch (opcao) {
				case 'A':
					resp += "\nfoi atualizado(a)";
					break;
				case 'E':
					resp += "\nfoi removido(a)";
					limpar();
					btnAlterar.setEnabled(false);
					btnExcluir.setEnabled(false);
					break;
				case 'I':
					resp += "\nfoi inserido(a)";
					btnAlterar.setEnabled(true);
					btnExcluir.setEnabled(true);
					btnIncluir.setEnabled(false);
				}
				resp += " com sucesso";

			}
		}
		Diversos.mostrarDados(resp, titulo,
				(resp.charAt(0) != 'F' && resp.charAt(0) != 'P'));
		
	}
	
}

package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import controle.ControleExemplar;
import modelo.Exemplar;
import modelo.Livro;
import modelo.Livro;
import modelo.Exemplar;
import modelo.Livro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class TelaExemplar extends JFrame {

	private JPanel contentPane;
	private JTextField txfCod;
	private JTextField txfEstado;
	
	static ControleExemplar controleExemplar;
	private JTextField txfCodLiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExemplar frame = new TelaExemplar();
					controleExemplar = new ControleExemplar();
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
	public TelaExemplar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelaexemplar = new JLabel("TELAEXEMPLAR");
		lblTelaexemplar.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblTelaexemplar.setBounds(151, 11, 143, 14);
		contentPane.add(lblTelaexemplar);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblCdigo.setBounds(10, 60, 89, 14);
		contentPane.add(lblCdigo);
		
		txfCod = new JTextField();
		txfCod.setBounds(143, 58, 86, 20);
		contentPane.add(txfCod);
		txfCod.setColumns(10);
		
		JLabel lblTtulo = new JLabel("Estado:");
		lblTtulo.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblTtulo.setBounds(10, 90, 89, 14);
		contentPane.add(lblTtulo);
		
		txfEstado = new JTextField();
		txfEstado.setColumns(10);
		txfEstado.setBounds(143, 89, 86, 20);
		contentPane.add(txfEstado);
		
		JButton btnInserir = new JButton("Incluir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String c, e, codLiv;
				
				try{
					
					c = txfCod.getText();
					e = txfEstado.getText();
					codLiv = txfCodLiv.getText();
					
					if(c.equals("") || e.equals("") || codLiv.equals("")) {
						
						throw new Exception ("Favor preencher todas as caixas");
						
					}else {
						
						Exemplar exemplar = new Exemplar();
						exemplar.setCodExemplar(Integer.parseInt(c));
						exemplar.setEstado(e);
						Livro livro = new Livro();
						livro.setCodLivro(Integer.parseInt(codLiv));
						exemplar.setLivro(livro);
						int ok = controleExemplar.inserirControleHibernate(exemplar);
						
						if(ok == 1) {
							JOptionPane.showMessageDialog(null, "Exemplar inserido com sucesso");
						}else{
							throw new Exception("Exemplar não inserido.");
						}
					}
				}catch(Exception ex){
					
					JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
					
				}
				
			}
		});
		btnInserir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInserir.setBounds(322, 56, 102, 23);
		contentPane.add(btnInserir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int codExem = Integer.parseInt(JOptionPane.showInputDialog("Digite o cod do exemplar"));
					Exemplar exem = new Exemplar();
					exem.setCodExemplar(codExem);
					Exemplar exemplar = controleExemplar.consultarControleHibernate(exem);
					if (exemplar == null) {
						throw new Exception("Código não cadastrado");
					}else{
						txfCod.setText(String.valueOf(exemplar.getCodExemplar()));
						txfEstado.setText(exemplar.getEstado());
						Livro liv = exemplar.getLivro();
						txfCodLiv.setText(String.valueOf(liv.getCodLivro()));
						
						JOptionPane.showMessageDialog(null, "Título do livro: " + liv.getTitulo());
					}
				}catch (Exception ex){
					JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
				}
				
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(322, 90, 102, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblCdigoDoLivro = new JLabel("C\u00F3digo do Livro:");
		lblCdigoDoLivro.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblCdigoDoLivro.setBounds(10, 115, 126, 14);
		contentPane.add(lblCdigoDoLivro);
		
		txfCodLiv = new JTextField();
		txfCodLiv.setColumns(10);
		txfCodLiv.setBounds(143, 113, 86, 20);
		contentPane.add(txfCodLiv);
	}
}

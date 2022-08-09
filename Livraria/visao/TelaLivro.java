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

import controle.ControleLivro;
import modelo.Livro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLivro extends JFrame {

	private JPanel contentPane;
	private JTextField txfCodLiv;
	private JTextField txfTitulo;
	private JTextField txfEditora;
	private JTextField txfAssunto;
	
	static ControleLivro controleLivro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLivro frame = new TelaLivro();
					controleLivro = new ControleLivro();
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
	public TelaLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelalivro = new JLabel("TELALIVRO");
		lblTelalivro.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblTelalivro.setBounds(166, 11, 106, 14);
		contentPane.add(lblTelalivro);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblCdigo.setBounds(10, 60, 89, 14);
		contentPane.add(lblCdigo);
		
		txfCodLiv = new JTextField();
		txfCodLiv.setEnabled(false);
		txfCodLiv.setBounds(104, 58, 86, 20);
		contentPane.add(txfCodLiv);
		txfCodLiv.setColumns(10);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblTtulo.setBounds(10, 90, 89, 14);
		contentPane.add(lblTtulo);
		
		txfTitulo = new JTextField();
		txfTitulo.setColumns(10);
		txfTitulo.setBounds(104, 88, 86, 20);
		contentPane.add(txfTitulo);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblEditora.setBounds(10, 119, 89, 14);
		contentPane.add(lblEditora);
		
		txfEditora = new JTextField();
		txfEditora.setColumns(10);
		txfEditora.setBounds(104, 117, 86, 20);
		contentPane.add(txfEditora);
		
		JLabel lblAssunto = new JLabel("Assunto:");
		lblAssunto.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblAssunto.setBounds(10, 146, 89, 14);
		contentPane.add(lblAssunto);
		
		txfAssunto = new JTextField();
		txfAssunto.setColumns(10);
		txfAssunto.setBounds(104, 144, 86, 20);
		contentPane.add(txfAssunto);
		
		JButton btnInserir = new JButton("Incluir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String t, a, e;
				
				try{
					
					a = txfAssunto.getText();
					t = txfTitulo.getText();
					e = txfEditora.getText();
					
					if(a.equals("") || t.equals("") || e.equals("")) {
						
						throw new Exception ("Favor preencher todas as caixas");
						
					}else {
						
						Livro livro = new Livro();
						livro.setTitulo(t);
						livro.setAssunto(a);
						livro.setEditora(e);
						int ok = controleLivro.inserirControleHibernate(livro);
						
						if(ok == 1) {
							JOptionPane.showMessageDialog(null, "Livro inserido com sucesso");
						}else{
							throw new Exception("Livro não inserido.");
						}
					}
				}catch(Exception ex){
					
					JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
					
				}
				
			}
		});
		btnInserir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInserir.setBounds(166, 206, 89, 23);
		contentPane.add(btnInserir);
	}
}

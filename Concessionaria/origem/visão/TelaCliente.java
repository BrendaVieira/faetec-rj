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

import controle.ControleCliente;
import modelo.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txfIdCliente;
	private JTextField txfNome;
	private JTextField txfTelefone;

	private ControleCliente controleCliente= new ControleCliente();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TELA CLIENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(154, 13, 147, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id Cliente:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(39, 75, 96, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente:");
		lblNomeCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomeCliente.setBounds(39, 113, 115, 19);
		contentPane.add(lblNomeCliente);
		
		JLabel lblTelCliente = new JLabel("Tel Cliente:");
		lblTelCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTelCliente.setBounds(39, 145, 96, 19);
		contentPane.add(lblTelCliente);
		
		txfIdCliente = new JTextField();
		txfIdCliente.setEditable(false);
		txfIdCliente.setBounds(156, 74, 116, 22);
		contentPane.add(txfIdCliente);
		txfIdCliente.setColumns(10);
		
		txfNome = new JTextField();
		txfNome.setBounds(154, 109, 116, 22);
		contentPane.add(txfNome);
		txfNome.setColumns(10);
		
		txfTelefone = new JTextField();
		txfTelefone.setBounds(156, 144, 116, 22);
		contentPane.add(txfTelefone);
		txfTelefone.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n, t;
				try{
					n = txfNome.getText();
					t = txfTelefone.getText();
					if (n.equals("") || t.equals("")){
						throw new Exception ("Favor preencher todas as caixas");
					}else{
						Cliente cliente = new Cliente();
						cliente.setNome(n);
						cliente.setTelefone(t);
						int ok = controleCliente.inserirControleHibernate(cliente);
						if (ok == 1){
							JOptionPane.showMessageDialog(null, "Incluído com sucesso.");
						}else{
							JOptionPane.showMessageDialog(null, "Não incluído.");
						}
					}
					
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Erro:" +  ex.getMessage());
				}
			}
		});
		btnIncluir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIncluir.setBounds(302, 42, 97, 25);
		contentPane.add(btnIncluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id,n, t;
				try{
					id = txfIdCliente.getText();
					n = txfNome.getText();
					t = txfTelefone.getText();
					if (id.equals("") || n.equals("") || t.equals("")){
						throw new Exception (
								"Favor preencher todas as caixas");
					}else{
						Cliente cliente = new Cliente();
						cliente.setIdCliente(Integer.parseInt(id));
						cliente.setNome(n);
						cliente.setTelefone(t);
						int ok = controleCliente.alterarControleHibernate(cliente);
						if (ok == 1){
							JOptionPane.showMessageDialog(null, 
									"Alterado com sucesso.");
						}else{
							JOptionPane.showMessageDialog(null, "Não alterado.");
						}
					}
					
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Erro:" +  ex.getMessage());
				}
	
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAlterar.setBounds(302, 73, 97, 25);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExcluir.setBounds(302, 111, 97, 25);
		contentPane.add(btnExcluir);
		
		JButton btnNewButton_3 = new JButton("Consultar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					int id = Integer.parseInt(
							JOptionPane.showInputDialog(
									"Digite o id do cliente desejado."));
					Cliente c = new Cliente();
					c.setIdCliente(id);
					Cliente cliente = controleCliente.consultarControleHibernate(c);
					if (cliente == null){
						throw new Exception ("O cliente desejado não esta cadastrado.");
					}else{
						txfIdCliente.setText(String.valueOf(cliente.getIdCliente()));
						txfNome.setText(cliente.getNome());
						txfTelefone.setText(cliente.getTelefone());
					}
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null,
							"Erro: " + ex.getMessage());
				}
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(302, 145, 118, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFechar.setBounds(302, 181, 97, 25);
		contentPane.add(btnFechar);
	}
}


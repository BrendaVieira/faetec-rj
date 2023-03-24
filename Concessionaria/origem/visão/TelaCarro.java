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

import controle.ControleCarro;
import modelo.Carro;
import modelo.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class TelaCarro extends JFrame {
	
	private ControleCarro controleCarro = new ControleCarro();

	private JPanel contentPane;
	private JTextField txfIdCarro;
	private JTextField txfPlaca;
	private JTextField txfModelo;
	private JTextField txfValor;
	private JTextField txfIdCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarro frame = new TelaCarro();
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
	public TelaCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelaCliente = new JLabel("TELA CARRO");
		lblTelaCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelaCliente.setBounds(151, 26, 142, 16);
		contentPane.add(lblTelaCliente);
		
		JLabel lblNewLabel = new JLabel("Id Carro:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(62, 74, 78, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPlacaCarro = new JLabel("Placa Carro:");
		lblPlacaCarro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlacaCarro.setBounds(47, 103, 108, 16);
		contentPane.add(lblPlacaCarro);
		
		JLabel lblModeloCarro = new JLabel("Modelo Carro:");
		lblModeloCarro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblModeloCarro.setBounds(29, 126, 108, 16);
		contentPane.add(lblModeloCarro);
		
		JLabel lblValorCarro = new JLabel("Valor Carro:");
		lblValorCarro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValorCarro.setBounds(47, 155, 108, 16);
		contentPane.add(lblValorCarro);
		
		JLabel lblIdCliente = new JLabel("Id Cliente:");
		lblIdCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdCliente.setBounds(62, 184, 78, 16);
		contentPane.add(lblIdCliente);
		
		txfIdCarro = new JTextField();
		txfIdCarro.setEditable(false);
		txfIdCarro.setBounds(162, 72, 116, 22);
		contentPane.add(txfIdCarro);
		txfIdCarro.setColumns(10);
		
		txfPlaca = new JTextField();
		txfPlaca.setBounds(162, 101, 116, 22);
		contentPane.add(txfPlaca);
		txfPlaca.setColumns(10);
		
		txfModelo = new JTextField();
		txfModelo.setBounds(162, 126, 116, 22);
		contentPane.add(txfModelo);
		txfModelo.setColumns(10);
		
		txfValor = new JTextField();
		txfValor.setBounds(161, 153, 116, 22);
		contentPane.add(txfValor);
		txfValor.setColumns(10);
		
		txfIdCliente = new JTextField();
		txfIdCliente.setBounds(162, 182, 116, 22);
		contentPane.add(txfIdCliente);
		txfIdCliente.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String  p, m, v, idCli;
				try{
					//idC = txfIdCarro.getText();
					p = txfPlaca.getText();
					m = txfModelo.getText();
					v = txfValor.getText();
					idCli = txfIdCliente.getText();
					
					if ( p.equals("") ||
						v.equals("")|| idCli.equals("")	){
						throw new Exception (
								"Favor preencher todas as caixas.");
					}else{
						Carro carro = new Carro();
						carro.setPlaca(p);
						carro.setModelo(m);
						v.replace(",",".");
						carro.setValor(Double.parseDouble(v));
						Cliente cliente = new Cliente();
						cliente.setIdCliente(Integer.parseInt(idCli));
						carro.setCliente(cliente);
						int ok = controleCarro.inserirControleHibernate(carro);
						if (ok == 1){
							JOptionPane.showMessageDialog(null,
									"Carro incluído com sucesso."); 
						}else{
							JOptionPane.showMessageDialog(null,
									"Carro não incluído"); 
						}
					}
						
					
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null,
							"Erro: " + ex.getMessage());
				}
			}
		});
		btnIncluir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIncluir.setBounds(305, 41, 115, 25);
		contentPane.add(btnIncluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String idC, p, m, v, idCli;
				try{
					idC = txfIdCarro.getText();
					p = txfPlaca.getText();
					m = txfModelo.getText();
					v = txfValor.getText();
					idCli = txfIdCliente.getText();
					
					if ( idC.equals("") || p.equals("") ||
						v.equals("")|| idCli.equals("")	){
						throw new Exception (
								"Favor preencher todas as caixas.");
					}else{
						Carro carro = new Carro();
						carro.setIdCarro(Integer.parseInt(idC));
						carro.setPlaca(p);
						carro.setModelo(m);
						v.replace(",",".");
						carro.setValor(Double.parseDouble(v));
						Cliente cliente = new Cliente();
						cliente.setIdCliente(Integer.parseInt(idCli));
						carro.setCliente(cliente);
						int ok = controleCarro.alterarControleHibernate(carro);
						if (ok == 1){
							JOptionPane.showMessageDialog(null,
									"Carro incluído com sucesso."); 
						}else{
							JOptionPane.showMessageDialog(null,
									"Carro não incluído"); 
						}
					}
						
					
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null,
							"Erro: " + ex.getMessage());
				}	
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAlterar.setBounds(305, 71, 115, 25);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int idCar = Integer.parseInt(
							JOptionPane.showInputDialog(
									"Digite o Id do Carro desejado."));
					Carro car = new Carro();
					car.setIdCarro(idCar);
					int ok = controleCarro.excluirControleHibernate(car);
					if (ok != 1){
						throw new Exception ("O carro não foi excluído.");
					}else{
						JOptionPane.showMessageDialog(null, 
								"Carro excluído com sucesso.");
					}
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, 
							"Erro: " + ex.getMessage());
				}
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExcluir.setBounds(305, 100, 115, 25);
		contentPane.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					int idCar = Integer.parseInt(
							JOptionPane.showInputDialog(
									"Digite o Id do Carro desejado."));
					Carro car = new Carro();
					car.setIdCarro(idCar);
					Carro carro = controleCarro.consultarControleHibernate(car);
					if (carro == null){
						throw new Exception ("O id desejado não existe carro cadastrado.");
					}else{
						txfIdCarro.setText(String.valueOf(carro.getIdCarro()));
						txfPlaca.setText(carro.getPlaca());
						txfModelo.setText(carro.getModelo());
						DecimalFormat df = new DecimalFormat("#####0.00");
						txfValor.setText(df.format(carro.getValor()));
						txfIdCliente.setText(String.valueOf(
								carro.getCliente().getIdCliente()));
					}
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, 
							"Erro: " + ex.getMessage());
				}
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConsultar.setBounds(305, 135, 115, 25);
		contentPane.add(btnConsultar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFechar.setBounds(305, 173, 115, 25);
		contentPane.add(btnFechar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfIdCarro.setText("");
				txfPlaca.setText("");
				txfModelo.setText("");
				txfValor.setText("");
				txfIdCliente.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setBounds(305, 211, 115, 25);
		contentPane.add(btnLimpar);
	}
}


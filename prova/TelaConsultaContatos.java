package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

@SuppressWarnings({ "unused", "serial" })
public class TelaConsultaContatos extends JFrame {

	private JPanel contentPane;
	public JTable tblContatos;
	private JScrollPane scpListaContatos;
	private JButton btnSelecionado;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaContatos frame = new TelaConsultaContatos();
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
	public TelaConsultaContatos() {
		setTitle("Consulta Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scpListaContatos = new JScrollPane();
		scpListaContatos.setBounds(10, 11, 549, 298);
		contentPane.add(scpListaContatos);
		
		tblContatos = new JTable();
		tblContatos.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] {
		                {null, null, null, null, null},
		                {null, null, null, null, null},
		                {null, null, null, null, null},
		                {null, null, null, null, null}
		            },
		            new String [] {
		                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
		            }
		        ));
		scpListaContatos.setViewportView(tblContatos);
		
		btnSelecionado = new JButton("Selecionado");
		btnSelecionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSelecionadoActionPerformed(e);
			}
		});
		btnSelecionado.setMnemonic('S');
		btnSelecionado.setBounds(161, 320, 120, 23);
		contentPane.add(btnSelecionado);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(285, 320, 114, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVoltarActionPerformed(e);
			}
		});
		btnVoltar.setMnemonic('V');
		contentPane.add(btnVoltar);
	}
	
	private void btnVoltarActionPerformed(ActionEvent e) {
		dispose();
	}
	
	private void btnSelecionadoActionPerformed(ActionEvent e) {
		int linha_selecionada = tblContatos.getSelectedRow(); //Pega linha selecionada
        TelaContato telacontato = new TelaContato();
        if (linha_selecionada >= 0){
           int protocolo = Integer.parseInt(tblContatos.getValueAt(linha_selecionada, 0).toString());
           telacontato.preencheContato(protocolo);
           this.setVisible(false);
           telacontato.setVisible(true);
        }
	}
}

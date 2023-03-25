package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import controle.ContatoDao;
import modelo.Contato;
import modelo.Diversos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings({ "unused", "serial" })
public class TelaContato extends JFrame {

	final String titulo = "Cadastro de Contatos"; 
	
	Contato contato = new Contato();
	
	ContatoDao contadodao = new ContatoDao();
	Diversos d = new Diversos();
	
	private JPanel contentPane;
	private JTextField txtIdentificador;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtDataNascimento;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnIncluir;
	private JButton btnNovo;
	private JButton btnLimpar;
	private JButton btnSair;
	
	 /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContato frame = new TelaContato();
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
	public TelaContato() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent evt) {
				formWindowActivated(evt);
			}
			@Override
			public void windowOpened(WindowEvent evt) {
				formWindowOpened(evt);
			}
		});
		setTitle("Incluir Contato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlDados = new JPanel();
		pnlDados.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlDados.setBounds(10, 11, 580, 225);
		contentPane.add(pnlDados);
		pnlDados.setLayout(null);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setBounds(10, 25, 136, 14);
		pnlDados.add(lblIdentificador);
		lblIdentificador.setToolTipText("");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 60, 136, 14);
		pnlDados.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 100, 136, 17);
		pnlDados.add(lblEmail);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(10, 142, 136, 14);
		pnlDados.add(lblEndereco);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(10, 182, 136, 14);
		pnlDados.add(lblDataDeNascimento);
		
		txtIdentificador = new JTextField();
		txtIdentificador.setBounds(156, 22, 69, 20);
		pnlDados.add(txtIdentificador);
		txtIdentificador.setColumns(10);
		
		txtIdentificador.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
            	txtIdentificadorFocusLost(evt);
            }
        });
		
		txtNome = new JTextField();
		txtNome.setBounds(156, 57, 349, 20);
		pnlDados.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(156, 97, 349, 20);
		pnlDados.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(156, 139, 349, 20);
		pnlDados.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(156, 179, 91, 20);
		pnlDados.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		JPanel pnlControles = new JPanel();
		pnlControles.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlControles.setBounds(10, 240, 580, 47);
		contentPane.add(pnlControles);
		pnlControles.setLayout(null);
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnNovoActionPerformed(evt);
			}
		});
		btnNovo.setMnemonic('N');
		btnNovo.setBounds(10, 11, 74, 23);
		pnlControles.add(btnNovo);
		
		btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIncluirActionPerformed(evt);
			}
		});
		btnIncluir.setMnemonic('I');
		btnIncluir.setBounds(90, 11, 74, 23);
		pnlControles.add(btnIncluir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAlterarActionPerformed(evt);
			}
		});
		btnAlterar.setMnemonic('A');
		btnAlterar.setBounds(168, 11, 74, 23);
		pnlControles.add(btnAlterar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnExcluirActionPerformed(evt);
			}
		});
		btnExcluir.setMnemonic('E');
		btnExcluir.setBounds(246, 11, 74, 23);
		pnlControles.add(btnExcluir);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnLimparActionPerformed(evt);
			}
		});
		btnLimpar.setMnemonic('L');
		btnLimpar.setBounds(420, 11, 74, 23);
		pnlControles.add(btnLimpar);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSairActionPerformed(evt);
			}
		});
		btnSair.setMnemonic('S');
		btnSair.setBounds(498, 11, 67, 23);
		pnlControles.add(btnSair);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnConsultarActionPerformed(evt);
			}
		});
		btnConsulta.setMnemonic('C');
		btnConsulta.setBounds(325, 11, 90, 23);
		pnlControles.add(btnConsulta);
	}
	
	private void formWindowActivated(WindowEvent evt) {
		this.setEnabled(true);
		txtIdentificador.requestFocusInWindow();
	}
	
	private void formWindowOpened(WindowEvent evt) {
		limpar();
	}
	
	private void btnNovoActionPerformed(ActionEvent evt) {
		limpar();
		txtIdentificador.setEnabled(false);
		txtIdentificador.setText(String.valueOf(contadodao.calculaChave()));
		txtNome.requestFocusInWindow();
		btnNovo.setEnabled(false);
		btnAlterar.setEnabled(false);
		btnExcluir.setEnabled(false);
	}

	private void btnConsultarActionPerformed(ActionEvent evt) {
		List<Contato> lista = new ArrayList<Contato>();

        lista = contadodao.getLista();

        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Identificador");
        modelo.addColumn("Nome");
        modelo.addColumn("E-mail");
        modelo.addColumn("Endereço");
        modelo.addColumn("Data de Nascimento");

        if (lista.isEmpty()) {
            modelo.addRow(new String[]{"Sem dados", null, null, null, null});
        }

        SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy");
        
        for (int i = 0; i < lista.size(); i++) {
            Contato contato = lista.get(i);
            //System.out.println(p.toString());
            
            // Alimenta as linhas de dados  
            modelo.addRow(new String[]{String.valueOf(contato.getId()),
            		                   contato.getNome(),
            		                   contato.getEmail(),
            		                   contato.getEndereco(),
            		                   dataformatada.format(contato.getDataNascimento().getTime())
            		                  });
        }
        TelaConsultaContatos telaconsultacontatos = new TelaConsultaContatos();
        telaconsultacontatos.tblContatos.setModel(modelo);
        this.setEnabled(false);
        telaconsultacontatos.setVisible(true);
	}
	
	private void btnIncluirActionPerformed(ActionEvent evt) {
		if (txtNome.getText().isEmpty() || txtEmail.getText().isEmpty() ||
			txtEndereco.getText().isEmpty() || txtDataNascimento.getText().isEmpty())
	        d.mostrarDados("Preencha todos os dados.", titulo, false);
	    else {  		
			// fazendo a conversão da data
			Calendar dataNascimento = null;
			
			try {
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(txtDataNascimento.getText());
				dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(date);
			} catch (ParseException e1) {
				d.mostrarDados("Erro de conversão da data", titulo, false);
			}
			
			// preenche o objeto contatos
			contato.setNome(txtNome.getText());
			contato.setEmail(txtEmail.getText());
			contato.setEndereco(txtEndereco.getText());
			contato.setDataNascimento(dataNascimento);	
	    	
			// tenta gravar no banco
            if (contadodao.adiciona(contato))
	           d.mostrarDados("Contato inserido com sucesso.", titulo, true);
	        else
	           d.mostrarDados("Erro ao gravar contato!",  titulo, false);
	        
	        btnIncluir.setEnabled(false);
	        btnAlterar.setEnabled(true);
	        btnExcluir.setEnabled(true);
	    }
	}
	
	private void btnAlterarActionPerformed(ActionEvent evt) {
		int numero = 0;
		if (txtNome.getText().isEmpty() || txtEmail.getText().isEmpty() ||
				txtEndereco.getText().isEmpty() || txtDataNascimento.getText().isEmpty())
		        d.mostrarDados("Preencha todos os dados.", titulo, false);
		else {  		
	        // fazendo a conversão da data
			Calendar dataNascimento = null;
				
			try {
			    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(txtDataNascimento.getText());
				dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(date);
			} catch (ParseException e1) {
				d.mostrarDados("Erro de conversão da data", titulo, false);
			}
				
			numero = Integer.parseInt(txtIdentificador.getText());
				
			// preenche o objeto contatos
			contato.setId((long) (numero));
			contato.setNome(txtNome.getText());
			contato.setEmail(txtEmail.getText());
			contato.setEndereco(txtEndereco.getText());
			contato.setDataNascimento(dataNascimento);	
		    
			// tenta gravar no banco
	        if (contadodao.altera(contato))
		       d.mostrarDados("Contato alterado com sucesso.", titulo, true);
		    else
		       d.mostrarDados("Erro ao alterar contato!",  titulo, false);
		        
		       btnIncluir.setEnabled(false);
		       btnAlterar.setEnabled(true);
		       btnExcluir.setEnabled(true);
		}
		txtIdentificador.setEditable(true);
	    btnLimparActionPerformed(evt);
	}

	private void btnExcluirActionPerformed(ActionEvent evt) {
		int numero = 0;
		if (txtNome.getText().isEmpty())
		    d.mostrarDados("Preencha o identificador.", titulo, false);
		else {  		
			// preenche o objeto contatos
			numero = Integer.parseInt(txtIdentificador.getText());
			
		   	contato.setId((long) (numero));
		    	
			// tenta gravar no banco
	        if (contadodao.remove(contato))
		       d.mostrarDados("Contato excluído com sucesso.", titulo, true);
		    else
		       d.mostrarDados("Erro ao excluir contato!",  titulo, false);
		        
		    btnIncluir.setEnabled(false);
		    btnAlterar.setEnabled(true);
		    btnExcluir.setEnabled(true);
		}
		txtIdentificador.setEditable(true);
	    btnLimparActionPerformed(evt);
	}
	
	private void btnSairActionPerformed(ActionEvent evt) {
		if (d.confirmar("Deseja retornar?", titulo))
	        dispose();
	}
	
	private void btnLimparActionPerformed(ActionEvent evt) {
		limpar();
	}
	
	private void txtIdentificadorFocusLost(FocusEvent evt) {
		int numero = 0;
	     
		if (!txtIdentificador.getText().isEmpty()) {
	      if(!d.testaNum(txtIdentificador.getText(), titulo))
	    	 txtIdentificador.setText("");
	      else{ 
	         numero = Integer.parseInt(txtIdentificador.getText());
	         if(!d.intervalo(numero, 0, 0, titulo))
	        	 txtIdentificador.setText("");
	         else{
	        	 contato.setId((long) (numero));
	             contato = contadodao.pesquisa(contato);
	             if (contato == null){
	                 d.mostrarDados("Contato inexistente.",titulo,false);
	             }    
	             else{  
	            	 carregaObjetos(contato);
	                 btnAlterar.setEnabled(true);
	                 btnExcluir.setEnabled(true);
	                 btnIncluir.setEnabled(false);
	                 btnNovo.setEnabled(false);
	             }                
	          }
	          txtIdentificador.setEditable(false);
	      }
	    } else {
	    	 txtIdentificador.setText("");
	    }
	}
	
	public void preencheContato(int Numero){
	   txtIdentificador.setText(String.valueOf(Numero));
	   txtNome.requestFocusInWindow(); 
	}
	
	private void limpar() {
		txtIdentificador.setEnabled(true);
		txtIdentificador.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtDataNascimento.setText("");	
        btnNovo.setEnabled(true);
        btnAlterar.setEnabled(true);
		btnExcluir.setEnabled(true);
		btnIncluir.setEnabled(true);
		txtIdentificador.requestFocusInWindow();
	}
	
	private void carregaObjetos(Contato contato){
	    txtIdentificador.setText(String.valueOf(contato.getId()));
	    txtNome.setText(contato.getNome());  
	    txtEndereco.setText(contato.getEndereco());
	    txtEmail.setText(contato.getEmail());
	    SimpleDateFormat datanascimento = new SimpleDateFormat("dd/MM/yyyy");
	    txtDataNascimento.setText(datanascimento.format(contato.getDataNascimento().getTime()));
	}
}

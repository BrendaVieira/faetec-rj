package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /* classe virar� tabela SEM usar o create table*/
@Table(name="Cliente")
public class Cliente {
	@Id /* antes de colocar a chave prim�ria */
	@GeneratedValue(strategy=GenerationType.AUTO) /*deixa a chave prim�ria auto incrementada*/
	private int idCliente;
	private String nome;
	private String telefone;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}

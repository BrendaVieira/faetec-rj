package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity /* classe virará tabela SEM usar o create table*/
@Table(name="carro")
public class Carro {
	@Id /* antes de colocar a chave primária */
	@GeneratedValue(strategy = GenerationType.AUTO)  /*deixa a chave primária auto incrementada (((placa não pode se chave primária, pois não é um número inteiro normal))))*/
	private int idCarro;
	private String placa;
	private String modelo;
	private double valor;
	
	@ManyToOne
	@JoinColumn(name = "ceIdCliente")
	private Cliente cliente;
	
	public int getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}

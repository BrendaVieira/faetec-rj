package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TabExemplar")
public class Exemplar {
	
	@Id
	private int codExemplar;
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "ceIdLivro")
	private Livro livro;
	
	public int getCodExemplar() {
		return codExemplar;
	}
	public void setCodExemplar(int codExemplar) {
		this.codExemplar = codExemplar;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}

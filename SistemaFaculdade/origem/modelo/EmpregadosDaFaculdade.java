package modelo;

public class EmpregadosDaFaculdade {
	private	String	nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	private double	salario;
	
	public	double	getGastos() {
		return this.salario;
}
public	String	getInfo() {
		return "nome:	"	+	this.nome	+	"	com	salário	"	+	this.salario;
 }
}

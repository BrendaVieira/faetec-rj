package aula241;

class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	protected int numeroDeFuncionariosGenenciados;
	
	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	public int getNumeroDeFuncionariosGenenciados() {
		return numeroDeFuncionariosGenenciados;
	}


	public void setNumeroDeFuncionariosGenenciados(
			int numeroDeFuncionariosGenenciados) {
		this.numeroDeFuncionariosGenenciados = numeroDeFuncionariosGenenciados;
	}

	public boolean autentica (int senha){
	if (this.senha== senha)	{
		System.out.println("Acesso Permitido");
		return true;
	}else{
		System.out.println("Acesso Negado");
		return false;
	}
	
}
	public double getBonificacao()	{
		return this.salario * 0.15;
	}
	
}

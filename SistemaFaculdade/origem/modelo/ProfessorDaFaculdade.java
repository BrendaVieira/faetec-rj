package modelo;


public class ProfessorDaFaculdade extends EmpregadosDaFaculdade{
	private int	horasDeAula;
	public int getHorasDeAula() {
		return horasDeAula;
	}
	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	public	double	getGastos() {
					return this.getSalario()	+	this.horasDeAula	*	10;
	}
	public	String	getInfo() {
					String	informacaoBasica	=	super.getInfo();
					String	informacao	=	informacaoBasica	+	"	horas	de	aula:	"
																																													+	this.horasDeAula;
					return	informacao;
	}

}

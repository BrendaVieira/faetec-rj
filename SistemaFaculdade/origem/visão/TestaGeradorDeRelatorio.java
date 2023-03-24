package visao;
import modelo.EmpregadosDaFaculdade;
import modelo.GeradorDeRelatorio;
import modelo.ProfessorDaFaculdade;
import modelo.Reitor;


public class TestaGeradorDeRelatorio {

	public static void main(String[] args) {
		GeradorDeRelatorio relatorio = new GeradorDeRelatorio();
		
		Reitor funcionario1 = new Reitor();
		funcionario1.setNome("José");
		funcionario1.setSalario(5000.0);
		relatorio.adiciona(funcionario1);
		
		EmpregadosDaFaculdade funcionario2 = new EmpregadosDaFaculdade();
		funcionario2.setNome("Paulo");
		funcionario2.setSalario(1000.0);
		relatorio.adiciona(funcionario2);
		
		ProfessorDaFaculdade funcionario3 = new ProfessorDaFaculdade();
		funcionario3.setNome("Carlos");
		funcionario3.setSalario(3000.0);
		funcionario3.setHorasDeAula(60);
		relatorio.adiciona(funcionario3);
 }
 }


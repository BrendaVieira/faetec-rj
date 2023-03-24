package controle;

import dao.DaoCarro;
import modelo.Carro;

public class ControleCarro {

	public int inserirControleHibernate(Carro carro) throws Exception{
		int flagOk;
		DaoCarro daoCar = new DaoCarro();
		daoCar.incluirDaoHibernate(carro);
		flagOk = 1;
		return flagOk;
	}
	
	public Carro consultarControleHibernate(Carro c) throws Exception{
		Carro car = null;
		DaoCarro daoCar = new DaoCarro();
		car = daoCar.consultarDaoHibernate(c);
		return car;
	}
	
	public int alterarControleHibernate(Carro c) throws Exception{
		int flagOk;
		DaoCarro daoCar = new DaoCarro();
		daoCar.alterarDaoHibernate(c);
		flagOk = 1;
		return flagOk;
	}
	
	public int excluirControleHibernate(Carro c) throws Exception{
		DaoCarro daoCar = new DaoCarro();
		daoCar.excluirDaoHibernate(c);
		int flagOk = 1;
		return flagOk;
	}

		
}
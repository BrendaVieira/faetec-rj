package controle;

import dao.DaoCliente;
import modelo.Cliente;

public class ControleCliente {
	
	public int inserirControleHibernate(Cliente Cliente) throws Exception{
		int flagOk;
		DaoCliente daoCar = new DaoCliente();
		daoCar.incluirDaoHibernate(Cliente);
		flagOk = 1;
		return flagOk;
	}
	
	public Cliente consultarControleHibernate(Cliente c) throws Exception{
		Cliente car = null;
		DaoCliente daoCar = new DaoCliente();
		car = daoCar.consultarDaoHibernate(c);
		return car;
	}
	
	public int alterarControleHibernate(Cliente c) throws Exception{
		int flagOk;
		DaoCliente daoCar = new DaoCliente();
		daoCar.alterarDaoHibernate(c);
		flagOk = 1;
		return flagOk;
	}


}
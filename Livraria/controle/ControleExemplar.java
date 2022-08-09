package controle;

import modelo.Exemplar;
import dao.DaoExemplar;

public class ControleExemplar {

	public int inserirControleHibernate(Exemplar Exemplar) throws Exception{
		 
		  int flagOk;
		  DaoExemplar daoclient = new DaoExemplar();
		  daoclient.incluirDaoHibernate(Exemplar);
		  flagOk = 1;
		  return flagOk;
	 }
	 
	 public Exemplar consultarControleHibernate(Exemplar c) throws Exception{
		 
		  Exemplar client = null;
		  DaoExemplar daoclient = new DaoExemplar();
		  client = daoclient.consultarDaoHibernate(c);
		  return client;
	 }
	 
	 public int alterarControleHibernate(Exemplar c) throws Exception{
		 
		  int flagOk;
		  DaoExemplar daoclient = new DaoExemplar();
		  daoclient.alterarDaoHibernate(c);
		  flagOk = 1;
		  return flagOk;
	 }
	 
	 public void excluirControleHibernate(Exemplar c) throws Exception{
		  Exemplar client = null;
		  DaoExemplar daoclient = new DaoExemplar();
		  daoclient.excluirDaoHibernate(c);
		 }
	
}

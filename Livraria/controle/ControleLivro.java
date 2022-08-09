package controle;

import modelo.Livro;
import dao.DaoLivro;

public class ControleLivro {
	
	public int inserirControleHibernate(Livro Livro) throws Exception{
		 
		  int flagOk;
		  DaoLivro daoclient = new DaoLivro();
		  daoclient.incluirDaoHibernate(Livro);
		  flagOk = 1;
		  return flagOk;
	 }
	 
	 public Livro consultarControleHibernate(Livro c) throws Exception{
		 
		  Livro client = null;
		  DaoLivro daoclient = new DaoLivro();
		  client = daoclient.consultarDaoHibernate(c);
		  return client;
	 }
	 
	 public int alterarControleHibernate(Livro c) throws Exception{
		 
		  int flagOk;
		  DaoLivro daoclient = new DaoLivro();
		  daoclient.alterarDaoHibernate(c);
		  flagOk = 1;
		  return flagOk;
	 }
	 
	 public void excluirControleHibernate(Livro c) throws Exception{
		  Livro client = null;
		  DaoLivro daoclient = new DaoLivro();
		  daoclient.excluirDaoHibernate(c);
		 }
	
}

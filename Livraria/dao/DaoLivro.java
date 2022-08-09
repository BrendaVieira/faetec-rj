package dao;

import modelo.Livro;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class DaoLivro {
	
	 private SessionFactory fabrica;
	 
	 public DaoLivro() throws Exception{
	  // Cria uma configuração
	  AnnotationConfiguration configuration = 
	                                           new AnnotationConfiguration();
	  // Lê o arquivo hibernate.cfg.xml
	  configuration.configure("hibernate.cfg.xml");
	  // Cria o objeto fabrica responsável em criar os objetos Sessions
	  fabrica = configuration.buildSessionFactory(); 
	      }     
	 
	 public void incluirDaoHibernate(Livro e) throws Exception {
	  Session sessao = fabrica.openSession();
	  Transaction transacao= sessao.beginTransaction();
	  sessao.save(e);
	  transacao.commit();
	  sessao.close();
	 }
	 public void alterarDaoHibernate(Livro e) throws Exception {
	  Session sessao = fabrica.openSession();
	  Transaction transacao= sessao.beginTransaction();
	  sessao.update(e);
	  transacao.commit();
	  sessao.close();
	 }
	 public void excluirDaoHibernate(Livro e) throws Exception {
	  Session sessao = fabrica.openSession();
	  Transaction transacao= sessao.beginTransaction();
	  sessao.delete(e);
	  transacao.commit();
	  sessao.close();
	 }
	 public Livro consultarDaoHibernate(Livro e)throws Exception{
	  Livro ev;
	  Session sessao =fabrica.openSession();
	  Transaction transacao = sessao.beginTransaction();
	  ev = (Livro)sessao.load(modelo.Livro.class, e.getCodLivro());
	  transacao.commit();
	  //sessao.close();
	  return ev;
	 }
	
}

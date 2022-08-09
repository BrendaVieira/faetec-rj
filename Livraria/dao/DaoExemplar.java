package dao;

import modelo.Exemplar;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class DaoExemplar {

	 private SessionFactory fabrica;
	 
	 public DaoExemplar() throws Exception{
	  // Cria uma configuração
	  AnnotationConfiguration configuration = 
	                                           new AnnotationConfiguration();
	  // Lê o arquivo hibernate.cfg.xml
	  configuration.configure("hibernate.cfg.xml");
	  // Cria o objeto fabrica responsável em criar os objetos Sessions
	  fabrica = configuration.buildSessionFactory(); 
	      }     
	 
	 public void incluirDaoHibernate(Exemplar e) throws Exception {
	  Session sessao = fabrica.openSession();
	  Transaction transacao= sessao.beginTransaction();
	  sessao.save(e);
	  transacao.commit();
	  sessao.close();
	 }
	 public void alterarDaoHibernate(Exemplar e) throws Exception {
	  Session sessao = fabrica.openSession();
	  Transaction transacao= sessao.beginTransaction();
	  sessao.update(e);
	  transacao.commit();
	  sessao.close();
	 }
	 public void excluirDaoHibernate(Exemplar e) throws Exception {
	  Session sessao = fabrica.openSession();
	  Transaction transacao= sessao.beginTransaction();
	  sessao.delete(e);
	  transacao.commit();
	  sessao.close();
	 }
	 public Exemplar consultarDaoHibernate(Exemplar e)throws Exception{
	  Exemplar ev;
	  Session sessao =fabrica.openSession();
	  Transaction transacao = sessao.beginTransaction();
	  ev = (Exemplar)sessao.load(modelo.Exemplar.class, e.getCodExemplar());
	  transacao.commit();
	  //sessao.close();
	  return ev;
	 }
	
}

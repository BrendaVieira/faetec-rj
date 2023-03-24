package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import modelo.Cliente;

public class DaoCliente {

private SessionFactory fabrica;
	
	public DaoCliente() throws Exception{
		// Cria uma configuração
		AnnotationConfiguration configuration = 
                                           new AnnotationConfiguration();
		// Lê o arquivo hibernate.cfg.xml
		configuration.configure("hibernate.cfg.xml");
		// Cria o objeto fabrica responsável em criar os objetos Sessions
		fabrica = configuration.buildSessionFactory();	
      }     
	
	public void incluirDaoHibernate(Cliente e) throws Exception {
		Session sessao = fabrica.openSession();
		Transaction transacao= sessao.beginTransaction();
		sessao.save(e);
		transacao.commit();
		sessao.close();
	}
	public void alterarDaoHibernate(Cliente e) throws Exception {
		Session sessao = fabrica.openSession();
		Transaction transacao= sessao.beginTransaction();
		sessao.update(e);
		transacao.commit();
		sessao.close();
	}
	public void excluirDaoHibernate(Cliente e) throws Exception {
		Session sessao = fabrica.openSession();
		Transaction transacao= sessao.beginTransaction();
		sessao.delete(e);
		transacao.commit();
		sessao.close();
	}
	public Cliente consultarDaoHibernate(Cliente e)throws Exception{
		Cliente ev;
		Session sessao =fabrica.openSession();
		Transaction transacao = sessao.beginTransaction();
		ev = (Cliente)sessao.load(modelo.Cliente.class, e.getIdCliente());
		transacao.commit();
		//sessao.close();
		return ev;
	}

}
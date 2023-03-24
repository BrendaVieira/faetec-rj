package dao;

import modelo.Carro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DaoCarro {
	private SessionFactory fabrica;
	
	public DaoCarro() throws Exception{
		// Cria uma configuração
		AnnotationConfiguration configuration = 
                                           new AnnotationConfiguration();
		// Lê o arquivo hibernate.cfg.xml
		configuration.configure("hibernate.cfg.xml");
		// Cria o objeto fabrica responsável em criar os objetos Sessions
		fabrica = configuration.buildSessionFactory();	
      }     
	
	public void incluirDaoHibernate(Carro e) throws Exception {
		Session sessao = fabrica.openSession();
		Transaction transacao= sessao.beginTransaction();
		sessao.save(e);
		transacao.commit();
		sessao.close();
	}
	public void alterarDaoHibernate(Carro e) throws Exception {
		Session sessao = fabrica.openSession();
		Transaction transacao= sessao.beginTransaction();
		sessao.update(e);
		transacao.commit();
		sessao.close();
	}
	public void excluirDaoHibernate(Carro e) throws Exception {
		Session sessao = fabrica.openSession();
		Transaction transacao= sessao.beginTransaction();
		sessao.delete(e);
		transacao.commit();
		sessao.close();
	}
	public Carro consultarDaoHibernate(Carro e)throws Exception{
		Carro ev;
		Session sessao =fabrica.openSession();
		Transaction transacao = sessao.beginTransaction();
		ev = (Carro)sessao.load(modelo.Carro.class, e.getIdCarro());
		transacao.commit();
		//sessao.close();
		return ev;
	}


}
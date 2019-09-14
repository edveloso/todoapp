package br.edu.infnet.todoapp.app.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class Dao<T> {

	@PersistenceContext
	private EntityManager em;
	
	public void salvar(T t) {
		em.persist(t);
	}
	
	public void editar(T t) {
		em.merge(t);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}

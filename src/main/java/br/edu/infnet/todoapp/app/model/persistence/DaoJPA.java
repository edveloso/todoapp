package br.edu.infnet.todoapp.app.model.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

@Repository
public abstract class DaoJPA<T> implements IDAO<T> {

	@PersistenceContext
	private EntityManager em;
	
	private Class<T> classe;
	
	public DaoJPA(Class<T> classe) {
		this.classe = classe;
	}
	
	public void salvar(T obj) {
		em.persist(obj);
	}
	
	public void editar(T obj) {
		em.merge(obj);
	}
	
	public void delete(Integer id) {
		em.remove(findOne(id));
	}
	
	
	public T findOne(Integer id) {
		return em.find(classe, id);
	}
	
	
	public List<T> getAll(){
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(classe);
		query.from(classe);
		return em.createQuery(query).getResultList();
	}
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}

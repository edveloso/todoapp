package br.edu.infnet.todoapp.app.model.persistence;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

@Repository
public abstract class JpaDao<T> implements IDAO<T> {

	@PersistenceContext
	private EntityManager em;
	
	private Class<T> classe;
	
	public JpaDao() {
	  this.classe = (Class<T>) ((ParameterizedType)getClass()
			  		.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	

	public void salvar(T t) {
		em.persist(t);
	}
	
	public void editar(T t) {
		em.merge(t);
	}

	public void deletar(Integer id) {
		T t = findOne(id);
		em.remove(t);
	}

	public T findOne(Integer id) {
		return em.find(classe, id);
	}

	
	public List<T> getAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(classe);
		query.from(classe);
		return em.createQuery(query).getResultList();
	}

	public EntityManager getEntityManager() {
		return em;
	}

	public void setEntityManager(EntityManager em) {
		this.em = em;
		
	}

	
}

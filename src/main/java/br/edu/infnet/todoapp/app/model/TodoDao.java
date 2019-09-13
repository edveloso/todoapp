package br.edu.infnet.todoapp.app.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class TodoDao {

	@PersistenceContext
	private EntityManager em;

	
	public void salvar(Todo todo) {
		em.persist(todo);
	}

	public void atualizar(Todo todo) {
		em.merge(todo);
	}
	
	public Todo getTodo(Integer id) {
		return em.find(Todo.class, id);
	}
	
	public List<Todo> getAll(){
		return em.createQuery(" select t from Todo t ").getResultList();
	}
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
}

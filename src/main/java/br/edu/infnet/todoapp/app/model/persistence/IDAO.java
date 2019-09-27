package br.edu.infnet.todoapp.app.model.persistence;

import java.util.List;

import javax.persistence.EntityManager;

public interface IDAO<T> {

	void salvar(T t);
	
	void editar(T t);
	
	void deletar(Integer id);
	
	T findOne(Integer id);
	
	List<T> getAll();
	
	EntityManager getEntityManager();

	void setEntityManager(EntityManager em);
	
}

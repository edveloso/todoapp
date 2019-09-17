package br.edu.infnet.todoapp.app.model.persistence;

import java.util.List;

import javax.persistence.EntityManager;

public interface IDAO<T> {

	void salvar(T t);

	public void editar(T obj);
	
	public void delete(Integer id);
	
	public T findOne(Integer id);
	
	public List<T> getAll();

	EntityManager getEm();

	void setEm(EntityManager em);

}
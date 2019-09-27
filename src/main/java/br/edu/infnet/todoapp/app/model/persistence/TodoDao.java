package br.edu.infnet.todoapp.app.model.persistence;

import org.springframework.stereotype.Repository;

import br.edu.infnet.todoapp.app.model.Todo;

@Repository
public class TodoDao extends JpaDao<Todo> {

	public TodoDao() {
		super(Todo.class);
	}
	
	
	
}

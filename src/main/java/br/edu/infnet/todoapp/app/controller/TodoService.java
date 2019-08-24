package br.edu.infnet.todoapp.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.infnet.todoapp.app.model.Todo;



@Service
public class TodoService {
 
	private List<Todo> repositorio;
	
	public TodoService() {
		repositorio = new ArrayList<Todo>();
	}
	
	public List<Todo> getTodos() {
		
		return repositorio;
	}

	public void persite(Todo todo) {
		repositorio.add(todo);
	}

}

package br.edu.infnet.todoapp.app.model;

public class Todo {
	
	private String tarefa;
	
	private Boolean pronto;
	
	public Todo() {
	}

	public Todo(String tarefa, Boolean pronto) {
		super();
		this.tarefa = tarefa;
		this.pronto = pronto;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public Boolean getPronto() {
		return pronto;
	}

	public void setPronto(Boolean pronto) {
		this.pronto = pronto;
	}

	
}

package br.edu.infnet.todoapp.app.model.persistence;

import org.springframework.stereotype.Repository;

import br.edu.infnet.todoapp.app.model.Usuario;

@Repository
public class UsuarioDao extends DaoJPA<Usuario> {

	public UsuarioDao() {
		super(Usuario.class);
	}

	
}

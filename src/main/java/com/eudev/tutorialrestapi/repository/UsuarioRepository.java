package com.eudev.tutorialrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.eudev.tutorialrestapi.model.UsuarioModel;

public interface UsuarioRepository  extends CrudRepository<UsuarioModel, Long>{

	

}

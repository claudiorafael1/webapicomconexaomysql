package com.eudev.tutorialrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eudev.tutorialrestapi.model.UsuarioModel;
import com.eudev.tutorialrestapi.repository.UsuarioRepository;

@RestController
@RequestMapping()
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping(path = "/api/usuario/{codigo}")
	public ResponseEntity consultar(@PathVariable("codigo") Long codigo) {
		return usuarioRepository.findById(codigo)
				.map(record->ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping(path="api/usuario/salvar")
	public UsuarioModel salvar (@RequestBody UsuarioModel  usuario) {
		return usuarioRepository.save(usuario);
		
	}

}

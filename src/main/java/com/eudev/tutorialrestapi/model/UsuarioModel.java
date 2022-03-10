package com.eudev.tutorialrestapi.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.*;
@Entity(name = "tbl_usuario")
public class UsuarioModel implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long Id;
	@Column(nullable = false, length= 180)
private String nome;
private String login;
private String senha;
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
@Override
public int hashCode() {
	return Objects.hash(Id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UsuarioModel other = (UsuarioModel) obj;
	return Id == other.Id;
}



}

package co.edu.unbosque.tiendavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="usuario")
public class UsuarioModel {
	
	@Id
	private Long cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String usuario;
	private String password;
	
	
	public UsuarioModel() {

	}


	public UsuarioModel(Long cedula_usuario, String email_usuario, String nombre_usuario, String usuario,
			String password) {
		this.cedula_usuario = cedula_usuario;
		this.email_usuario = email_usuario;
		this.nombre_usuario = nombre_usuario;
		this.usuario = usuario;
		this.password = password;
	}


	public Long getCedula_usuario() {
		return cedula_usuario;
	}


	public void setCedula_usuario(Long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}


	public String getEmail_usuario() {
		return email_usuario;
	}


	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}


	public String getNombre_usuario() {
		return nombre_usuario;
	}


	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if(!(obj instanceof UsuarioModel)) {
			return false;
		}
		
	UsuarioModel usuarioModel = (UsuarioModel) obj;
		return Objects.equals(cedula_usuario, usuarioModel.cedula_usuario) && Objects.equals(nombre_usuario, usuarioModel.nombre_usuario)&&
				Objects.equals(email_usuario, usuarioModel.email_usuario) && Objects.equals(usuario, usuarioModel.usuario) && Objects.equals(password, usuarioModel.password);
	}


	@Override
	public int hashCode() {
		
		return Objects.hash(cedula_usuario, nombre_usuario, email_usuario, usuario, password);
	}


	@Override
	public String toString() {
		return "(" +
				"cedula_usuario" + getCedula_usuario() + "'"+
				"email_usuario" + getEmail_usuario() +"'"+
				"nombre_usuario" + getNombre_usuario() + "'"+
				"usuario" + getUsuario() + "'"+
				"password" + getPassword() + "'"+
				")";
	}


}

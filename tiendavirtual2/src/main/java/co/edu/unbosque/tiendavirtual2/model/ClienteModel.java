package co.edu.unbosque.tiendavirtual2.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteModel {
	
	@Id
	private long cedula_cliente;
	private String nombre_cliente;
	private String email_cliente;
	private String direccion_cliente;
	private long telefono_cliente;
	
	
	
	public ClienteModel(long cedula_cliente, String nombre_cliente, String email_cliente, String direccion_cliente,
			long telefono_cliente) {

		this.cedula_cliente = cedula_cliente;
		this.nombre_cliente = nombre_cliente;
		this.email_cliente = email_cliente;
		this.direccion_cliente = direccion_cliente;
		this.telefono_cliente = telefono_cliente;
	}
	
	
	public ClienteModel() {
		
	}
	
	
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	
	
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	
	
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	
	
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	
	
	public String getEmail_cliente() {
		return email_cliente;
	}
	
	
	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}
	
	
	public String getDireccion_cliente() {
		return direccion_cliente;
	}
	
	
	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}
	
	
	public long getTelefono_cliente() {
		return telefono_cliente;
	}
	
	
	public void setTelefono_cliente(long telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if(!(obj instanceof ClienteModel)) {
			return false;
		}
		
		ClienteModel clienteModel = (ClienteModel) obj;
		return Objects.equals(cedula_cliente, clienteModel.cedula_cliente) && Objects.equals(nombre_cliente, clienteModel.nombre_cliente)&&
				Objects.equals(email_cliente, clienteModel.email_cliente) && Objects.equals(direccion_cliente, clienteModel.direccion_cliente) && Objects.equals(telefono_cliente, clienteModel.telefono_cliente);
	}

	
	@Override
	public int hashCode() {
		
		return Objects.hash(cedula_cliente, nombre_cliente, email_cliente, direccion_cliente, telefono_cliente);
	}
	
	@Override
	public String toString() {
		return "(" +
				"cedula_cliente" + getCedula_cliente() + "'"+
				"email_cliente" + getEmail_cliente() +"'"+
				"nombre_cliente" + getNombre_cliente() + "'"+
				"direccion_cliente" + getDireccion_cliente() + "'"+
				"telefono_cliente" + getTelefono_cliente() + "'"+
				")";
	}
}

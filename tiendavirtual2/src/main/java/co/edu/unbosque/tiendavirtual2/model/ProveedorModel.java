package co.edu.unbosque.tiendavirtual2.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedor")
public class ProveedorModel {
	
	@Id
	private long nit_proveedor;
	private String nombre_proveedor;
	private String ciudad;
	private String direccion_proveedor;
	private long telefono_proveedor;

	public ProveedorModel() {
		
	}

	public ProveedorModel(long nit_proveedor, String nombre_proveedor, String ciudad, String direccion_proveedor,
			long telefono_proveedor) {
		this.nit_proveedor = nit_proveedor;
		this.nombre_proveedor = nombre_proveedor;
		this.ciudad = ciudad;
		this.direccion_proveedor = direccion_proveedor;
		this.telefono_proveedor = telefono_proveedor;
	}

	
	public long getNIT_proveedor() {
		return nit_proveedor;
	}


	public void setNIT_proveedor(long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}


	public String getNombre_proveedor() {
		return nombre_proveedor;
	}


	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}


	public String getCiudad() {
		return ciudad;
	}

	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}


	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}

	
	public long getTelefono_proveedor() {
		return telefono_proveedor;
	}


	public void setTelefono_proveedor(long telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if(!(obj instanceof ProveedorModel)) {
			return false;
		}
		
	ProveedorModel proveedorModel = (ProveedorModel) obj;
		return Objects.equals(nit_proveedor, proveedorModel.nit_proveedor) && Objects.equals(nombre_proveedor, proveedorModel.nombre_proveedor)&&
				Objects.equals(direccion_proveedor, proveedorModel.direccion_proveedor) && Objects.equals(ciudad, proveedorModel.ciudad) && Objects.equals(telefono_proveedor, proveedorModel.telefono_proveedor);
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(nit_proveedor, nombre_proveedor, direccion_proveedor, ciudad, telefono_proveedor);
	}

	@Override
	public String toString() {
		return "("+
				"nit_proveedor" + getNIT_proveedor() + "'"+
				"nombre_proveedor" + getNombre_proveedor() + "'"+
				"ciudad"+ getCiudad() + "'"+
				"direccion_proveedor" + getDireccion_proveedor() + "'"+
				"telefono_proveedor" + getTelefono_proveedor() + "'"+
				")";
	}	
	
	

}

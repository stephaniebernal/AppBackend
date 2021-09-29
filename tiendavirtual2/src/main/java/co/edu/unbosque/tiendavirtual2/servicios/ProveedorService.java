package co.edu.unbosque.tiendavirtual2.dao;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.tiendavirtual2.model.ProveedorModel;
import co.edu.unbosque.tiendavirtual2.repositorio.ProveedorRepositorio;

@Service
public class ProveedorService {

	@Autowired
	ProveedorRepositorio proveedorRepositorio;
	
	public ProveedorModel registrarProveedor(ProveedorModel proveedor) {
		return proveedorRepositorio.save(proveedor);
	}
	
	public Optional<ProveedorModel> consultaNIT(Long nit){
		return proveedorRepositorio.findById(nit);
	}
	
	public ArrayList<ProveedorModel> listaProveedores(){
		return (ArrayList<ProveedorModel>) proveedorRepositorio.findAll();
	}
	
	public boolean eliminarProveedor(Long nit) {
		try {
			proveedorRepositorio.deleteById(nit);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
}

package co.edu.unbosque.tiendavirtual2.api;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.tiendavirtual2.dao.ProveedorService;
import co.edu.unbosque.tiendavirtual2.model.ProveedorModel;


@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	ProveedorService proveedorService;
	
	@PostMapping
	public ProveedorModel registrarProveedor(@RequestBody ProveedorModel proveedor) {
		return proveedorService.registrarProveedor(proveedor);
	}
	
	@GetMapping
	public ArrayList<ProveedorModel> listaProveedores(){
		return proveedorService.listaProveedores();
	}
	
	@GetMapping(path = "{nit}")
	public Optional<ProveedorModel> consultarNIT(@PathVariable("nit") Long nit){
		return proveedorService.consultaNIT(nit);
	}
		
	@DeleteMapping(path = "{nit}")
	public String eliminarProveedor(@PathVariable("nit") Long nit) {
		boolean eliminado = proveedorService.eliminarProveedor(nit);
		
		if (eliminado) {
			return "Proveedor Eliminado";
		}else {
			return "Error Eliminando Proveedor";
		}
	}

}

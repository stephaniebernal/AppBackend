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

import co.edu.unbosque.tiendavirtual2.dao.ClienteService;
import co.edu.unbosque.tiendavirtual2.model.ClienteModel;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@PostMapping
	public ClienteModel registrarCliente(@RequestBody ClienteModel cliente) {
		return clienteService.registrarCliente(cliente);
	}
	
	@GetMapping
	public ArrayList<ClienteModel> listaClientes(){
		return clienteService.listaClientes();
	}
	
	@GetMapping(path = "{cedulacliente}")
	public Optional<ClienteModel> consultaCedulacliente(@PathVariable("cedulacliente") Long cedulacliente){
		return clienteService.consultaCedulaCliente(cedulacliente);
	}
	
	@DeleteMapping(path = "{cedulacliente}")
	public String eliminarCliente(@PathVariable("cedulacliente") Long cedulacliente) {
		boolean eliminado = clienteService.eliminarCliente(cedulacliente);
		
		if (eliminado) {
			return "Cliente Eliminado";
		}else {
			return "Error Eliminando Cliente";
		}
	}
}

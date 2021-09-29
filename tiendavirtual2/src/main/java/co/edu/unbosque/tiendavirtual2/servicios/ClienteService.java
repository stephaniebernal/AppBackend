package co.edu.unbosque.tiendavirtual2.dao;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.tiendavirtual2.model.ClienteModel;
import co.edu.unbosque.tiendavirtual2.repositorio.ClienteRepositorio;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepositorio clienteRepositorio;
	
	public ClienteModel registrarCliente(ClienteModel cliente) {
		return clienteRepositorio.save(cliente);
	}

	public Optional<ClienteModel> consultaCedulaCliente(Long cedulacliente){
		return clienteRepositorio.findById(cedulacliente);
	}
	
	public ArrayList<ClienteModel> listaClientes(){
		return (ArrayList<ClienteModel>) clienteRepositorio.findAll();
	}
	
	public boolean eliminarCliente(Long cedulacliente) {
		try {
			clienteRepositorio.deleteById(cedulacliente);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
}

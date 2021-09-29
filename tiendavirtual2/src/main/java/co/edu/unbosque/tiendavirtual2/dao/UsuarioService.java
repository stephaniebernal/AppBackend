package co.edu.unbosque.tiendavirtual2.dao;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.tiendavirtual2.model.UsuarioModel;
import co.edu.unbosque.tiendavirtual2.repositorio.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	public UsuarioModel registrarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public Optional<UsuarioModel> consultaCedula(Long cedula){
		return usuarioRepositorio.findById(cedula);
	}
	
	public ArrayList<UsuarioModel> listaUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	}
	
	public boolean eliminarUsuario(Long cedula) {
		try {
			usuarioRepositorio.deleteById(cedula);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
}

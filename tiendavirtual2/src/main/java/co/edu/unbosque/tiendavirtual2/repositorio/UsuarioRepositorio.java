package co.edu.unbosque.tiendavirtual2.repositorio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.tiendavirtual2.model.UsuarioModel;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModel, Long>{
	
	public abstract Optional<UsuarioModel> findById(Long cedula_usuario);
	
}

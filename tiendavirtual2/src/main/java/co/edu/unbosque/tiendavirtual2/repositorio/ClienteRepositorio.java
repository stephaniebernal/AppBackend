package co.edu.unbosque.tiendavirtual2.repositorio;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.tiendavirtual2.model.ClienteModel;

public interface ClienteRepositorio extends CrudRepository<ClienteModel, Long> {

}

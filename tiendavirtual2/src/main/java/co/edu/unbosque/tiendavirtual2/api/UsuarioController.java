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

import co.edu.unbosque.tiendavirtual2.dao.UsuarioService;
import co.edu.unbosque.tiendavirtual2.model.UsuarioModel;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public UsuarioModel registrarUsuario(@RequestBody UsuarioModel usuario) {
		return usuarioService.registrarUsuario(usuario);
	}
	
	@GetMapping
	public ArrayList<UsuarioModel> listaUsuarios(){
		return usuarioService.listaUsuarios();
	}
	
	@GetMapping(path = "{cedula}")
	public Optional<UsuarioModel> consultaCedula(@PathVariable("cedula") Long cedula){
		return usuarioService.consultaCedula(cedula);
	}
		
	@DeleteMapping(path = "{cedula}")
	public String eliminarUsuario(@PathVariable("cedula") Long cedula) {
		boolean eliminado = usuarioService.eliminarUsuario(cedula);
		
		if (eliminado) {
			return "Usuario Eliminado";
		}else {
			return "Error Eliminando Usuario";
		}
	}
	
	
}

package co.edu.unbosque.tiendavirtual2.controlador;

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

import co.edu.unbosque.tiendavirtual2.model.UsuarioModel;
import co.edu.unbosque.tiendavirtual2.servicios.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public UsuarioModel registrarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.registrarUsuario(usuario);
	}
	
	@GetMapping
	public ArrayList<UsuarioModel> listaUsuarios(){
		return usuarioService.listaUsuarios();
	}
	
	@GetMapping(path = "{cedula_usuario}")
	public Optional<UsuarioModel> consultaCedula(@PathVariable("cedula_usuario") Long cedula_usuario){
		return this.usuarioService.consultaCedula(cedula_usuario);
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

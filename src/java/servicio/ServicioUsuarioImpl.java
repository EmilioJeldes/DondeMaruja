package servicio;

import modelo.Usuario;
import repositorio.UsuarioRepositorio;
import repositorio.UsuarioRepositorioImpl;

public class ServicioUsuarioImpl implements ServicioUsuario {

	UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorioImpl();

	@Override
	public boolean isLoggedIn(String id) {
		boolean logeado = false;
		int intId = 0;
		try {
			intId = Integer.parseInt(id);
		} catch (RuntimeException e) {
			e.getMessage();
		}

		if (intId == 0) {
			throw new RuntimeException("No existe un usuario con la id proporcionada");
		} else {
			logeado = usuarioRepositorio.isLoggedIn(intId);
		}
		return logeado;
	}

	@Override
	public Usuario iniciarSesion(String email, String contraseña) {
		Usuario usr = usuarioRepositorio.login(email, contraseña);
		return usr;
	}

}

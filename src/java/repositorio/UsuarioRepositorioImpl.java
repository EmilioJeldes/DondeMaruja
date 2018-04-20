package repositorio;

import java.util.Optional;
import modelo.User;

public class UsuarioRepositorioImpl implements UsuarioRepositorio {

	public static int ID_USUARIO = 0;

	public UsuarioRepositorioImpl() {
	}

	@Override
	public User buscarPorId(int id) {
		User usuario = utilidades.Utilidades.usuarios.stream().filter(u -> u.getId() == id).findFirst().get();
		return usuario;
	}

	@Override
	public User buscarPorNombre(String nombre, String apellido) {
		User usuario = utilidades.Utilidades.usuarios.stream().filter(u -> u.getNombre().equals(nombre) && u.getApellido().equals(apellido)).findFirst().get();
		return usuario;
	}

	@Override
	public User guardar(User usuario) {
		User usuarioGuardado = null;
		if (usuario.getId() == 0) {
			ID_USUARIO++;
			usuario.setId(ID_USUARIO);
			utilidades.Utilidades.usuarios.add(usuario);
			usuarioGuardado = utilidades.Utilidades.usuarios.stream().filter(u -> u.getId() == ID_USUARIO).findFirst().get();
		} else {
			utilidades.Utilidades.usuarios.remove(usuario.getId());
			utilidades.Utilidades.usuarios.add(usuario.getId(), usuario);
			usuarioGuardado = utilidades.Utilidades.usuarios.stream().filter(u -> u.getId() == usuario.getId()).findFirst().get();
		}
		return usuarioGuardado;
	}

	@Override
	public void eliminarPorId(int id) {
		User user = utilidades.Utilidades.usuarios.stream().filter(u -> u.getId() == id).findFirst().get();
		utilidades.Utilidades.usuarios.remove(user.getId());
	}

	@Override
	public User login(String email, String password) throws RuntimeException {
		User usuarioLogeado = null;
		Optional<User> findFirst = utilidades.Utilidades.usuarios.stream().filter(u -> u.getEmail().equals(email) && u.getContraseña().equals(password)).findFirst();
		if (findFirst.isPresent()) {
			usuarioLogeado = findFirst.get();
		} else {
			throw new RuntimeException("Usuario y contraseña incorrectos");
		}

		return usuarioLogeado;
	}

	@Override
	public boolean isLoggedIn(int id) {
		boolean logeado = false;
		logeado = utilidades.Utilidades.usuarios.stream().filter(u -> u.getId() == id).findFirst().get().isLogeado();
		return logeado;
	}

}

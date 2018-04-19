package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class UsuarioRepositorioImpl implements UsuarioRepositorio {

	public static List<Usuario> usuarios = new ArrayList<>();
	public static int ID_USUARIO = 0;

	public UsuarioRepositorioImpl() {
		usuarios = new ArrayList<>();
	}

	@Override
	public Usuario buscarPorId(int id) {
		Usuario usuario = usuarios.stream().filter(u -> u.getId() == id).findFirst().get();
		return usuario;
	}

	@Override
	public Usuario buscarPorNombre(String nombre, String apellido) {
		Usuario usuario = usuarios.stream().filter(u -> u.getNombre().equals(nombre) && u.getApellido().equals(apellido)).findFirst().get();
		return usuario;
	}

	@Override
	public Usuario guardar(Usuario usuario) {
		Usuario usuarioGuardado = null;
		if (usuario.getId() == 0) {
			ID_USUARIO++;
			usuario.setId(ID_USUARIO);
			usuarios.add(usuario);
			usuarioGuardado = usuarios.stream().filter(u -> u.getId() == ID_USUARIO).findFirst().get();
		} else {
			usuarios.remove(usuario.getId());
			usuarios.add(usuario.getId(), usuario);
			usuarioGuardado = usuarios.stream().filter(u -> u.getId() == usuario.getId()).findFirst().get();
		}
		return usuarioGuardado;
	}

	@Override
	public void eliminarPorId(int id) {
		Usuario user = usuarios.stream().filter(u -> u.getId() == id).findFirst().get();
		usuarios.remove(user.getId());
	}

	@Override
	public Usuario login(String email, String password) {
		Usuario usuarioLogeado = usuarios.stream().filter(u -> u.getEmail().equals(email) && u.getContraseña().equals(password)).findFirst().get();
		if (usuarioLogeado.getId() != 0) {
			usuarioLogeado.setLogeado(true);
		}
		return usuarioLogeado;
	}

	@Override
	public boolean isLoggedIn(int id) {
		boolean logeado = false;
		logeado = usuarios.stream().filter(u -> u.getId() == id).findFirst().get().isLogeado();
		return logeado;
	}

}

package repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
		System.out.println(ID_USUARIO);
		if (usuario.getId() == 0) {
			System.out.println("id Usuario entrante" + usuario.getId());
			ID_USUARIO++;
			usuario.setId(ID_USUARIO);
			usuarios.add(usuario);
			usuarioGuardado = usuarios.stream().filter(u -> u.getId() == ID_USUARIO).findFirst().get();
		} else {
			System.out.println("id Usuario que no es 0 " + usuario.getId());
			usuarios.remove(usuario.getId());
			usuarios.add(usuario.getId(), usuario);
			usuarioGuardado = usuarios.stream().filter(u -> u.getId() == usuario.getId()).findFirst().get();
		}
		System.out.println(ID_USUARIO);
		return usuarioGuardado;
	}

	@Override
	public void eliminarPorId(int id) {
		Usuario user = usuarios.stream().filter(u -> u.getId() == id).findFirst().get();
		usuarios.remove(user.getId());
	}

	@Override
	public Usuario login(String email, String password) throws RuntimeException {
		Usuario usuarioLogeado = null;
		Optional<Usuario> findFirst = usuarios.stream().filter(u -> u.getEmail().equals(email) && u.getContraseña().equals(password)).findFirst();
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
		logeado = usuarios.stream().filter(u -> u.getId() == id).findFirst().get().isLogeado();
		return logeado;
	}

}

package repositorio;

import modelo.Usuario;

public interface UsuarioRepositorio {

	Usuario login(String email, String password);

	Usuario buscarPorId(int id);

	Usuario buscarPorNombre(String nombre, String apellido);

	Usuario guardar(Usuario usuario);

	void eliminarPorId(int id);

	boolean isLoggedIn(int id);
}

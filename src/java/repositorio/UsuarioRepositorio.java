package repositorio;

import modelo.User;

public interface UsuarioRepositorio {

	User login(String email, String password);

	User buscarPorId(int id);

	User buscarPorNombre(String nombre, String apellido);

	User guardar(User usuario);

	void eliminarPorId(int id);

	boolean isLoggedIn(int id);
}

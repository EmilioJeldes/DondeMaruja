package repository;

import java.util.Optional;
import model.User;

public class UserRepositoryImpl implements UserRepository {

	public static int ID_USUARIO = 0;

	public UserRepositoryImpl() {
	}

	@Override
	public Optional<User> findByName(String nombre, String apellido) {
		return utilities.Utilities.usuarios.stream().filter(u -> u.getName().equals(nombre) && u.getLastName().equals(apellido)).findFirst();
	}

	@Override
	public void deleteById(Integer id) {
		Optional<User> optionalUser = utilities.Utilities.usuarios.stream().filter(u -> u.getId() == id).findFirst();
		if (optionalUser.isPresent()) {
			utilities.Utilities.usuarios.remove(optionalUser.get().getId());
		}
	}

	@Override
	public User login(String email, String password) throws RuntimeException {
		User usuarioLogeado = null;
		Optional<User> findFirst = utilities.Utilities.usuarios.stream().filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password)).findFirst();
		if (findFirst.isPresent()) {
			usuarioLogeado = findFirst.get();
		} else {
			throw new RuntimeException("Usuario y contraseña incorrectos");
		}

		return usuarioLogeado;
	}

	@Override
	public boolean isLoggedIn(Integer id) {
		boolean logeado = false;
		Optional<User> user = utilities.Utilities.usuarios.stream().filter(u -> u.getId() == id).findFirst();
		if (user.isPresent()) {
			logeado = user.get().isLogged();
		}

		return logeado;
	}

	@Override
	public User save(User entity) throws RuntimeException {
		if (entity == null) {
			throw new RuntimeException("Entidad user null no se puede guardar");
		}
		User usuarioGuardado = null;
		if (entity.getId() == 0) {
			ID_USUARIO++;
			entity.setId(ID_USUARIO);
			utilities.Utilities.usuarios.add(entity);
			usuarioGuardado = utilities.Utilities.usuarios.stream().filter(u -> u.getId() == ID_USUARIO).findFirst().get();
		} else {
			User get = utilities.Utilities.usuarios.stream().filter(u -> u.getId() == entity.getId()).findFirst().get();
			utilities.Utilities.usuarios.remove(get);
			utilities.Utilities.usuarios.add(entity);
			usuarioGuardado = utilities.Utilities.usuarios.stream().filter(u -> u.getId() == entity.getId()).findFirst().get();
		}
		return usuarioGuardado;
	}

	@Override
	public Optional<User> findById(Integer id) {
		return utilities.Utilities.usuarios.stream().filter(u -> u.getId() == id).findFirst();
	}

	@Override
	public Iterable<User> findAll() {
		return utilities.Utilities.usuarios;
	}

	@Override
	public void delete(User entity) {
		if (entity == null) {
			throw new RuntimeException("No se puede eliminar user null");
		}
		utilities.Utilities.usuarios.remove(entity);
	}

}

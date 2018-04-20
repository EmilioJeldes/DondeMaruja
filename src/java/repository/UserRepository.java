package repository;

import java.util.Optional;
import model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User login(String email, String password);

	Optional<User> findByName(String nombre, String apellido);

	boolean isLoggedIn(Integer id);
}

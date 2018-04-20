package service;

import command.UserCommand;
import converter.RequestToUserCommand;
import converter.UserCommandToUser;
import converter.UserToUserCommand;
import javax.servlet.http.HttpServletRequest;
import model.User;
import repository.UserRepositoryImpl;
import repository.UserRepository;

public class UserServiceImpl implements UserService {

	UserRepository userRepository = new UserRepositoryImpl();
	RequestToUserCommand requestToUserCommand = new RequestToUserCommand();
	UserCommandToUser userCommandToUser = new UserCommandToUser();
	UserToUserCommand userToUserCommand = new UserToUserCommand();

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
			logeado = userRepository.isLoggedIn(intId);
		}
		return logeado;
	}

	@Override
	public User iniciarSesion(String email, String contraseña) {
		User usr = userRepository.login(email, contraseña);
		return usr;
	}

	@Override
	public UserCommand registrarUsuario(HttpServletRequest source) {
		UserCommand command = requestToUserCommand.convert(source);
		User user = userCommandToUser.convert(command);
		User savedUser = userRepository.save(user);
		return userToUserCommand.convert(savedUser);
	}

}

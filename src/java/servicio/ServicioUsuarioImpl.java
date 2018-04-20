package servicio;

import command.UserCommand;
import converter.RequestToUserCommand;
import converter.UserCommandToUser;
import converter.UserToUserCommand;
import javax.servlet.http.HttpServletRequest;
import modelo.User;
import repositorio.UsuarioRepositorio;
import repositorio.UsuarioRepositorioImpl;

public class ServicioUsuarioImpl implements ServicioUsuario {

	UsuarioRepositorio userRepository = new UsuarioRepositorioImpl();
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
		User savedUser = userRepository.guardar(user);
		return userToUserCommand.convert(savedUser);
	}

}

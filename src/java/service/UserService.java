package service;

import command.UserCommand;
import javax.servlet.http.HttpServletRequest;
import model.User;

public interface UserService {

	boolean isLoggedIn(String id);

	User iniciarSesion(String email, String contraseña);

	UserCommand registrarUsuario(HttpServletRequest source);
}

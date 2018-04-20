package servicio;

import command.UserCommand;
import javax.servlet.http.HttpServletRequest;
import modelo.User;

public interface ServicioUsuario {

	boolean isLoggedIn(String id);

	User iniciarSesion(String email, String contraseña);

	UserCommand registrarUsuario(HttpServletRequest source);
}

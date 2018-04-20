package converter;

import command.UserCommand;
import javax.servlet.http.HttpServletRequest;

public class RequestToUserCommand implements Converter<HttpServletRequest, UserCommand> {

	@Override
	public UserCommand convert(HttpServletRequest source) throws RuntimeException {

		if (source == null) {
			return null;
		}

		UserCommand userCommand = new UserCommand();
		userCommand.setNombre(source.getParameter("nombre"));
		userCommand.setApellido(source.getParameter("apellido"));
		userCommand.setRut(Integer.parseInt(source.getParameter("rut")));
		userCommand.setEdad(Integer.parseInt(source.getParameter("edad")));
		userCommand.setEstadoCivil(source.getParameter("estadocivil"));
		userCommand.setEmail(source.getParameter("email"));
		userCommand.setTelefono(Integer.parseInt(source.getParameter("telefono")));

		String pass1 = source.getParameter("pass1");
		String pass2 = source.getParameter("pass2");

		if (pass1.trim().equals(pass2.trim())) {
			userCommand.setContraseña(pass1);
		} else {
			throw new RuntimeException("Contraseñas no coinciden");
		}

		return userCommand;
	}

}

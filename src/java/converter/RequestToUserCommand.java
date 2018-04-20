package converter;

import command.UserCommand;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
		userCommand.setTelefono(Long.parseLong(source.getParameter("telefono")));

		String fechaStr = source.getParameter("fecha");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = null;

		try {
			fecha = sdf.parse(fechaStr);
		} catch (ParseException ex) {
			Logger.getLogger(RequestToUserCommand.class.getName()).log(Level.SEVERE, null, ex);
		}

		userCommand.setFechaNacimiento(fecha);

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

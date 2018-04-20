package converter;

import command.UserCommand;
import modelo.User;

public class UserToUserCommand implements Converter<User, UserCommand> {

	@Override
	public UserCommand convert(User source) {

		if (source == null) {
			return null;
		}

		UserCommand command = new UserCommand();
		command.setApellido(source.getApellido());
		command.setContraseña(source.getContraseña());
		command.setEdad(source.getEdad());
		command.setEmail(source.getEmail());
		command.setEstadoCivil(source.getEstadoCivil());
		command.setFechaNacimiento(source.getFechaNacimiento());
		command.setId(source.getId());
		command.setLogeado(source.isLogeado());
		command.setNombre(source.getNombre());
		command.setRut(source.getRut());
		command.setTelefono(source.getTelefono());

		return command;
	}

}

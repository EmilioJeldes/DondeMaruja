package converter;

import command.UserCommand;
import model.User;

public class UserToUserCommand implements Converter<User, UserCommand> {

	@Override
	public UserCommand convert(User source) {

		if (source == null) {
			return null;
		}

		UserCommand command = new UserCommand();
		command.setApellido(source.getLastName());
		command.setContraseña(source.getPassword());
		command.setEdad(source.getAge());
		command.setEmail(source.getEmail());
		command.setEstadoCivil(source.getCivilStatus());
		command.setFechaNacimiento(source.getBirthDate());
		command.setId(source.getId());
		command.setLogeado(source.isLogged());
		command.setNombre(source.getName());
		command.setRut(source.getRut());
		command.setTelefono(source.getPhoneNumber());

		return command;
	}

}

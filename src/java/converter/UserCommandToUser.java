package converter;

import command.UserCommand;
import modelo.User;

public class UserCommandToUser implements Converter<UserCommand, User> {

	@Override
	public User convert(UserCommand source) {
		if (source == null) {
			return null;
		}

		User user = new User();
		user.setApellido(source.getApellido());
		user.setContraseña(source.getContraseña());
		user.setEdad(source.getEdad());
		user.setEmail(source.getEmail());
		user.setEstadoCivil(source.getEmail());
		user.setFechaNacimiento(source.getFechaNacimiento());
		user.setId(source.getId());
		user.setLogeado(source.isLogeado());
		user.setNombre(source.getNombre());
		user.setRut(source.getRut());
		user.setTelefono(source.getTelefono());
		return user;
	}

}

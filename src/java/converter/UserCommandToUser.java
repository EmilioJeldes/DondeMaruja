package converter;

import command.UserCommand;
import model.User;

public class UserCommandToUser implements Converter<UserCommand, User> {

	@Override
	public User convert(UserCommand source) {
		if (source == null) {
			return null;
		}

		User user = new User();
		user.setLastName(source.getApellido());
		user.setPassword(source.getContraseña());
		user.setAge(source.getEdad());
		user.setEmail(source.getEmail());
		user.setCivilStatus(source.getEmail());
		user.setBirthDate(source.getFechaNacimiento());
		user.setId(source.getId());
		user.setLogged(source.isLogeado());
		user.setName(source.getNombre());
		user.setRut(source.getRut());
		user.setPhoneNumber(source.getTelefono());
		return user;
	}

}

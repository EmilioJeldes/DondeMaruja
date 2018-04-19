package servicio;

import modelo.Usuario;

public interface ServicioUsuario {

	boolean isLoggedIn(String id);

	Usuario iniciarSesion(String email, String contraseña);
}

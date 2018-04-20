package utilidades;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.User;

public class Utilidades {

	static final Utilidades instancia = new Utilidades();
	public static List<User> usuarios = new ArrayList<>();

	public Utilidades() {
	}

	public static Utilidades getInstancia() {
		return instancia;
	}

	public void irAPagina(HttpServletResponse response, HttpServletRequest request, ServletContext context, String url) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = context.getRequestDispatcher(url);
		requestDispatcher.forward(request, response);
	}

}

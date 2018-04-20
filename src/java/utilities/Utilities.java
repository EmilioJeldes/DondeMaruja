package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

public class Utilities {

	static final Utilities instancia = new Utilities();
	public static List<User> usuarios = new ArrayList<>();

	public Utilities() {
	}

	public static Utilities getInstancia() {
		return instancia;
	}

	public void irAPagina(HttpServletResponse response, HttpServletRequest request, ServletContext context, String url) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = context.getRequestDispatcher(url);
		requestDispatcher.forward(request, response);
	}

}

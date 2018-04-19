package bootstrap;

import modelo.Usuario;
import repositorio.UsuarioRepositorio;
import repositorio.UsuarioRepositorioImpl;

public class InsertsBootstrap {

	Usuario usuario = new Usuario();
	UsuarioRepositorio repositorio = new UsuarioRepositorioImpl();

	public InsertsBootstrap() {

	}

	public static void main(String[] args) {

		InsertsBootstrap bootstrap = new InsertsBootstrap();
	}
}

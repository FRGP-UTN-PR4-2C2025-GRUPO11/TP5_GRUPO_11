package negocioImpl;

import java.util.List;

import entidad.Usuario;
import negocio.UsuarioNeg;
import dao.IUsuarioDao;
import daoImpl.UsuarioDaoImpl;

public class UsuarioNegImpl implements UsuarioNeg {

	@Override
	public Usuario obtenerUno(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> ObtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarUno(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean verificarUsuario(Usuario usuario) {
		UsuarioDaoImpl dao = new UsuarioDaoImpl();
		return dao.verificarUsuario(usuario);
	}
}

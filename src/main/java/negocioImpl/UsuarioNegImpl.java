package negocioImpl;

import java.util.List;

import entidad.Usuario;
import dao.IUsuarioDao;
import daoImpl.UsuarioDaoImpl;

public class UsuarioNegImpl implements IUsuarioDao {

	@Override
	public List<Usuario> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerUno(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean verificarUsuario(Usuario usuario) {
		UsuarioDaoImpl dao = new UsuarioDaoImpl();
		return dao.verificarUsuario(usuario);
	}

}

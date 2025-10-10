package negocioImpl;

import daoImpl.UsuarioDaoImpl;
import entidad.Usuario;
import negocio.UsuarioNeg;

public class UsuarioNegImpl implements UsuarioNeg {

	@Override
	public Boolean verificarUsuario(Usuario usuario) {
		UsuarioDaoImpl dao = new UsuarioDaoImpl();
		return dao.verificarUsuario(usuario);
	}
}

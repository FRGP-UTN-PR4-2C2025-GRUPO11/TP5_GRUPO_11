package negocio;

import java.util.List;

import entidad.Usuario;

public interface UsuarioNeg {
	public List<Usuario> ObtenerTodos();
	public Usuario obtenerUno(int id_usuario);
	public boolean agregarUno(Usuario usuario);
	public Boolean verificarUsuario(Usuario usuario);
}

package dao;

import java.util.List;

import entidad.Usuario;

public interface UsuarioDao {
	public List<Usuario> obtenerTodos();
	public Usuario obtenerUno(int id);
	public boolean insertar(Usuario usuario);

}

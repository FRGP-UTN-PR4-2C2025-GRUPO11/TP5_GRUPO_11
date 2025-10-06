package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.IUsuarioDao;
import entidad.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao {

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
		boolean exists = false;

		String query = "SELECT * FROM usuarios where usuario = ? AND contrasena = ?";

		try (Connection conn = new Conexion().getConection()) {

			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, usuario.getNombreUsuario());
			preparedStatement.setString(2, usuario.getContrasena());

			ResultSet resulSet = preparedStatement.executeQuery();

			if (resulSet.next())
				exists = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return exists;
	}

}

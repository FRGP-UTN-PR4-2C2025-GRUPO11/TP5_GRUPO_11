package daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import dao.IClienteDao;
import entidad.Cliente;

public class ClienteDaoImpl implements IClienteDao{

	@Override
	public ArrayList<Cliente> obtenerTodos() 
	{
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
	    Conexion cn = new Conexion();
	    try 
	    {
	        cn.getConnection();
	        ResultSet rs = cn.query("SELECT * FROM clientes");

	        while (rs.next()) {
	            Cliente cliente = new Cliente();
	            cliente.setDni(rs.getString("dni"));
	            cliente.setCuil(rs.getString("cuil"));
	            cliente.setNombre(rs.getString("nombre"));
	            cliente.setApellido(rs.getString("apellido"));
	            cliente.setSexo(rs.getString("sexo"));
	            cliente.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
	            cliente.setDireccion(rs.getString("direccion"));
	            cliente.setNacionalidad(rs.getString("nacionalidad"));
	            cliente.setLocalidad(rs.getString("localidad"));
	            cliente.setProvincia(rs.getString("provincia"));
	            cliente.setCorreo_electronico(rs.getString("correo_electronico"));
	            cliente.setTelefono(rs.getString("telefono"));
	            lista.add(cliente);
	        }

	    }
	    catch (SQLException e) 
	    {
	        e.printStackTrace();
	    } 
	    finally 
	    {
	        cn.close();
	    }

	    return lista;
	}

	@Override
	public Cliente obtenerUno(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int agregarUno(Cliente cliente) {
		Conexion cn = new Conexion();
		cn.getConnection();
		int response = -1;
		try {
			String query = "INSERT INTO clientes "
					+ "(dni, cuil, nombre, apellido, sexo, fecha_nacimiento, direccion, nacionalidad, localidad, provincia, correo_electronico, telefono) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = cn.getConnection().prepareStatement(query);
			ps.setString(1, cliente.getDni());
			ps.setString(2, cliente.getCuil());
			ps.setString(3, cliente.getNombre());
			ps.setString(4, cliente.getApellido());
			ps.setString(5, cliente.getSexo());
			ps.setString(6, cliente.getFecha_nacimiento());
			ps.setString(7, cliente.getDireccion());
			ps.setString(8, cliente.getNacionalidad());
			ps.setString(9, cliente.getLocalidad());
			ps.setString(10, cliente.getProvincia());
			ps.setString(11, cliente.getCorreo_electronico());
			ps.setString(12, cliente.getTelefono());
			response = ps.executeUpdate();
			System.out.println(response);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return 0;
		}
		finally {
			cn.close();
		}
		return response;
	}

}

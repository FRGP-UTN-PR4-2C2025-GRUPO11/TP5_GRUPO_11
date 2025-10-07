package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String password = "root";
	private String nameDataBase = "sistema_clientes?useSSL=false&serverTimezone=UTC";

	protected Connection connection;

	public Conexion ()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
	    try {
	        if (connection != null && !connection.isClosed()) {
	            return connection;
	        }
	        connection = DriverManager.getConnection(host + nameDataBase, user, password);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return connection;
	}
	
	public ResultSet query(String query)
	{
		try
		{
			Statement st = connection.createStatement();
			return st.executeQuery(query);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean execute(String query)
	{
		Statement st;
		boolean save = true;
		try {
			st = connection.createStatement();
		    st.executeUpdate(query);
		}
		catch(SQLException e)
		{
			save = false;
			e.printStackTrace();
		}
		return save;
	}
	
	public boolean close() {
	    try {
	        if (connection != null && !connection.isClosed()) {
	            connection.close();
	        }
	        return true;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
}

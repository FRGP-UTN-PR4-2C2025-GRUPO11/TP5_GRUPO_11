package entidad;

public class Usuario {
	private int id_usuario;
	private String usuario;
	private String contrasena;

	public Usuario() {}

	public Usuario(String nombreUsuario, String contrasena) {
		this.usuario = nombreUsuario;
		this.contrasena = contrasena;
	}

	public int getId() {
		return id_usuario;
	}

	public void setId(int id) {
		this.id_usuario = id;
	}

	public String getNombreUsuario() {
		return usuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.usuario = nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id_usuario + ", nombreUsuario=" + usuario + ", contrasena=" + contrasena
		    + "]";
	}

}

package negocio;

import java.util.List;

import entidad.Cliente;

public interface ClienteNeg {
	public List<Cliente> ObtenerTodos();
	public Cliente obtenerUno(int id);
	public int agregarUno(Cliente cliente);
}

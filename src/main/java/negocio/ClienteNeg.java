package negocio;

import java.util.ArrayList;
import java.util.List;

import entidad.Cliente;

public interface ClienteNeg {
	public ArrayList<Cliente> ObtenerTodos();
	public Cliente obtenerUno(int id);
	public int agregarUno(Cliente cliente);
}

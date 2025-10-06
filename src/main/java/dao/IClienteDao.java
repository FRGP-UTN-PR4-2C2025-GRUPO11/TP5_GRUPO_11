package dao;

import java.util.List;

import entidad.Cliente;

public interface IClienteDao {

	public List<Cliente> obtenerTodos();
	public Cliente obtenerUno(int id);
	public boolean agregarUno(Cliente cliente);
	
	
}

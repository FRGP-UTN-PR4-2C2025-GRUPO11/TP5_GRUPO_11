package dao;

import java.util.List;

import entidad.Cliente;

public interface IClienteDao {

	public List<Cliente> obtenerTodos();
	public Cliente obtenerUno(int id);
	public int agregarUno(Cliente cliente);


}

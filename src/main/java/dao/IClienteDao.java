package dao;

import java.util.ArrayList;
import java.util.List;

import entidad.Cliente;

public interface IClienteDao {

	public ArrayList<Cliente> obtenerTodos();
	public Cliente obtenerUno(int id);
	public int agregarUno(Cliente cliente);


}

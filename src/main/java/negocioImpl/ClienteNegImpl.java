package negocioImpl;

import java.util.List;

import daoImpl.ClienteDaoImpl;
import entidad.Cliente;
import negocio.ClienteNeg;

public class ClienteNegImpl implements ClienteNeg {

	ClienteDaoImpl cd = new ClienteDaoImpl();
	
	@Override
	public List<Cliente> ObtenerTodos() {
		return cd.obtenerTodos();
	}

	@Override
	public Cliente obtenerUno(int id) {
		return cd.obtenerUno(id);
	}

	@Override
	public int agregarUno(Cliente cliente) {
		return cd.agregarUno(cliente);
	}

}

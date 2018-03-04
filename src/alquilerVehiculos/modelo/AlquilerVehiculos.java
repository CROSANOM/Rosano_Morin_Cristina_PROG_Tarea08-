package alquilerVehiculos.modelo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import alquilerVehiculos.mvc.modelo.dao.Alquileres;
import alquilerVehiculos.mvc.modelo.dao.Clientes;
import alquilerVehiculos.mvc.modelo.dao.Vehiculos;
import alquilerVehiculos.mvc.modelo.dominio.Alquiler;
import alquilerVehiculos.mvc.modelo.dominio.Cliente;
import alquilerVehiculos.mvc.modelo.dominio.DireccionPostal;
import alquilerVehiculos.mvc.modelo.dominio.vehiculo.DatosTecnicosVehiculo;
import alquilerVehiculos.mvc.modelo.dominio.vehiculo.TipoVehiculo;
import alquilerVehiculos.mvc.modelo.dominio.vehiculo.Vehiculo;

/**
 * @author crosanom
 *
 */

public class AlquilerVehiculos implements IModeloAlquilerVehiculos {
	// atributos
	private Clientes clientes;
	private Vehiculos vehiculos;
	private Alquileres alquileres;

	// constructor

	public AlquilerVehiculos() {
		clientes = new Clientes();
		vehiculos = new Vehiculos();
		alquileres = new Alquileres();
	}

	// Metodos getters de atributos de AlquilerVehiculos

	/*
	 * (non-Javadoc)
	 * 
	 * @see alquilerVehiculos.modelo.IModeloAlquilerVehiculos#getClientes()
	 */

	@Override
	public Clientes getClientes() {
		return clientes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see alquilerVehiculos.modelo.IModeloAlquilerVehiculos#getVehiculos()
	 */
	@Override
	public Vehiculos getVehiculos() {
		return vehiculos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see alquilerVehiculos.modelo.IModeloAlquilerVehiculos#getAlquileres()
	 */
	@Override
	public Alquileres getAlquileres() {
		return alquileres;
	}

	// modificar Obtener Clientes
	public List<Cliente> obtenerClientes() {

		return clientes.getClientes();
	}

	// modificar Obtener Vehiculos

	public List<Vehiculo> obtenerVehiculos() {

		return vehiculos.getVehiculos();

	}
	
	// modificar Obtener Alquileres 
	
	@Override
	
	public List<Alquiler> obtenerAlquileres() {
		return obtenerAlquileresAbiertos();
	}

	@Override

	public List<Alquiler> obtenerAlquileresAbiertos() {

		return alquileres.getAlquileres();

	}
	
	@Override
	public void anadirCliente(Cliente cliente) {
		clientes.anadirCliente(cliente);
	}

	// acceso para leer - escribir clientes, vehiculos, alquileres

	public void leerClientes() {
		clientes.leerClientes();
	}

	public void escribirClientes() {
		clientes.escribirClientes();
	}

	public void leerVehiculos() {
		vehiculos.leerVehiculos();
	}

	public void escribirVehiculos() {
		vehiculos.escribirVehiculos();
	}

	public void leerAlquileres() {
		alquileres.leerAlquileres();
	}

	public void escribirAlquileres() {
		alquileres.escribirAlquileres();
	}

	@Override
	public void borrarCliente(String dni) {
		clientes.borrarCliente(dni);
	}

	@Override
	public Cliente buscarCliente(String dni) {
		return clientes.buscarCliente(dni);
	}

	
	@Override
	public void anadirVehiculo(Vehiculo vehiculo, TipoVehiculo tipoVehiculo) {
		vehiculos.anadirVehiculo(vehiculo, tipoVehiculo);
	}


	@Override
	public void borrarVehiculo(String matricula) {
		vehiculos.borrarVehiculo(matricula);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * alquilerVehiculos.modelo.IModeloAlquilerVehiculos#buscarVehiculo(java.lang.
	 * String)
	 */

	@Override
	public Vehiculo buscarVehiculo(String matricula) {
		return vehiculos.buscarVehiculo(matricula);
	}

	// metodos para los alquileres

	/*
	 * (non-Javadoc)
	 * 
	 * @see alquilerVehiculos.modelo.IModeloAlquilerVehiculos#abrirAlquiler(
	 * alquilerVehiculos.mvc.modelo.dominio.Cliente,
	 * alquilerVehiculos.mvc.modelo.dominio.vehiculo.Vehiculo)
	 */
	@Override
	public void abrirAlquiler(Cliente cliente, Vehiculo vehiculo) {
		alquileres.abrirAlquiler(cliente, vehiculo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see alquilerVehiculos.modelo.IModeloAlquilerVehiculos#cerrarAlquiler(
	 * alquilerVehiculos.mvc.modelo.dominio.vehiculo.Vehiculo)
	 */
	@Override
	public void cerrarAlquiler(Vehiculo vehiculo) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see alquilerVehiculos.modelo.IModeloAlquilerVehiculos#toString()
	 */
	@Override
	public String toString() {
		return "AlquilerVehiculos [clientes=" + clientes + ", vehiculos=" + vehiculos + ", alquileres=" + alquileres
				+ "]";
	}

	@Override
	public List<Cliente> ObtenerCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> ObtenerVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	




}

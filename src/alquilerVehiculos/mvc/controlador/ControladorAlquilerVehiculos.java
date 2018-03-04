package alquilerVehiculos.mvc.controlador;

import java.util.List;

import alquilerVehiculos.modelo.IModeloAlquilerVehiculos;
import alquilerVehiculos.mvc.modelo.dominio.Alquiler;
import alquilerVehiculos.mvc.modelo.dominio.Cliente;
import alquilerVehiculos.mvc.modelo.dominio.vehiculo.TipoVehiculo;
import alquilerVehiculos.mvc.modelo.dominio.vehiculo.Vehiculo;
import alquilerVehiculos.mvc.vista.IUTextualVista;

public class ControladorAlquilerVehiculos implements IControladorAlquilerVehiculo {

	// atributos
	IModeloAlquilerVehiculos modelo;
	IUTextualVista vista;

	// constructor
	
	/**
	 * @param modelo
	 * @param vista
	 */

	public ControladorAlquilerVehiculos(IModeloAlquilerVehiculos modelo, IUTextualVista vista) {
		this.vista = vista;
		this.modelo = modelo;
		vista.setControlador(this);
	}

	// metodos de controlador

	@Override
	public void comenzar() {

		// modelo.anadirDatosPrueba();
		modelo.leerClientes();
		modelo.leerVehiculos();
		modelo.leerAlquileres();
		vista.comenzar();
		System.out.println("HastaPronto, gracias :-D");
	}

	public void salir() {
		modelo.escribirClientes();
		modelo.escribirVehiculos();
		modelo.escribirAlquileres();
	}

	@Override
	public void anadirCliente(Cliente cliente) {
		modelo.anadirCliente(cliente);
	}

	@Override
	public void borrarCliente(String dni) {
		modelo.borrarCliente(dni);
	}

	@Override
	public Cliente buscarCliente(String dni) {
		return modelo.buscarCliente(dni);
	}

	// modificar crear cliente
	public List<Cliente> obtenerClientes() {
		return modelo.obtenerClientes();
	}

	@Override
	public void anadirVehiculo(Vehiculo vehiculo, TipoVehiculo tipoVehiculo) {
		modelo.anadirVehiculo(vehiculo, tipoVehiculo);
	}

	@Override
	public void borrarVehiculo(String matricula) {
		modelo.borrarVehiculo(matricula);
	}

	@Override
	public Vehiculo buscarVehiculo(String matricula) {
		return modelo.buscarVehiculo(matricula);
	}

	// modificado obtenerVehiculos
	public List<Vehiculo> obtenerVehiculos() {
		return modelo.obtenerVehiculos();
	}

	@Override
	public void abrirAlquiler(Cliente cliente, Vehiculo vehiculo) {
		modelo.abrirAlquiler(cliente, vehiculo);

	}

	@Override
	public void cerrarAlquiler(Vehiculo vehiculo) {
		modelo.cerrarAlquiler(vehiculo);
	}

	public List<Alquiler> obtenerAlquileresAbiertos() {
		return modelo.obtenerAlquileresAbiertos();
	}

	@Override
	public Object obtenerVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}

}

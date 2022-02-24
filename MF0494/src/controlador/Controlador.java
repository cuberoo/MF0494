/**
 * 
 */
package controlador;

import java.util.ArrayList;

import dao.InfractoresDAO;
import dao.SancionDAO;
import modelo.Infractor;
import modelo.Sancion;
import vista.DialogoInsertarInfractor;
import vista.VentanaMostrarInfractores;
import vista.VentanaPpal;

/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema
	private VentanaPpal ventanaPpal;
	private VentanaMostrarInfractores mostrarInfracores;
	private DialogoInsertarInfractor dialogoInsertarInfractor;

	
	// Objetos DAO o CRUD de la base de datos
	private SancionDAO sancionDAO;
	private InfractoresDAO InfractoresDAO;

	
	public Controlador() {
		// Creamos las ventanas de la aplicación
		ventanaPpal = new VentanaPpal();
		dialogoInsertarInfractor = new DialogoInsertarInfractor();
		mostrarInfracores = new VentanaMostrarInfractores();
		
		
		// Dando acceso al controlador desde las vistas
		ventanaPpal.setControlador(this);
		dialogoInsertarInfractor.setControlador(this);
		mostrarInfracores.setControlador(this);
		
		
		// Creamos los objetos DAO
		sancionDAO = new SancionDAO();
		InfractoresDAO = new InfractoresDAO();
	}
	
	public void inciarPrograma() {
		ventanaPpal.setVisible(true);
	}

	public void mostrarInsertarInfractores () {
		ArrayList<Sancion> listaSanciones = new ArrayList<Sancion>();
		listaSanciones = sancionDAO.obtenerSanciones();
		dialogoInsertarInfractor.setListaSanciones(listaSanciones);
		dialogoInsertarInfractor.setVisible(true);
	}
	
	public void mostrarInfractores() {
		ArrayList<Infractor> lista = InfractoresDAO.obtenerInfractores();
		mostrarInfracores.setListaInfractores(lista);
		mostrarInfracores.setVisible(true);
	}
	
	
}

package controlador.ajedrez;

import ajedrez.modelo.Ajedrez;
import ajedrez.modelo.Usuario;
import vista.ajedrez.IVista;
import vistaconsolaswing.vista.ajedrez.VistaConsolaSwing;

public class Controlador {
	private Ajedrez modelo;
	private Usuario usuario;
	private IVista vista;
	
	public Controlador(Ajedrez modelo) {
		this.modelo=modelo;
	}
	public void setVista(IVista vista) {
		this.vista=vista;
	}

}

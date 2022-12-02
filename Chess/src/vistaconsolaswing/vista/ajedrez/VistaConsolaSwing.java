package vistaconsolaswing.vista.ajedrez;

import controlador.ajedrez.Controlador;
import vista.ajedrez.IVista;

public class VistaConsolaSwing implements IVista{
	private Controlador controlador;
	private VistaPrincipal vPrincipal;
	
	
	
	public VistaConsolaSwing(Controlador controlador) {
		this.controlador=controlador;
		this.controlador.setVista(this);
		this.vPrincipal= new VistaPrincipal();

	}

	@Override
	public void iniciar() {
		this.vPrincipal.setVisible(true);
	}}

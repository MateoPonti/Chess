package main;

import ajedrez.modelo.Ajedrez;
import controlador.ajedrez.Controlador;
import vista.ajedrez.IVista;
import vistaconsolaswing.vista.ajedrez.VistaConsolaSwing;

public class Main {

	public static void main(String[] args) {
		Ajedrez modelo= new Ajedrez();
		
		Controlador controlador1 = new Controlador(modelo); 
		IVista vista1= new VistaConsolaSwing(controlador1);
		vista1.iniciar();
		
		
		Controlador controlador2= new Controlador(modelo);
		IVista vista2= new VistaConsolaSwing(controlador1);
		vista2.iniciar();
		

	}

}

package pieza.modelo;

public class Pieza {
  private Nombre nombre;
  private Equipo equipo;
  private int x;
  private int y;
  
	public Pieza(Nombre nombre,Equipo equipo, int[] posicionInicial) {
	  this.nombre=nombre;
	  this.equipo=equipo;
	  this.x=posicionInicial[0];
	  this.y=posicionInicial[1];
	  
  	}
	
	public void moverse(int[] posicionDesplazar) {
		this.x=posicionDesplazar[0];
		this.y=posicionDesplazar[1];
	}
	
	public int[] getPosicion() {
		int[] posicion = new int[2];
		posicion[0]=x;
		posicion[1]=y;
		return posicion;
	}
	
}

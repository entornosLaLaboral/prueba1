public class Coche extends Vehiculo {
	private int numPuertas;

	public Coche(String matricula, String color, int numRuedas, int cilindrada, int potencia, int numPuertas) {
		super(matricula, color, numRuedas, cilindrada, potencia);
		this.numPuertas = numPuertas;
		
	}

	public Coche(String matricula, String color, int numPuertas) {
		super(matricula, color);
		this.numPuertas = numPuertas;
		numRuedas = 4;
	}

	public int getNumPuertas() {
		return numPuertas;
	}
	
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

//	Sobreescritura
	public String toString() {
		return super.toString()+ " - Nº puertas: "+numPuertas;
	}
		
}

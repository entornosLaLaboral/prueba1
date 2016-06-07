public class GeneradorDePrimos {

	private static int dim;
	private static boolean[] esPrimo;
	private static int[] primos;

	public static int[] obtenerPrimos(int max) {
		if (max < 2) {
			return new int[0]; // vector vacío	
		} 
		else {
			dim = max + 1;
			esPrimo = new boolean[dim];	
			inicializarCandidatos();			
			eliminaMultiplos();			
			obtenerCandidatosNoEliminados();
			return primos;
		}
	}

	private static void obtenerCandidatosNoEliminados() {
		int i;
		int j;
		// ¿cuántos primos hay?
		int cuenta = 0;
		for (i = 0; i < dim; i++) {
			if (esPrimo[i])
				cuenta++;
		}

		primos = new int[cuenta];
		for (i = 0, j = 0; i < dim; i++) {
			if (esPrimo[i])
				primos[j++] = i;
		}
	}

	private static void eliminaMultiplos() {
		// eliminar los Múltiplos
		// la raiz cuadrada es el valor máximo que puede tener el menor
		// factor de un número no primo menor o igual que N
		for (int i = 2; i < (int) Math.sqrt(dim)+1; i++)
			if (esPrimo[i])
				// elimina los múltiplos de i
				for (int j = 2 * i; j < dim; j += i)
					esPrimo[j] = false;
	}

	private static void inicializarCandidatos() {
		int i;
		// inicializar Candidatos
		for (i = 0; i < dim; i++)
			esPrimo[i] = true;
		// eliminar el 0 y el 1, que no son primos
		esPrimo[0] = esPrimo[1] = false;
	}
}

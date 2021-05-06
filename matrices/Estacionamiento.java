package tp1.t1.matrices;

public class Estacionamiento {

	private static final String ERROR_ESTACIONAR = "Error: El espacio ya se encuentra ocupado, seleccione otro";
	private static final String EXITO_ESTACIONAR = "Correcto: El espacio se ocupó con éxito!";
	
	private boolean[][] espacios;

	public Estacionamiento(int pasillos, int posiciones) {
		this.espacios = new boolean[pasillos][posiciones];
		inicializarEstacionamiento();
	}

	private void inicializarEstacionamiento() {
		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
				espacios[i][j] = false;
			}
		}
	}

	public boolean estaOcupado(int pasillo, int posicion) {
		return espacios[pasillo][posicion];
	}

	public int cantidadDisponible() {
		int espaciosDisponibles = 0;
		for (int i = 0; i < espacios.length; i++) {
			for (int j = 0; j < espacios[i].length; j++) {
				if (!estaOcupado(i, j)) {
					espaciosDisponibles++;
				}
			}
		}
		return espaciosDisponibles;
	}
	
	public void ocuparEspacio(int pasillo, int posicion) {
		if(estaOcupado(pasillo-1, posicion-1)) {
			System.out.println(ERROR_ESTACIONAR);
		} else {
			espacios[pasillo-1][posicion-1] = true;
			System.out.println(EXITO_ESTACIONAR);
		}
	}
}

package tp1.t1.matrices;

public class EstacionamientoV2 {
	private Automovil[][] espacios;

	public EstacionamientoV2(int pasillos, int posiciones) {
		this.espacios = new Automovil[pasillos][posiciones];
	}

	public boolean estaOcupado(int pasillo, int posicion) {
		return espacios[pasillo][posicion] != null;
	}

	public int cantidadDisponible() {
		int espaciosDisponibles = 0;
		for (int pasillo = 0; pasillo < espacios.length; pasillo++) {
			for (int posicion = 0; posicion < espacios[pasillo].length; posicion++) {
				if (!estaOcupado(pasillo, posicion)) {
					espaciosDisponibles++;
				}
			}
		}
		return espaciosDisponibles;
	}

	public boolean ocuparEspacio(int pasillo, int posicion, Automovil auto) {
		boolean respuesta;
		if (estaOcupado(pasillo, posicion)) {
			respuesta = false;
			System.out.println("No se pudo estacionar en el espacio");
		} else {
			respuesta = true;
			espacios[pasillo][posicion] = auto;
		}
		return respuesta;
	}

	public float recaudarPasillo(int pasillo) {
		// Recorro todos los elementos de la primer dimension
		float recaudacion = 0;

		for (Automovil auto : espacios[pasillo]) {
			if (auto != null) {
				recaudacion += auto.obtenerTarifa();
			}
		}

		return recaudacion;
	}

	public float recaudarHoy() {
		float recaudacion = 0;
		for (int i = 0; i < espacios.length; i++) {
			recaudacion += recaudarPasillo(i);
		}
		return recaudacion;
	}

	public int cuantosAutosHayEnLaPosicion(int posicion) {
		// Recorro todos los elementos de la segunda dimension
		int autosEnLaPosicion = 0;

		for (int pasillo = 0; pasillo < espacios.length; pasillo++) {
			if (estaOcupado(pasillo, posicion)) {
				autosEnLaPosicion++;
			}
		}

		return autosEnLaPosicion;
	}
}

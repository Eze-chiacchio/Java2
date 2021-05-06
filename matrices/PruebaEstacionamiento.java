package tp1.t1.matrices;

public class PruebaEstacionamiento {
		
	public static void main(String[] args) {
		//1. Inicializar un estacionamiento de 10 pasillos con 30 espacios cada uno.
		Estacionamiento estacionamiento = new Estacionamiento(10, 30);

		// 2. Solicitar cuantos espacios disponibles hay (debe haber 300).
		System.out.println(estacionamiento.cantidadDisponible());
		
		// 3. Ocupar el espacio 1, 12, la consola debe verificar que fue exitoso.
		estacionamiento.ocuparEspacio(1, 12);
		
		// 4. Solicitar cuantos espacios disponibles hay (debe haber 299).
		System.out.println(estacionamiento.cantidadDisponible());
		
		// 5. Ocupar el espacio 1, 12, la consola debe mostrar un error.
		estacionamiento.ocuparEspacio(1, 12);
		
		// 6. Ocupar los siguientes espacios:
		estacionamiento.ocuparEspacio(1, 24);
		estacionamiento.ocuparEspacio(1, 16);
		estacionamiento.ocuparEspacio(3, 9);
		estacionamiento.ocuparEspacio(4, 14);
		estacionamiento.ocuparEspacio(5, 25);
		estacionamiento.ocuparEspacio(6,1);
		estacionamiento.ocuparEspacio(6, 6);
		estacionamiento.ocuparEspacio(6, 11);
		estacionamiento.ocuparEspacio(8, 12);
		estacionamiento.ocuparEspacio(9, 14);
		estacionamiento.ocuparEspacio(9, 19);
		estacionamiento.ocuparEspacio(10, 7);
		System.out.println(estacionamiento.cantidadDisponible());
	}
	

	

	

}

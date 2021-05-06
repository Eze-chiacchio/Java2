package tp1.t1.matrices;

public class PruebaEstacionamientoV2 {

	public static void main(String[] args) {
		EstacionamientoV2 estacionamiento = new EstacionamientoV2(10, 30);
		
		// 2. Solicitar cuantos espacios disponibles hay (debe haber 300).
		System.out.println("Hay " + estacionamiento.cantidadDisponible() + " espacios disponibles");
	}

}

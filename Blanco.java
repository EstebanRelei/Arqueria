public class Blanco{
	private Viento variacionPorViento;
	private Jugador variacionPorNivel;
	private double variacionTotal;
	private int puntuacion;

	public Blanco(){
		puntuacion = 0;
		variacionPorViento = new Viento();
		variacionPorNivel = new Jugador();
		//La línea siguiente es para usar unos datos de prueba porque aún no está la parte de dónde vienen los datos reales, lo que debería recibir realmente son las coordenadas en x y y.
		variacionTotal = variacionPorViento.aplicarViento(0.6, true) + variacionPorNivel.tiro(0.6); 
	}

	public int asignarPuntuacion(){
		if (variacionTotal > 0.4) {
			puntuacion = 15;
		}
		else{
			if (variacionTotal <= 0.4 && variacionTotal > 0.05) {
				puntuacion = 20;
			}
			else{
				puntuacion = 100;
				
			}
		}
		return puntuacion;
	}
    
}

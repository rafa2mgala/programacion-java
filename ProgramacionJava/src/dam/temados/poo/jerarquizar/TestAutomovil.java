package dam.temados.poo.jerarquizar;

public class TestAutomovil {

	public static void main(String[] args) {
		Rueda rueda1 = new Rueda();
		Rueda rueda2 = new Rueda();
		Rueda rueda3 = new Rueda();
		Rueda rueda4 = new Rueda();
		//automóvil 1 no tiene GPS
		Automovil automovil1 =
				new Automovil(rueda3, rueda2,
						rueda3, 4);
		//automóvil 2 tiene GPS
		//relación de dependencia
		Automovil automovil2 = new Automovil(rueda1, rueda2,
				rueda3, rueda4);
		Gps gps = new Gps();
		//relación de asociación (1:1)
		automovil2.setGps(gps);
	}

}

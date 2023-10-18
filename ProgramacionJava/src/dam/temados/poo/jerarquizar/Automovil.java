package dam.temados.poo.jerarquizar;

public class Automovil {
	private Rueda rueda1, rueda2, rueda3, rueda4;
	private Gps gps;
	//public Automovil([<tipo> <identificador1>...<tipo><identificadorN>])
	public Automovil(Rueda rueda1,
					Rueda rueda2,
					Rueda rueda3,
					int rueda4) {		
		this.rueda1 = rueda1;
		this.rueda2 = rueda2;
		this.rueda3 = rueda3;
		//this.rueda4 = rueda4;
	}
	public void setGps(Gps gps) {
		this.gps = gps;
	}
}

package dam.temacuatro.relaciones.agregacion;
/**
 * Ejemplo de relación de agregación entre las
 * clases Automovil y Navegador
 * @author Rafa
 * @version 1.0
 */
public class Automovil {
	private int contadorComponentesE;
	private Rueda[] ruedas;
	private ComponenteElectronico[] componentesElectronicos; //Agregación
	
	{
		this.componentesElectronicos = new ComponenteElectronico[10];
	}
	public void mover() {          
		System.out.println("El coche se mueve!");
	}
	public Automovil(ComponenteElectronico componenteElectronico) {
		this.componentesElectronicos[0] = componenteElectronico;
		this.contadorComponentesE++;
	}
	public int addComponenteElectronico(ComponenteElectronico componenteElectronico) {
		if(componenteElectronico==null) return this.contadorComponentesE;
		if(this.contadorComponentesE==10) return this.contadorComponentesE;
		this.componentesElectronicos[this.contadorComponentesE]=componenteElectronico;
		return ++this.contadorComponentesE;
	}
	public int delComponenteElectronico(ComponenteElectronico componenteElectronico) {
		
		return 0;
	}
}


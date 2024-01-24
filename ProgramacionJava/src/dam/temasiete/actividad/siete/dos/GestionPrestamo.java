package dam.temasiete.actividad.siete.dos;

import java.time.LocalDateTime;
/**
 * Gestión de préstamos para materiales del centro cultural
 * @author Rafa
 * @version 1.0
 */
public class GestionPrestamo {
	private Prestamo[] prestamos=null;
	/**
	 * Crea la gestión de préstamos a partir del número de materiales a prestar
	 * @param numMaterial Número de materiales a prestar
	 */
	public GestionPrestamo(int numMaterial) {
		if(numMaterial>0)
			this.prestamos = new Prestamo[numMaterial];
	}
	/**
	 * Agrega un nuevo prestamos a los préstamos existentes siempre que el cliente no tenga ya 5
	 * materiales prestados
	 * @param cliente Cliente que solicita el préstamo del material
	 * @param material Material que se solicita en el préstamo
	 * @return Si el cliente no tiene ya 5 materiales prestados devuelve true para indicar que el préstamo
	 * se ha registrado.
	 */
	public boolean nuevoPrestamo(LocalDateTime fechaFin,Cliente cliente, Material material) {
		int totalPrestamos=0;
		int i=0;
		//no se permiten más de 5 materiales prestados por cliente.
		//un material está prestado si no tiene fecha de fin de préstamo asignada
		while(i<this.prestamos.length && this.prestamos[i]!=null) {
			if(this.prestamos[i].getCliente().getDni().equals(cliente.getDni()))
				totalPrestamos++;
			i++;
		}
		if(totalPrestamos<5) {
			i=0;
			while(this.prestamos[i]!=null)
				i++;
			this.prestamos[i] = new Prestamo(fechaFin, cliente, material);
			return true;
		}
		return false;
	}
	public boolean devolverPrestamo(LocalDateTime fechaInicio, LocalDateTime fechaFin, 
			Cliente cliente, Material material) {
		int i=0;
		//no se permiten más de 5 materiales prestados por cliente.
		//un material está prestado si no tiene fecha de fin de préstamo asignada
		while(i<this.prestamos.length && this.prestamos[i]!=null) {
			if(this.prestamos[i].getCliente().equals(cliente)
					&& this.prestamos[i].getMaterial().equals(material)
					&& this.prestamos[i].getFechaInicio()==fechaInicio) {
				this.prestamos[i].setFechaFin(LocalDateTime.now());
				this.prestamos[i].setDevuelto(true);
				return true;
			}
			i++;
		}
		return false;
	}
}

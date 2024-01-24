package dam.temasiete.herencia.centrocultural;

import java.time.LocalDateTime;
/**
 * Préstamo de materiales: discos o libros
 * @author Rafa
 * @version 1.0
 */
public class Prestamo {
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private boolean devuelto = false;
	private Cliente cliente;
	private Material material;
	/**
	 * Constructor específico para objetos de préstamo a partir de: fecha de fin de préstamo, cliente y material
	 * @param fechaFin Fecha prevista para el final del préstamo
	 * @param cliente Cliente al que se concede el préstamo
	 * @param material Material que se presta: libro o disco
	 */
	public Prestamo(LocalDateTime fechaFin, Cliente cliente, Material material) {
		super();
		this.fechaFin = fechaFin;
		this.cliente = cliente;
		this.material = material;
		this.fechaInicio = LocalDateTime.now();
	}
	
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Material getMaterial() {
		return material;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
}

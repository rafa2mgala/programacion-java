package dam.temasiete.actividad.siete.dos;
/**
 * Disco para préstamos
 * @author Rafa
 * @version 1.0
 */
public class Disco extends Material {
	private String referencia;
	private String discografica;
	/**
	 * Constructor específico para crear un disco a partir de: referencia, discográfica, código, título y autor
	 * @param referencia Referencia del disco
	 * @param discografica Discográfica que produce el disco
	 * @param codigo Código identificativo del disco
	 * @param titulo Título del disco
	 * @param autor Autor o autores del disco
	 */
	public Disco(String referencia, String discografica, String codigo, String titulo, String autor) {
		super(codigo, titulo, autor);
		this.referencia = referencia;
		this.discografica = discografica;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getDiscografica() {
		return discografica;
	}
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!(obj instanceof Libro)) return false;
		return ((Disco)obj).getCodigo().equals(this.getCodigo()) && 
				((Disco)obj).getReferencia()==this.getReferencia();
	}
	
}

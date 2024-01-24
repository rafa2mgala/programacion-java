package dam.temasiete.actividad.siete.dos;
/**
 * Material de préstamo de tipo Libro
 * @author Rafa
 * @version 1.0
 */
public class Libro extends Material{
	private String isbn;
	private int volumen;
	private int paginas;
	/**
	 * Construye un libro a partir de su isb, nº de volumen, páginas, código, título y autor.
	 * @param isbn ISBN del libro
	 * @param volumen Nº de volumen del libro
	 * @param paginas Nº de páginas del volumen
	 * @param codigo Código del libro
	 * @param titulo Título del libro
	 * @param autor Autor o autores del libro
	 */
	public Libro(String isbn, int volumen, int paginas,
			String codigo,String titulo, String autor) {
		super(codigo,titulo,autor);
		this.isbn = isbn;
		this.volumen = volumen;
		this.paginas = paginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!(obj instanceof Libro)) return false;
		return ((Libro)obj).getIsbn().equals(this.getIsbn()) && 
				((Libro)obj).getVolumen()==this.getVolumen();
	}
	
}

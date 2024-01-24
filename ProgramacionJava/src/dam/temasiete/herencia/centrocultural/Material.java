package dam.temasiete.herencia.centrocultural;
/**
 * Material que se puede prestar, de momento el centro cultural sólo dispone de libros y discos para préstamos
 * @author Rafa
 * @version 1.0
 */
public class Material {
	private String codigo;
	private String titulo;
	private String autor;
	/**
	 * Construye materiales de préstamo a partir de su código, título y autor.
	 * @param codigo Código del material
	 * @param titulo Título del material
	 * @param autor Autor o autores del material
	 */
	public Material(String codigo, String titulo, String autor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}

package dam.temasiete.actividad.siete.seis;

/**
 * Clase coche, con esta clase podremos identificar los coches en nuestro programa,
 * aquellos que tengan coche de empresa
 * 
 * @author Daniel caparros duran
 * @version 1.0
 * @since 1.0
 */
public class Coche {
    private String marca;
    private String matricula;
    private String modelo;

    /**
     * Constructor especifico para hacer un coche, se necesita marca, matricula
     * y modelo
     * 
     * @param marca La marca
     * @param matricula La matricula
     * @param modelo El modelo
     */
    public Coche(String marca, String matricula, String modelo) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }


    //Getters y setters junto a toString()
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + "]";
    }
    
}

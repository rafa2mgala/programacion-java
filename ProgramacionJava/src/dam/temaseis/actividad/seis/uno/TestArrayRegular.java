package dam.temaseis.actividad.seis.uno;

import java.util.Random;

/**
 * Solución propuesta para la actividad 6.1
 * @author Rafa
 * @version 1.0
 */
public class TestArrayRegular {
	private int[] numeros = new int[100];
	private int[][] duplicados = new int[75][2];
	public static void main(String[] args) {		
		TestArrayRegular tar = new TestArrayRegular();
		//inicializar los valores del array
		tar.inicializar();

		//mostrar el valor mayor
		System.out.println(tar.mayor());

		//mostrar el valor menor
		System.out.println(tar.menor());

		//mostrar la media
		System.out.println(tar.media());

		//calcular duplicados
		tar.calcularDuplicados();
		
		//mostrar duplicados
		tar.mostrarDuplicados();

		//mostrar valores repetidos
		tar.repetidos();
	}
	public void inicializar() {
		Random rnd = new Random();
		for(int i=0;i<this.numeros.length;i++) {
			this.numeros[i] = rnd.nextInt(1, 76);			
		}		
	}
	public int mayor() {
		int numeroMayor=0;
		for(int i=0;i<this.numeros.length;i++) {
			if(this.numeros[i]>numeroMayor)
				numeroMayor = this.numeros[i];
		}
		return numeroMayor;
	}
	public int menor() {
		int numeroMenor=76;
		for(int i=0;i<this.numeros.length;i++) {
			if(this.numeros[i]<numeroMenor)
				numeroMenor = this.numeros[i];
		}
		return numeroMenor;
	}
	public double media() {		
		int sumador=0;
		for(int i=0;i<this.numeros.length;i++) {
			sumador+=this.numeros[i];
		}
		return (double)sumador/this.numeros.length;
	}
	public void calcularDuplicados() {
		int veces=0;
		for(int i=0;i<this.duplicados.length;i++) {
			this.duplicados[i][0]=i+1;
		}	
		for(int j=0;j<this.duplicados.length;j++) {
			for(int i=0;i<this.numeros.length;i++) {
				if(this.duplicados[j][0]==this.numeros[i])
					veces++;
			}
			this.duplicados[j][1]=veces;
			veces = 0;
		}		
	}
	public void repetidos() {
		for(int i=0;i<this.duplicados.length;i++) {
			if(this.duplicados[i][1]>1) {
				System.out.println("El " + 
						this.duplicados[i][0] + " se ha repetido " +
						(this.duplicados[i][1] - 1) + " veces");
			}
		}
	}
	public void mostrarDuplicados() {
		for(int i=0;i<duplicados.length;i++) {
			for(int j=0; j<this.duplicados[i].length;j++) {
				System.out.print(this.duplicados[i][j] + "\t");
			}
			System.out.println();
		}		
	}
}

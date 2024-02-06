package dam.temaseis.ejemplos.generica;

import java.time.LocalDate;
import java.util.HashMap;

public class TestGenerico {

	public static void main(String[] args) {
		Empleado[] plantilla = new Empleado[10];
		Object[] temp = plantilla;
		temp[0] = LocalDate.now();
		for(int i=0;i<temp.length;i++)
			plantilla[i].incrementaSalario(i);
		
		DamArray damArray = new DamArray();
		
		damArray.add(new Producto(new EtiquetaProducto()));
	}

}

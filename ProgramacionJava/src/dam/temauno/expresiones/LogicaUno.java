package dam.temauno.expresiones;
/**
 * Soluciones propuestas a las actividades:
 * Tema 1 -> 1.12 Expresiones lógicas I
 * Refuerzo y ampliación - > 1. Lógica 1
 */
public class LogicaUno {

	public static void main(String[] args) {
		int i=8, j= 5;
		//float x=0.005F, y= -0.01F;
		char c = 'c', d='d';
		boolean resultado;	
		//valores de las variables para la actividad
		//Refuerzo y ampliación 1.2.
		//boolean x=true,y=true,z=false, w=false;
		//valores de las variables para la actividad
		//Refuerzo y ampliación 1.2.
		boolean x=true,y=false,z=true, w=false;
		//-------------------------------------------
		//Soluciones propuestas para la actividad 1.12
		//-------------------------------------------
		
		//resultado = 2*((i/5)+(4*(j-3))%(i+j-2))>=10; true
		//          2 (    1       8  )      11
		//          2 (    1            8)		
		
		//resultado = x>y && i>0 || j<5; true
		
		//resultado = -(i+j)!=-i+j; true
		
		//resultado = 5*(i+j)>'c'; true
		
		//resultado = (3*i-2*j)%(2*d-c)>3*d; false
		//               14       101  300
		
		//resultado = x < y--; false
		//          0.005   -0.01
		//                  y=-(0.01+1)  
		
		//resultado = x<++y; true
		//          0.005 y=-0.01+1 
		
		//x=0.005F, y= -0.01F 
		//resultado = 2*x+(y+=1)> 10; false 
		//          2 * 0.005
		
		//c = 'c', d='d';
		//resultado = (i-3*j)%(c+2*d)/(x-y)>=0; //false
		//             -7      299
		//                  -7        0.005+0.01=0.015
		//                  -7        0.015
		
		//resultado = i <= j && i >= c; false 
		
		//resultado = c > d || c>0; true
		
		//resultado = y--<1; true
		
		//resultado = ++x > 0; true
		
		//resultado = !(i<=j);true
		
		//-------------------------------------------
		//Soluciones propuestas para la actividad 1
		//de Refuerzo y ampliación
		//-------------------------------------------
		
		//x=true,y=true,z=false, w=false;
		//resultado = x && !y && !x || !w && y; true
		
		//x=true,y=false,z=true
		//resultado = !x || !y || z && x && !y; true
		
		//x=true,y=true,z=false, w=false
		//resultado = !(w||!y) && x||z; true
		
		//x=true,y=true,z=false, w=false
		//resultado = y || !(y || z && w); true
		
		//x=true,y=true,z=false, w=false;
		//resultado = (x && y) || (x && z); true
	}

}

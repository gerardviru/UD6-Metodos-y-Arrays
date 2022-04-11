package UD06;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*Declaramos una variable de tipo string para referenciarla en un switch
		  que son las opciones que tendrá para poder escoger */
		/*Controlamos los posibles errores*/
		String menu = JOptionPane.showInputDialog("Bienvenido, que area desea calcular?");
		
		switch(menu) {
			case "circulo" :
				areacirculo();
				break;
			case "triangulo":
				areatriangulo();
				break;
			case "cuadrado":
				areacuadrado();
				break;
			default:
				System.out.println("Indique de nuevo el area que desea calcular");
		}
	}

	/*Creamos el método que calculará el área del circulo*/
	public static void areacirculo() {
		
		/*Declaramos variable constante ya que el valor de Pi no cambiará*/
		final double Pi = 3.14;
		
		/*El radio introducido es de tipo String, declaramos una variable double para
		  poder parsear el valor introducido por el usuario y que pase de String a Double*/
		/*Declaramos una variable tipo double para poder operar con el método Math
		 y realizamos el output del resultado*/
		
		String radio = JOptionPane.showInputDialog("Introduzca el radio del circulo en centímetros: ");
		
		double radioD = Double.parseDouble(radio);
		double operacion;
		operacion = Pi * Math.pow(radioD, 2);
		JOptionPane.showMessageDialog(null, "El area del circulo es:  "+operacion+" cm²");
	}
	
	/*Creamos el método que calculará el área del triangulo*/
	public static void areatriangulo() {
		
		/*Declaramos dos strings en imputs que introducirá el usuario, la base y la altura*/
		/*Declaramos una variable double para poder parsear el valor introducido por el usuario y que pase de String a Double*/
		/*Declaramos una variable tipo double para poder operar con el método Math y realizamos el output del resultado*/
		String base = JOptionPane.showInputDialog("Introduzca el valor de la base del triangulo en centímetros: ");
		double baseD = Double.parseDouble(base);
		
		String altura = JOptionPane.showInputDialog("Introduzca el valor de la altura del triangulo centímetros: ");
		double alturaD = Double.parseDouble(altura);
		double operacion;
		operacion =(baseD*alturaD)/2;
		JOptionPane.showMessageDialog(null, "El area del triangulo es:  "+operacion+" cm²");
	}
	
	/*Creamos el método que calculará el área del triangulo*/
	public static void areacuadrado() {
		
		/*Declaramos dos strings en imputs que introducirá el usuario, dos de los lados del cuadrado*/
		/*Declaramos una variable double para poder parsear el valor introducido por el usuario y que pase de String a Double*/
		/*Declaramos una variable tipo double para poder operar con el método Math y realizamos el output del resultado*/
		
		String lado1 = JOptionPane.showInputDialog("Introduzca el valor de uno de los lados del cuadrado en centímetros: ");
		double ladoD1 = Double.parseDouble(lado1);
		String lado2 = JOptionPane.showInputDialog("Introduzca el valor de otro de los lados del cuadrado en centímetros: ");
		double ladoD2 = Double.parseDouble(lado2);
		double operacion;
		operacion = ladoD1*ladoD2;
		JOptionPane.showMessageDialog(null, "El area del cuadrado es:  "+operacion+" cm²");
	}
}

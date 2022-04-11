package UD06;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*Declaramos y asignamos una variable para el imput de la cantidad de n�meros aleatorios que generar�*/
		String cantidadAleat1 =JOptionPane.showInputDialog("Introduce la cantidad de n�meros aleatorios");
		int cantidadAleat2=Integer.parseInt(cantidadAleat1);
		
		/*Declaramos y asignamos una variable de tipo entero que marca el primer valor del intervalo*/
		cantidadAleat1=JOptionPane.showInputDialog("Introduce un n�mero");
		int num1=Integer.parseInt(cantidadAleat1);
		
		/*Declaramos y asignamos una variable de tipo entero que marca el segundo valor del intervalo*/
		cantidadAleat1=JOptionPane.showInputDialog("Introduce un n�mero");
		int num2=Integer.parseInt(cantidadAleat1);
		
		/*Crearemos el bucle para que genere la cantidad de n�meros aleatorios introducidos anteriormente*/
		/*Instanciamos el m�todo creado que opera y realizamos el output por consola*/
		for(int i=0;i<cantidadAleat2;i++){
			System.out.println(generaAleatorio(num1, num2));
		}
	}
	
	/*M�todo que realiza la operaci�n, en este caso crea numeros random dentro de los intervalos definidos*/
	public static int generaAleatorio(int num1, int num2){
		/*Maht.random retorna un n�mero aleatorio dentro del rango asignado*/
		return ((int)Math.floor(Math.random()*(num2-num1)+num1));
	}
}
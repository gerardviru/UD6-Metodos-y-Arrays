package UD06;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*Declaramos y asignamos una variable para el imput de la cantidad de números aleatorios que generará*/
		String cantidadAleat1 =JOptionPane.showInputDialog("Introduce la cantidad de números aleatorios");
		int cantidadAleat2=Integer.parseInt(cantidadAleat1);
		
		/*Declaramos y asignamos una variable de tipo entero que marca el primer valor del intervalo*/
		cantidadAleat1=JOptionPane.showInputDialog("Introduce un número");
		int num1=Integer.parseInt(cantidadAleat1);
		
		/*Declaramos y asignamos una variable de tipo entero que marca el segundo valor del intervalo*/
		cantidadAleat1=JOptionPane.showInputDialog("Introduce un número");
		int num2=Integer.parseInt(cantidadAleat1);
		
		/*Crearemos el bucle para que genere la cantidad de números aleatorios introducidos anteriormente*/
		/*Instanciamos el método creado que opera y realizamos el output por consola*/
		for(int i=0;i<cantidadAleat2;i++){
			System.out.println(generaAleatorio(num1, num2));
		}
	}
	
	/*Método que realiza la operación, en este caso crea numeros random dentro de los intervalos definidos*/
	public static int generaAleatorio(int num1, int num2){
		/*Maht.random retorna un número aleatorio dentro del rango asignado*/
		return ((int)Math.floor(Math.random()*(num2-num1)+num1));
	}
}
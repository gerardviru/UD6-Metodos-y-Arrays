package UD06;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		/*Declaramos una variable constante y asignamos su valor ya que no cambiar�, ya que es la longitud del Array*/
		final int posiciones=10;
		/*Definimos un Array con la variable constante creada anteriormente*/
		int num[]=new int [posiciones];
		
		/*Instanciamos el m�todo*/
		Array(num);
	}
	
	public static void Array (int lista[]) {
		
		/*Declaramos el bucle que nos recorre las posiciones del array y introduciremos cada valor a cada posici�n*/
		for(int i=0;i<lista.length;i++){
            String menu=JOptionPane.showInputDialog("Introduce un n�mero");
            lista[i]=Integer.parseInt(menu);
		}
		/*Declaramos el bucle que nos recorre el array con un output que muestra las posiciones con su valor correspondiente*/
		for(int i=0;i<lista.length;i++){
            System.out.println("En la posici�n "+i+" el valor es "+lista[i]);
        }
	}
}

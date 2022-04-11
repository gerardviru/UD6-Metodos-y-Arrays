package UD06;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		String menu=JOptionPane.showInputDialog("Escribe el número de posiciones que desea");
		/*Parseamos el valor String a int para poder operar con el valor*/
		int num[]=new int [Integer.parseInt(menu)];
		
		/*Instanciamos el método que realiza la función y le asignamos entre que valores generará aleatorios*/
		arraysAleat(num, 0, 20);
	}
	
	public static void arraysAleat(int lista[],int num1,int num2) {
		
		for(int i=0;i<lista.length;i++){
            /*Generamos un número entre los parametros pasados*/
            lista[i]=((int)Math.floor(Math.random()*(num1-num2)+num2));
        }
		for(int i=0;i<lista.length;i++){
			JOptionPane.showConfirmDialog(null,"En la posición "+i+" el valor es "+lista[i]);
        }
	}
}

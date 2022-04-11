package UD06;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String menu=JOptionPane.showInputDialog("Introduce un número");
        int numero=Integer.parseInt(menu);
        System.out.println("El factorial de "+numero+ " es " +Factorial(numero));
	}
	
	public static int Factorial(int num) {
		
		/*Declaramos una variable entera que acumulara los resultados de las operaciones y le reasignamos el valor*/
		int res=num;
        /*Declaramos un bucle que inicia con el numero anterior al que introducimos*/
        for(int i=(num-1);i>0;i--){
            /*Acumulamos el resultado*/
            res=res*i;
        }
        return res;
	}

}

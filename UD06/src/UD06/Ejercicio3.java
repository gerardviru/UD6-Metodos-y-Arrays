package UD06;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String menu=JOptionPane.showInputDialog("Introduce un numero");
		int num=Integer.parseInt(menu);
		
		/*Instanciamos el método Primo dentro de una condición, si la condición no se cumple devuelve false, si la condición se cumple devuelve true*/
		if(Primo(num)) {
			System.out.println("El número "+ num +" es primo");
		}else {
			System.out.println("El número "+ num +" no es primo");
		}
		
	}

	public static boolean Primo (int num){
		
		/*Declaramos una condición que si el número introducido es menor o igual a 1, no es primo*/
		if(num<=1){
			return false;
		}
		
		/*Declaramos y instanciamos a 0 una variable que usaremos como contador*/
		/*Si el divisor es menor o igual que la raíz cuadrada del número, no habrá divisores por encima de la raíz cuadrada*/
		int cont=0;
		for (int div=(int)Math.sqrt(num);div>1;div--){
            //Contabilizados los divisibles"
                if (num%div==0){
                cont+=1;
            }
        }
        /*Segun cuantos divisibles tenga el número, es primo*/
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }
}
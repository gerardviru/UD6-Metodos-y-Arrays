package UD06;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String menu=JOptionPane.showInputDialog("Introduce un numero");
		int num=Integer.parseInt(menu);
		
		/*Instanciamos el m�todo Primo dentro de una condici�n, si la condici�n no se cumple devuelve false, si la condici�n se cumple devuelve true*/
		if(Primo(num)) {
			System.out.println("El n�mero "+ num +" es primo");
		}else {
			System.out.println("El n�mero "+ num +" no es primo");
		}
		
	}

	public static boolean Primo (int num){
		
		/*Declaramos una condici�n que si el n�mero introducido es menor o igual a 1, no es primo*/
		if(num<=1){
			return false;
		}
		
		/*Declaramos y instanciamos a 0 una variable que usaremos como contador*/
		/*Si el divisor es menor o igual que la ra�z cuadrada del n�mero, no habr� divisores por encima de la ra�z cuadrada*/
		int cont=0;
		for (int div=(int)Math.sqrt(num);div>1;div--){
            //Contabilizados los divisibles"
                if (num%div==0){
                cont+=1;
            }
        }
        /*Segun cuantos divisibles tenga el n�mero, es primo*/
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }
}
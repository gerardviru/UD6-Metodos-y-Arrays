package UD06;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		/*Declar*/
		int num;
		do {
			String menu=JOptionPane.showInputDialog("Introduce un n�mero entero positivo");
			num=Integer.parseInt(menu);
		}while(num<0);
		int numCif=operacioCifras(num);
			if(numCif==1){
				System.out.println("El n�mero " +num+" tiene "+numCif+" cifras");
			}else{
				System.out.println("El n�mero " +num+" tiene "+numCif+" cifras");
			}
	}

	public static int operacioCifras(int num) {
		
		/*Declaramos las variables enteras y las asignamos en un bucle "for" que
		  contar� el n�mero de cifras de el n�mero introducido por teclado*/
		int cont= 0;
		for(int i=num;i>0;i/=10){
			cont++;
		}
		return cont;
	}
}

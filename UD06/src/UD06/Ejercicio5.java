package UD06;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*Imput por pantalla para introducir el n�mero*/
		String menu=JOptionPane.showInputDialog("Introduce un numero");
        int num=Integer.parseInt(menu);
        
        /*Declaramos una variable tipo String y asignamos el m�todo creado para realizar la operaci�n de conversi�n*/
        /*Realizamos el Output del resultado*/
        String binario=Conversion(num);
        System.out.println("El numero "+num+ " en binario es igual: "+binario);

	}

	/*M�todo que realiza la conversi�n del valor n�merico decimal a binario*/
	public static String Conversion (int num) {
		/*Declaraci�n de las variables*/
		String binario="";
		String valor;
		/*Declaraci�n de un bucle que contiene una condici�n, para asignar el valor correspondiente*/
		/*Si la condici�n se cumple a la variable valor se asigna el valor 1, si no la cumple el valor asignado es 0*/
		for(int i=num;i>0;i/=2) {
			if(i%2==1){
				valor="1";
			}else{
				valor="0";
			}
			binario=valor+binario;
		}
		return binario;
	}
}

package UD06;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*Imput por pantalla para introducir el número*/
		String menu=JOptionPane.showInputDialog("Introduce un numero");
        int num=Integer.parseInt(menu);
        
        /*Declaramos una variable tipo String y asignamos el método creado para realizar la operación de conversión*/
        /*Realizamos el Output del resultado*/
        String binario=Conversion(num);
        System.out.println("El numero "+num+ " en binario es igual: "+binario);

	}

	/*Método que realiza la conversión del valor númerico decimal a binario*/
	public static String Conversion (int num) {
		/*Declaración de las variables*/
		String binario="";
		String valor;
		/*Declaración de un bucle que contiene una condición, para asignar el valor correspondiente*/
		/*Si la condición se cumple a la variable valor se asigna el valor 1, si no la cumple el valor asignado es 0*/
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

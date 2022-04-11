package UD06;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		/*Declaramos y asignamos una variable String que sera la cantidad de euros que introduzca el usuario*/
		/*Parsear el número introducido String a Double para poder operar con el*/
		/*Declaramos y asignamos una variable String que sera la moneda a la que se quiere convertir*/
		
		
		String menu=JOptionPane.showInputDialog("Escribe una cantidad en euros");
        double cantidad=Double.parseDouble(menu);
        String moneda=JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir");
        /*Instanciamos el método creado que realiza la conversión*/
        Conversion(cantidad, moneda);
    }
	
		/*Método que realiza la operación de conversión*/
   public static void Conversion (double cantidad, String moneda){
        double resultado=0;
 
        /*Declaramos una variable boolean para controlar si el imput y no es un nombre de moneda correcto*/
        boolean valor = true;
 
        /*Creamos un switch ya que tenemos diferentes monedas de conversión*/
        switch (moneda){
        case "libras":
            resultado=cantidad*0.86;
            break;
        case "dolares":
            resultado=cantidad*1.29;
            break;
        case "yenes":
            resultado=cantidad*129.852;
            break;
        /*Controlamos los posibles errores y le asignamos el valor false*/
        default:
            System.out.println("No has introducido una moneda correcta");
            valor=false;
        }
 
        /*Instanciamos una condición, ya que, solo si es correcto muestra el mensaje*/
        if (valor){
        	JOptionPane.showConfirmDialog(null,cantidad+ " euros, en "+moneda+" son "+resultado+" "+moneda);
        }
 
    }
}
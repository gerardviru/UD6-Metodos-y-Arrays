package UD06;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Indicamos el tamaño
        String menu=JOptionPane.showInputDialog("Introduce la cantidad de valores");
        int cantidad=Integer.parseInt(menu);
        
        /*Instanciamos dos arrays*/
        int array1[] = new int [cantidad];
        int array2[];
        
		/*Instanciamos el método que asigna un valor a cada posición del array de forma aleatoria
		  utilizando el rango de valores introducido*/
        arrayAleat(array1, 0, 50);
        
        /*Asignamos que el array2 apunta al mismo espacio de memoria que el array1*/
        array2=array1;
        
        /*Instanciamos un nuevo array, usando el array1. Array1 tendra una nueva direccion.*/
        array1=new int[cantidad];
 
        /*Lo volvemos a rellenar, ya que al crear el array de nuevo no contiene los numeros anteriores*/
        arrayAleat(array1, 0, 50);
		
        /*Contiene el array con el resultado de multiplicar los valores del array1 y array2*/
        int array3[]=multiplicador(array1, array2);
        
        /*Output de los valores de los Arrays*/
        
        JOptionPane.showConfirmDialog(null,"Array1");
        outputArray(array1);
        
        JOptionPane.showConfirmDialog(null,"Array2");
        outputArray(array2);
        
        JOptionPane.showConfirmDialog(null,"Array3");
        outputArray(array3);
        	
        System.gc();
       
	}
	/*Método que nos genera números aleatorios*/
	public static void arrayAleat(int lista[],int num1,int num2) {
		
		/*Declaramos el bucle que nos recorre las posiciones del array
		  y asigna un valor aleatorio a cada una de ellas*/
		for(int i=0;i<lista.length;i++){
            lista[i]=((int)Math.floor(Math.random()*(num1-num2)+num2));
		} 
	}
	
	/*Método que tiene como funcionalidad mostrar el output por pantalla de la posición del array y su valor*/
	public static void outputArray(int lista[]) {
		for(int a=0;a<lista.length;a++){
			JOptionPane.showConfirmDialog(null,"En la posición "+a+" el valor es "+lista[a]);
			}
	}
	
	/*Método cuya función es instanciar un nuevo array 
	  asignando a cada posición la multiplicación de los arrays anteriores entre si*/
	public static int[] multiplicador(int array1[], int array2[]){
        int array3[]=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
}

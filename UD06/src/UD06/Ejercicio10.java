package UD06;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		/*Indicamos el tamaño*/
        String menu=JOptionPane.showInputDialog("Introduce la cantidad de numeros primos aleatorios");
        int num[]=new int[Integer.parseInt(menu)];
   
        /*Instanciamos el método que genera los aleatorios entre el intervalo definido*/
       arrayPrimoAleat(num, 1, 100);
       
       /*Instanciamos el método que genera el output que muestra por pantalla*/
       outputArray(num);
         
        /*Declaramos una variable entera y la asignamos al método que nos comparan los números primos
          y nos define el primo mayor*/
        int primoMayor=mayor(num);
        JOptionPane.showConfirmDialog(null,"El primo más grande es el "+primoMayor);
	}
	
	/*Método que nos genera números aleatorios primos*/
	public static void arrayPrimoAleat(int lista[],int num1,int num2) {
		
		int i=0;
		/*Generamos un bucle de números primos entre los parametros pasados*/
		while(i<lista.length){
            int num=((int)Math.floor(Math.random()*(num1-num2)+num2));
             /*Condición que instancia al método que calcula los números primos.
               si el número es primo lo añade al array*/
            if(Primo(num)) {
            	lista[i]=num;
            	i++;
            	}
		}
	}
	
	/*Método que tiene como funcionalidad mostrar el output por pantalla de la posición del array y su valor*/
	public static void outputArray(int lista[]) {
		for(int a=0;a<lista.length;a++){
			JOptionPane.showConfirmDialog(null,"En la posición "+a+" el valor es "+lista[a]);
			}
	}
	
	/*Método que calcula un número primo*/
	public static boolean Primo (int num){
		
		/*Declaramos una condición que si el número introducido es menor o igual a 1, no es primo*/
        if (num<=1){
            return false;
        }else{
  
            /*Declaracion de variables*/ 
            int operacion;         
            int contador=0;
            /*Hacemos la raiz cuadrada y lo usamos para dividir el numero original*/
            operacion=(int)Math.sqrt(num);
            /*Bucle que cuenta los numeros divisibles*/
            for (;operacion>1;operacion--){
                if (num%operacion==0){
                    contador+=1;
                }
            }
            return contador < 1;
        }
       
	}
	
	/*Método cuya funcionalidad és comparar el valor de las posiciones del array y definir que valor es el más grande*/
	public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>mayor){
                mayor=lista[i];
            }
        }
        return mayor;
    }
}

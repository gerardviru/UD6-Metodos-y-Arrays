package UD06;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		/*Indicamos el tama�o*/
        String menu=JOptionPane.showInputDialog("Introduce la cantidad de numeros primos aleatorios");
        int num[]=new int[Integer.parseInt(menu)];
   
        /*Instanciamos el m�todo que genera los aleatorios entre el intervalo definido*/
       arrayPrimoAleat(num, 1, 100);
       
       /*Instanciamos el m�todo que genera el output que muestra por pantalla*/
       outputArray(num);
         
        /*Declaramos una variable entera y la asignamos al m�todo que nos comparan los n�meros primos
          y nos define el primo mayor*/
        int primoMayor=mayor(num);
        JOptionPane.showConfirmDialog(null,"El primo m�s grande es el "+primoMayor);
	}
	
	/*M�todo que nos genera n�meros aleatorios primos*/
	public static void arrayPrimoAleat(int lista[],int num1,int num2) {
		
		int i=0;
		/*Generamos un bucle de n�meros primos entre los parametros pasados*/
		while(i<lista.length){
            int num=((int)Math.floor(Math.random()*(num1-num2)+num2));
             /*Condici�n que instancia al m�todo que calcula los n�meros primos.
               si el n�mero es primo lo a�ade al array*/
            if(Primo(num)) {
            	lista[i]=num;
            	i++;
            	}
		}
	}
	
	/*M�todo que tiene como funcionalidad mostrar el output por pantalla de la posici�n del array y su valor*/
	public static void outputArray(int lista[]) {
		for(int a=0;a<lista.length;a++){
			JOptionPane.showConfirmDialog(null,"En la posici�n "+a+" el valor es "+lista[a]);
			}
	}
	
	/*M�todo que calcula un n�mero primo*/
	public static boolean Primo (int num){
		
		/*Declaramos una condici�n que si el n�mero introducido es menor o igual a 1, no es primo*/
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
	
	/*M�todo cuya funcionalidad �s comparar el valor de las posiciones del array y definir que valor es el m�s grande*/
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

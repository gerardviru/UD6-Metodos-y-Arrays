package UD06;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		/*Indicamos el tama�o*/
        String menu=JOptionPane.showInputDialog("Introduce un tama�o");
        int num[]=new int[Integer.parseInt(menu)];
 
        int ultimoDigito;
        do{
        	menu=JOptionPane.showInputDialog("Introduce el digito de 0 a 9 que marcar� la terminaci�n del valor");
            ultimoDigito=Integer.parseInt(menu);
        }while(!(ultimoDigito>=0 && ultimoDigito<=9));
 
        /*Asignamos valores a cada posici�n del array de forma aleatoria utilizando el rango definido*/
        arrayNumAleat(num, 1, 300);
 
        /*Creamos un array que contenga los numeros terminados en el numero especificado*/
        int terminadosEn[]=valorTerminacion(num, ultimoDigito);
 
        /*Mostramos el resultado, mira el metodo de mostrarArrays*/
        outputArrayNumTerminacion(terminadosEn);
 
    }
    public static void arrayNumAleat(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            /*Generamos un n�mero entre los parametros pasados*/
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void outputArrayNumTerminacion(int lista[]){
        for(int i=0;i<lista.length;i++){
            /*No incluimos las posiciones que tengan un 0*/
            if(lista[i]!=0){
                System.out.println("El numero "+lista[i]+" acaba en el n�mero pedido");
            }
        }
    }
 
    public static int[] valorTerminacion(int num[], int ultimo_numero){
 
        /*Array que almacenara los numeros terminados en el numero pedido*/
        int terminadosEn[]=new int[num.length];
 
        int numeroFinal=0;
 
        for (int i=0;i<terminadosEn.length;i++){
 
            /*Restamos el numero por el mismo numero sin unidades correspondiente*/
            numeroFinal=num[i]-(num[i]/10*10);
 
            /*Si el numero obtenido es el buscado, lo a�adimos*/
            if (numeroFinal==ultimo_numero){
                terminadosEn[i]=num[i];
            }
        }
 
        return terminadosEn;
    }
 
}

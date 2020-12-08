/* 3. Un conductor maneja de un pueblo origen a un pueblo destino, pasando por varios pueblos. Una vez en el pueblo destino, el conductor
debe regresar a casa por el mismo camino. Muestre el camino recorrido tanto de ida como de vuelta. Implemente un programa que imprima el
recorrido por 5 pueblos del conductor */

package problema3;

import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        String pueblos;
        int a=1,b=1,c=5;
        Scanner entrada = new Scanner(System.in);
        
        Pila pilita = new Pila();
        
        do{
        System.out.print("Ingrese el pueblo #"+a+": ");
        pueblos = entrada.next();
        pilita.Push(pueblos);
        a++;
        }while(a<6);

        System.out.println("\n\t---CAMINO DE IDA---");
        
        do{
            System.out.println("Su Pueblo #"+b+" es : "+pilita.topePila());  
            pilita.Pop();
            b++;
        }while(b<6);
        
        System.out.println("\n\t---CAMINO DE VUELTA---");
        
        do{
           System.out.println("Su Pueblo #"+b+" es : "+pilita.VueltaPila());
           c--;
        }while(c>0);
 
    }    
}
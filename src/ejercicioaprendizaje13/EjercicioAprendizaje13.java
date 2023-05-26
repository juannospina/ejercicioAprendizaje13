/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package ejercicioaprendizaje13;

import java.util.Scanner;

public class EjercicioAprendizaje13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el lado del cubo: ");
        int lado = entrada.nextInt();
        
        for (int i = 1; i <= lado; i++) { //i=1 es igual a la primer fila
            for (int j = 1; j <= lado; j++) { //j=1 es igual a la primer columna
                if(i == 1 || i == lado || j == 1 || j == lado){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
    
}

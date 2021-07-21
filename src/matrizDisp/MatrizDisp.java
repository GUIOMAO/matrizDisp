//Unidad 3: Tarea (10%) - Matrices dispersas
//Encontrar la fórmula de direccionamiento de una matriz dispersa con diagonal secundaria, 
//es decir como puedo saber a que posición del vector corresponde un elemento de la diagonal secundaria.

//Autores:
//	LADY GUIOVANA ESPITIA ZAPATA
//	HENZCER MAURICIO PEÑA IGUAVITA
// CAMBIO 1

package matrizDisp;

import java.util.Random;
import java.util.Scanner;

public class MatrizDisp {

    public static void main(String[] args) {

        Random dimension = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un valor para definir la dimensión de la matriz: ");
        int n = entrada.nextInt();
        int[][] matriz = new int[n][n];
        int arregloA[] = new int[n];
        String arregloB[] = new String[n];
        System.out.println(" ");

        System.out.println("Matriz dispersa con diagonal secundaria");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = dimension.nextInt(9);

                if ((i + j) == matriz.length - 1) {
                    System.out.print("[" + matriz[i][j] + "]");
                    //
                    arregloA[i] = matriz[i][j];
                    arregloB[i] = "[ " + i + " ][ " + j + " ]";

                } else {
                    System.out.print("[0]");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("En el vector los elementos de la diagonal secundaria se encuentran en las siguientes posiciones: ");
        System.out.print("Posición:   ");
        for (int p = 0; p < arregloA.length; p++) {
            System.out.print(p + "    ");
        }

        System.out.println(" ");
        System.out.print("Elemento: ");
        for (int p = 0; p < arregloA.length; p++) {
            System.out.print("[ " + arregloA[p] + " ]");
        }

        System.out.println("\n\nEn la matriz los elementos de la diagonal secundaria se encuentran en las siguientes posiciones: ");

        System.out.println("Dato Fila Columna");

        for (int p = 0; p < arregloA.length; p++) {

            System.out.print("[ " + arregloA[p] + " ]");
            System.out.println(arregloB[p]);

        }
        System.out.println("");
    }

}

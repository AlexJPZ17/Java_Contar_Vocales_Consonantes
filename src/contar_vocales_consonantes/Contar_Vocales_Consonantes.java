/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contar_vocales_consonantes;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Contar_Vocales_Consonantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Método scanner para introducir datos desde la consola 
        Scanner entrada = new Scanner(System.in);
        // Declaramos las variables 
        String palabra;
        int contador1 = 0, contador2 = 0, consonantes;
        System.out.println("Introduzca una palabra");
        //Método que obtiene los datos ingresados 
        palabra = entrada.nextLine();
        /*Ciclo for que obtiene la longitud de la cadena ingresada 
        o que obtiene la cantidad de letras que tiene la cadena */
        for (int i = 0; i < palabra.length(); i++) {
            contador1++;
        }
        for (int i = 0; i < palabra.length(); i++) {
            /*condición que evalúa  la cadena ingresada 
            en busca de las siguientes vocales */
            if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e')||
                    (palabra.charAt(i)=='i') || (palabra.charAt(i)=='o')||
                    (palabra.charAt(i)=='u')){
                contador2++;
            }
        }
        //Resta de las variables contador
        consonantes = contador1-contador2;
        System.out.println("La palabra " + palabra + " contiene " + contador2+ " vocales");
        System.out.println("La palabra " + palabra + " contiene " +consonantes+ " consonantes");
    }
    
}

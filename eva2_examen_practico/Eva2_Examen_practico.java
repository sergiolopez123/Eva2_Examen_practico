/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_examen_practico;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva2_Examen_practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
       int eleccionU; 
       int eleccionC; 
       int juegos;
       System.out.println("cuantos juegos quieres jugar contra la computadora?");
       juegos = scan.nextInt();
       eleccionC = (int)(Math.random()*10);
        int victorias = 0; int derrotas = 0; int empates = 0;
       for(int i = 0; i <= juegos; i++){
                   System.out.println("que deseas escojer? introducelo en numero (piedra = 1), (papel = 2), Tijeras = 3) ");
       eleccionU = scan.nextInt();
       if(eleccionC <= 3 && eleccionU == 1){
           System.out.println("la computadora eligio tijeras y el usuario piedra, el usuario gana! " + victorias++ );
       } else if(eleccionC <= 3 && eleccionU == 2){
          System.out.println("La computadora eligio tijeras y el usuario papel, gana la computadora! " + derrotas++);
       } else if(eleccionC <=3 && eleccionU == 3){
           System.out.println("la comoutadora eligio tijeras y el usuario tijeras, fue un empate " + empates++);
       }
       else if ( (eleccionC >= 3 && eleccionC <= 6) && eleccionU == 1){
           System.out.println("la computadora eligio papel y el usuario piedra, gana la computadora "+ derrotas++);
       }else if ( (eleccionC >= 3 && eleccionC <= 6) && eleccionU == 2){
           System.out.println("la computadora eligio papel y el usuario papel, fue un empate " + empates++); 
       }else if ( (eleccionC >= 3 && eleccionC <= 6) && eleccionU == 3){
           System.out.println("la computadora eligio papel y el usuario tijeras, gana el usuario " + victorias++);
       }else if(eleccionC > 6 && eleccionU == 1){
           System.out.println("la computadora eligio piedra y el usuario piedra, es un empate " + empates++);
       }else if(eleccionC > 6 && eleccionU == 2){
           System.out.println("la computadora eligio piedra y el usuario papel, gana el usuario " + victorias++);
       } else { System.out.println("la computadora eligio piedra y el usuario papel, gana la computadora " + derrotas++);
       } System.out.println("el marcador va: victorias: " + victorias + " derrotas: " + derrotas + " empates: " + empates);
       } System.out.println("Los marcadores quedaron asi: victorias: " + victorias + " derrotas: " + " y empates: " + empates);
}
}
    

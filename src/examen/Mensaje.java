/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

public class Mensaje {
    // Leemos un valor de consola
    Scanner sc = new Scanner(System.in);
    String mensaje;
    
    public Mensaje() {
       
    } 
    //METODO CON UN OBJETO COMO PARAMETRO 
    //SOBRECARGA DE METODOS
    public void mandar_mensaje(JugadorBarca j1){
        // Pedimos al usuario un mensaje para el jugador
        System.out.println("Escribe un mensaje para mandarle a "
                + j1.getNombre());
        // Esperamos por el mensaje
        mensaje = sc.nextLine();
    }
    
    public void mandar_mensaje(){
        // Indicamos que el mensaje fue enviado
        System.err.println("Se mando tu mensaje al jugador del FC BARCELONA");
    }
    
}

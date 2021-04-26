/*
>PROGRAMACION ORIENTADA A OBJETOS
    >Examen unidad 2
    >Docente: Juana Garcia Seañez
    >Equipo: 5
        >Integrantes: 
            >Miguel Yahir Payan Ochoa 
            >José Kaleb Ruelas Loo 
            >Andrés Tavares Tena 
            >Pablo Pizarro Chalup
*/
// Hola a todos

package examen;

import java.util.Scanner;

public class Examen {
    
    public static void main(String[] args) {
        //INSTANCIACION DE UNA CLASE
        JugadorBarca j1 = new JugadorBarca();
        JugadorBarca j2 = new JugadorBarca();
        
//DECLARACION DE VARIABLES
        Scanner sc = new Scanner(System.in); // sc servira para leer lo 
                                            //que se ponga en consola
        String mensaje;
        
        int eleccion; 
        int numero;
        
        Mensaje m = new Mensaje(); // Instanciamos la clase Mensaje
        
        System.out.println("Elige una opcion CONTINUAR (1) o SALIR(2)");
        eleccion = sc.nextInt(); //Elegimos si continuar o salir
        
        if(eleccion == 1){ // en caso de seleccionar continuar
            System.out.println("Elige el numero de algun dorsal"
                    + "del 1 al 11 de algun jugador del FC Barcelona");
            
            numero = sc.nextInt(); // Leera el numero que ingresemos
            // Para seleccionar el jugador
            
            switch(numero){ // Dependiendo del numero,
                            //se dirigira a un jugador u otro
                case 1: 
                    j1.setDorsal(numero); // Colocamos el numero del jugador
                    j1.setNombre("Ter Stegen"); // Colocamos el nombre
                    j1.setPosicion("Arquero"); // Que posicion ocupa
                    j1.setGoles_anotados(0); // Numero de goles
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    //REFERENCIA AL OBJETO ACTUAL
                    j1.inicial(j1.getNombre()); // Nos sirve para saber con que
                    // letra empieza el nombre
                    j1.promgoles(j1.getGoles_anotados()); // Saber el numero de
                    // goles
                    
                    m.mandar_mensaje(j1); // Mandarle un mensaje al jugador
                    m.mensaje = sc.nextLine(); // Leer lo que se coloque en consola
                    m.mandar_mensaje(); // se indica que se mando el mensaje
                    
                    break;
                    
                // EN el resto de las opciones se repite lo anterior
                    // Por lo cual, como referencia de entendimiento solo
                    // usaremos la primera opcion
                case 2:
                    j1.setDorsal(numero);
                    j1.setNombre("Sergiño Dest");
                    j1.setPosicion("Defensa");
                    j1.setGoles_anotados(2);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 3:
                    j1.setDorsal(numero); 
                    j1.setNombre("Gerard pique"); 
                    j1.setPosicion("Defensa"); 
                    j1.setGoles_anotados(0);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 4:
                    j1.setDorsal(numero); 
                    j1.setNombre("Ronald Araujo"); 
                    j1.setPosicion("Defensa"); 
                    j1.setGoles_anotados(2);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 5:
                    j1.setDorsal(numero); 
                    j1.setNombre("Sergio Busquets"); 
                    j1.setPosicion("Medio"); 
                    j1.setGoles_anotados(0);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 6:
                    j1.setDorsal(numero);
                    j1.setNombre("Aleñá");
                    j1.setPosicion("Medio");
                    j1.setGoles_anotados(0);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 7:
                    j1.setDorsal(numero); 
                    j1.setNombre("Antonie Griezmann"); 
                    j1.setPosicion("Ataque");
                    j1.setGoles_anotados(11);
                    
                    System.out.println("El nombre del jugador es " 
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 8:
                    j1.setDorsal(numero);
                    j1.setNombre("Pjanic"); 
                    j1.setPosicion("Medio"); 
                    j1.setGoles_anotados(0);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 9: 
                    j1.setDorsal(numero);
                    j1.setNombre("Martin Brithwaite");
                    j1.setPosicion("Ataque");
                    j1.setGoles_anotados(2);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 10:
                    j1.setDorsal(numero); 
                    j1.setNombre("Lionel Messi"); 
                    j1.setPosicion("Ataque"); 
                    j1.setGoles_anotados(25);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;
                case 11:
                    j1.setDorsal(numero); 
                    j1.setNombre("Ousmane Dembele");
                    j1.setPosicion("Ataque"); 
                    j1.setGoles_anotados(5);
                    
                    System.out.println("El nombre del jugador es "
                            + j1.getNombre() + " su posicion es "
                            + j1.getPosicion() + " y ha anotado "
                            + j1.getGoles_anotados()
                            + " goles esta temporada con el FC BARCELONA");
                    
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    
                    m.mandar_mensaje(j1); 
                    m.mensaje=sc.nextLine();
                    m.mandar_mensaje();
                    
                    break;                
                default:    // Si no se introduce un 
                            //valor apropiado te manda el mensaje
                    System.out.println("Debes ingresar un numero "
                            + "entero del 1 al 11");
                    
                    break;            
            }        
        }
        if (eleccion ==2){ // en caso de querer salir
            System.out.println("Gracias por utilizar");
            System.exit(0); // METODO DESTRUCTOR
        }
    }
}

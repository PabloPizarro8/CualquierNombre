
package examen;
//DECLARACION DE CLASES
public class JugadorBarca {
//ATRIBUTOS
    private int dorsal;
    private double goles_anotados;
    private String nombre;
    private String posicion;
   
   // CONTRUCTORES (SOBRECARGA)
    public JugadorBarca(){
        
    }

    public JugadorBarca(int dorsal, String posicion) {
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    public JugadorBarca(String nombre) {
        this.nombre = nombre;
    }
    
    // SETTERS
    public void setNombre(String nombre) {
        // Pasar el nombre del jugador a la variable correspondiente
        this.nombre = nombre;
    }

    public void setDorsal(int dorsal) {
        // Pasar el dorsal del jugador a la variable correspondiente
        this.dorsal = dorsal;
    }

    public void setPosicion(String posicion) {
        // Pasar la posicion del jugador a la variable correspondiente
        this.posicion = posicion;
    }

    public void setGoles_anotados(double goles_anotados) {
        // Pasar el numero de goles anotados a la variable correspondente
        this.goles_anotados = goles_anotados;
    }
    
   // GETTERS
    public String getNombre() {
        // Leer el nombre de la variable
        return nombre;
    }

    public int getDorsal() {
        // Leer el dorsal de la variable
        return dorsal;
    }

    public String getPosicion() {
        // Leer la posicion de la variable
        return posicion;
    }

    public double getGoles_anotados() {
        // Leer los goles anotados de la variable
        return goles_anotados;
    }
    
    //METODO CON PASO DE VARIABLES POR VALOR
    public void inicial(String nombre){
        // Tomamos el nombre del parametro, y sacamos unicamente la letra inicial
        // e imprimimos eso
        System.out.println("El nombre de " + nombre
                + " comienza por " + nombre.substring(0,1));
    }    

    public void promgoles(double goles_anotados){
        // Pasamos los goles anotados a la variable
        double resultado;
        // y sacamos el promedio de goles
        resultado = goles_anotados/35;
        
        // Imprimimos el resultado
        System.out.println("La presente temporada lleva 35 jornadas "
                + nombre
                + " tiene un promedio de goles de "
                + (double)Math.round(resultado * 100 )/100
                + " por partido");
    }
    
}

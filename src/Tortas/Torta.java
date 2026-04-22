/*
* 2026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Francisco Javier Montesillo Puente
*Descripcion: Tema 3. Metodos
*                     
*Programador: Alexis Garcia Montero
*Fecha:20/04/2026
 */
package Tortas;

public class Torta {

    public static final int Max_Ingredientes = 3;
    private String nombre;
    private String[] ingredientes;
    private float precio;
    private int numIngredientes;

    public Torta() {
        ingredientes = new String[Max_Ingredientes];
        numIngredientes = 0;
    }

    public Torta(String nombre, String[] ingredientes, float precio) {
        this.nombre = nombre;
        //copiar ingredientes de entrada a lista de ingredientes
        this.numIngredientes = ingredientes.length;
        this.ingredientes = new String[Max_Ingredientes];
        for (int i = 0; i < numIngredientes; i++) {
            this.ingredientes[i] = ingredientes[i];
        }
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        
        if (numIngredientes !=0){
        String listaDeIngredientes = "";
        for (int i=0; i <numIngredientes; i++)
            listaDeIngredientes += ingredientes [i] ==null?"":ingredientes[i] + ",";
        }
        
        return "Torta{" + "nombre=" + nombre + ", listaIngredientes=" 
                + numIngredientes + ", precio=" + precio
                + ", numIngredientes=" + numIngredientes + '}';
    }

   

    /*
    *Agrega un nuevo ingrediente y lanza la exception si ha llegado al numero 
    *maximo de ingredientes
    *
    *
    */
    
    
    public void agregarIngrediente(String ingrediente) throws Exception { 
        if (numIngredientes <=Max_Ingredientes){
            System.out.println("Numero Maximo de ingredientes");
            throw new Exception("Maxima cantidad de ingredientes");
           
        }
        
            ingredientes[numIngredientes] = ingrediente;
        numIngredientes++;
    }
}

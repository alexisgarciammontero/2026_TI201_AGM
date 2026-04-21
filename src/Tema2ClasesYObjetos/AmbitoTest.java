/*
* 2026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Fransisco Javier Montesillo Puente.
*Descripcion: Tema 2.4- Ámbito referente a una clase
*         
*Programador: Alexis Garcia Montero
*Fecha:23/03/2026
 */
package Tema2ClasesYObjetos;

public class AmbitoTest {
    static int i =10;
    
    public static void peor (){
        int i = 50;
    }
    public static void main(String[] args) {
 // esta linea dara un error ya que no podemos ponerle el mismo nombreint i =10;
        System.out.println(i);
        for (int i =0; i<10; i++){
            System.out.println(i);
            System.out.println(i + "" + AmbitoTest.i);
            peor();
        }
        
    }
 
}

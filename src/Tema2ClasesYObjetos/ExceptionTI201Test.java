/*
* 2026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Fransisco Javier Montesillo Puente.
*Descripcion: Tema 2.9- Manejo de Exepciones
*                Clase de prueba  
*Programador: Alexis Garcia Montero
*Fecha:20/02/2026
 */
package Tema2ClasesYObjetos;

public class ExceptionTI201Test {

    public ExceptionTI201Test() {
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        // objeto no asignado
        ExceptionTI201 ex = new ExceptionTI201();
        ex.toString();

        //objeto no asignado
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (Exception i) {
            System.out.println(i.toString());

        }

        int[] arr = new int[2];
        try {
            arr[3] = 2;
        } catch (Exception e) {
            System.out.println(e.toString());

        }

        int ab = 2147483647;
        try {

        } catch (Exception e) {
            ab++;
            System.out.println(ab);

        }
        try {
            //llamar main
        } catch (Exception e) {
            main(args);
        }
    }
}

/*
* 2026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Francisco Javier Montesillo Puente
*Descripcion: Tema 3. Metodos
*   Aplicacción para modelar una torteria
*   Clase prueba torta
*                     
*Programador: Alexis Garcia Montero
*Fecha:20/04/2026
 */
package Tortas;

public class TortaTest {
    public static void main(String[] args) {
        //
        //
        Torta tortaConstructorDefault = new Torta();
        System.out.println(tortaConstructorDefault.toString());
        
        Usuario usuarioConstructorDefault = new Usuario();
        System.out.println(usuarioConstructorDefault.toString());
        
    Torta t1 = new Torta();
    Usuario u1 = new Usuario();
    
    // 2. En lugar de un pedido vacío, le pasas t1 y u1
    // Esto quita el error de compilación
        Pedido pedidoConDatos = new Pedido(u1, t1);
        Orden ordenConstructorDefault = new Orden();
        System.out.println(ordenConstructorDefault.toString());
    }
    
}

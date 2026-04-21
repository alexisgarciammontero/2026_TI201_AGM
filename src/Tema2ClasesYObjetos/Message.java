/*
* 20026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Alexis Garcia Montero
*Descripcion: Tema 1. Entorno de desarrollo
*                     Prueba del entorno de desarrollo y github
*Programador: Alexis Garcia Montero
*Fecha:06/02/2026
 */
package Tema2ClasesYObjetos;


public class Message {
private String content;
    public Message() {
 this.content="";
        
    }
public Message (String Content){
    this.content="";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" + "content=" + content + '}';
    }

}

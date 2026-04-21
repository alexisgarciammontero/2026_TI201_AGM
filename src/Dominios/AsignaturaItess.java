/*
* 20026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Fransisco javier Montesillo Puentes
*Descripcion: Dominio de asignaturas itess
*                     
*Programador: Alexis Garcia Montero
*Fecha:06/02/2026
 -----------------------
 | 	Message
  -----------------------
 | -content: String
  -----------------------
 | - alumno()
 | - asignatura()
 | - periodo()
 | - fichaRegistro()
 | - asignatura (content: String)
 | - getContent(): String
 | - setContent(content: String): void
  -----------------------
*/
package Dominios;

  class AsignaturaItess {

    public AsignaturaItess() {
    }
    private String alumno;
    private String asignatura;
    private String periodo;
    private String fichaRegistro;

    public String getAlumno() {
        return alumno;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getFichaRegistro() {
        return fichaRegistro;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setFichaRegistro(String fichaRegistro) {
        this.fichaRegistro = fichaRegistro;
  
    }
    
    
}

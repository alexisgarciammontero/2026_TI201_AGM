/*
* 20026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Fransisco javier Montesillo Puentes
*Descripcion: Dominio de una Panaderia
*                     
*Programador: Alexis Garcia Montero
*Fecha:06/02/2026
 -----------------------
 |  Panaderia
  -----------------------
 | -content: String
  -----------------------
 | - panAzucar()
 | - panIntegral()
 | - pasteles()
 | -  (content: String)
 | - getDueñoCarrito(): String
 | - setContent(content: String): void
  -----------------------
 */
package Dominios;

public class Panaderia {

    public Panaderia() {
    }
    private String panAzucar;
    private String panIntrgral;
    private String pasteles;

    public String getPanAzucar() {
        return panAzucar;
    }

    public String getPanIntrgral() {
        return panIntrgral;
    }

    public String getPasteles() {
        return pasteles;
    }

    public void setPanAzucar(String panAzucar) {
        this.panAzucar = panAzucar;
    }

    public void setPanIntrgral(String panIntrgral) {
        this.panIntrgral = panIntrgral;
    }

    public void setPasteles(String pasteles) {
        this.pasteles = pasteles;
    }

    @Override
    public String toString() {
        return "Panaderia{" + "panAzucar=" + panAzucar + ", panIntrgral=" + panIntrgral + ", pasteles=" + pasteles + '}';
    }
    
}

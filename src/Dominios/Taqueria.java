/*
* 20026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Fransisco javier Montesillo Puentes
*Descripcion: Dominio de una Taqueria
*                     
*Programador: Alexis Garcia Montero
*Fecha:06/02/2026
 -----------------------
 |  Taqueria
  -----------------------
 | -content: String
  -----------------------
 | - tacos()
 | - salsa()
 | - tacos()
 | - sillas
 | - precio
 | -  (content: String)
 | - getDueñoCarrito(): String
 | - setContent(content: String): void
  -----------------------
 */
package Dominios;

public class Taqueria {

    public Taqueria() {
    }
    private String tacos;
    private String salsas;
    private String sillas;
    private String tortilla; 
    private double precio;


    public void setTacos(String tacos) {
        this.tacos = tacos;
    }

    public void setSalsas(String salsas) {
        this.salsas = salsas;
    }

    public void setSillas(String sillas) {
        this.sillas = sillas;
    }

    public String getTacos() {
        return tacos;
    }

    public String getSalsas() {
        return salsas;
    }

    public String getSillas() {
        return sillas;
    }
  @Override
    public String toString() {
        return "Taqueria{" + "tacos=" + tacos + ", salsas=" + salsas + ", sillas=" + sillas + '}';
    }
}


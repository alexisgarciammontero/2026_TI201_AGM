/*
* 20026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Fransisco javier Montesillo Puentes
*Descripcion: Dominio de Mercado Libre
*                     
*Programador: Alexis Garcia Montero
*Fecha:06/02/2026
 -----------------------
 |  Mercado Libre
  -----------------------
 | -content: String
  -----------------------
 | - usuario()
 | - publicación()
 | - producto()
 | -  (content: String)
 | - getDueñoCarrito(): String
 | - setContent(content: String): void
  -----------------------
 */
package Dominios;

public class MercadoLibre {

    public MercadoLibre() {
    }
    private String usuario;
    private String publicacion;
    private String producto;

    public String getUsuario() {
        return usuario;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public String getProducto() {
        return producto;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    
}

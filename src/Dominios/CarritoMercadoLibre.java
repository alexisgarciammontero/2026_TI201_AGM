/*
* 20026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Fransisco javier Montesillo Puentes
*Descripcion: Dominio de Carrito Mercado Libre
*                     
*Programador: Alexis Garcia Montero
*Fecha:06/02/2026
 -----------------------
 | 	Carrito Mercado Libre
  -----------------------
 | -content: String
  -----------------------
 | - dueñoCarrito()
 | - productos()
 | - precio()
 | - fichaRegistro()
 | -  (content: String)
 | - getDueñoCarrito(): String
 | - setContent(content: String): void
  -----------------------
 */
package Dominios;

public class CarritoMercadoLibre {

    public CarritoMercadoLibre() {
    }
    private String dueñoCarrito;
    private String productos;
    private double precio;

    public String getDueñoCarrito() {
        return dueñoCarrito;
    }

    public String getProductos() {
        return productos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDueñoCarrito(String dueñoCarrito) {
        this.dueñoCarrito = dueñoCarrito;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

 
    
}

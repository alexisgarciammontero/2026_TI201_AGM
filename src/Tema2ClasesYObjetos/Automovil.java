
package Tema2ClasesYObjetos;


public class Automovil {
    private String marca;
    private String cilindrad;
    private String color;

    public Automovil() {
        this.color = "zz";
        this.marca = "";
        this.cilindrad = "00 cc ";
    }

    public Automovil(String marca, String cilindrad, String color) {
        this.marca = marca;
        this.cilindrad = cilindrad;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getCilindrad() {
        return cilindrad;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrad(String cilindrad) {
        this.cilindrad = cilindrad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", cilindrad=" + cilindrad + ", color=" + color + '}';
    }
    
    
}

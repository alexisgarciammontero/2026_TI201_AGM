
package Tortas;

public class Usuario {
  
    private String usuario;

    public String getString() {
        return usuario;
    }

    public void setString(String string) {
        this.usuario = string;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + '}';
    }

    
}

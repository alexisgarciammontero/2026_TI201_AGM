
package Tortas;

public class Pedido {
private Usuario usuario;
    private Torta torta;
    
    public Pedido(Usuario usuario, Torta torta) {
        this.usuario = usuario;
        this.torta = torta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Torta getTorta() {
        return torta;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setTorta(Torta torta) {
        this.torta = torta;
    }

    @Override
    public String toString() {
        return "Pedido{" + "usuario=" + usuario + ", torta=" + torta + '}';
    }
    
}


package Tortas;
   
public class Orden {
    private Pedido pedido;
    private int prioridad;
    private boolean pago;
    private String status;

    public Orden() {
    }

    public Orden(Pedido pedido, int prioridad, boolean pago, String status) {
        this.pedido = pedido;
        this.prioridad = prioridad;
        this.pago = pago;
        this.status = status;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isPago() {
        return pago;
    }

    public String getStatus() {
        return status;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orden{" + "pedido=" + pedido + ", prioridad=" + prioridad + ", pago=" + pago + ", status=" + status + '}';
    }
    
    
}

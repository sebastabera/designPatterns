package factorymethod;

public class PedidoCredito extends Pedido {

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (importe >= 1000.0) && (importe <= 5000.0);
    }

    @Override
    public void paga() {
        System.out.println(
            "El pago del pedido a credito de: " +
            importe + " se ha realizado.");
    }

}

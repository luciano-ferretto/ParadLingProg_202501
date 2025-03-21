package OCP.NoViolation;

public class DescontoComum implements Desconto {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.05;
    }
    
}

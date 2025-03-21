package OCP.NoViolation;

public class DescontoVIP implements Desconto {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.10;
    }
    
}

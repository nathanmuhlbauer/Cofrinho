public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Real - R$" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor;
    }
}

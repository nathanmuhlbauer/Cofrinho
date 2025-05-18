public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro - €" + valor);
    }

    //Conversão do Euro para o Real:

    @Override
    public double converterParaReal() {
        return valor * 6.45;
    }
}

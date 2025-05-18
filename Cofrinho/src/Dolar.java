public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dólar - US$" + valor);
    }

    //Conversão do Dólar para o Real:
   
    @Override
    public double converterParaReal() {
        return valor * 5.91;
    }
}

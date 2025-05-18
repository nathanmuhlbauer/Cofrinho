public abstract class Moeda {
    protected double valor;

    //Valor da moeda:

    public Moeda(double valor) {
        this.valor = valor;
    }

    //Exibe informações das moedas

    public abstract void info();

    //Converte as moedas para o Real:

    public abstract double converterParaReal();

    //Compara as moedas:
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Moeda)) return false;
        Moeda other = (Moeda) obj;
        return this.valor == other.valor && this.getClass() == other.getClass();
    }
}

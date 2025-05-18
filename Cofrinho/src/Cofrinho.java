import java.util.ArrayList;

public class Cofrinho {
   
    //Lista das moedas do Cofrinho:
    
    private ArrayList<Moeda> moedas = new ArrayList<>();

    //Adiciona moeda no cofrinho:
    
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    //Remove moeda do Cofrinho:
    
    public void remover(Moeda moeda) {
        if (!moedas.remove(moeda)) {
            System.out.println("Moeda não encontrada.");
        }
    }

    //Mostra a lista de moedas do Cofrinho:

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio.");
            return;
        }

        for (Moeda m : moedas) {
            m.info();
        }
    }

    //Calcula o total de moedas convertido em Reais:
    
    public double totalConvertido() {
        double total = 0;
        for (Moeda m : moedas) {
            total += m.converterParaReal();
        }
        return total;
    }
}

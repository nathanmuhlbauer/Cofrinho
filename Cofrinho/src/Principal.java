import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;

        //Lista de escolhas do menu principal:

        do {
            System.out.println("\n Bem-vindo ao Cofrinho");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Calcular total em Real");
            System.out.println("0 - Sair");
            System.out.print("Por favor, escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
               
                //Adiciona moeda:

                case 1:
                    adicionarMoeda(scanner, cofrinho);
                    break;
               
               //Remove moeda:

                    case 2:
                    removerMoeda(scanner, cofrinho);
                    break;
                
               //Lista moedas:

                    case 3:
                    cofrinho.listarMoedas();
                    break;
               
                //Calcula o total em reais:
                
                    case 4:
                     double total = cofrinho.totalConvertido();
                    System.out.println("Total em Real: R$" + total);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("Escolha o tipo de moeda:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        int tipo = scanner.nextInt();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        switch (tipo) {
           
            case 1:
                cofrinho.adicionar(new Dolar(valor));
                break;
            case 2:
                cofrinho.adicionar(new Euro(valor));
                break;
            case 3:
                cofrinho.adicionar(new Real(valor));
                break;
            default:
                System.out.println("Tipo inválido.");
        }
    }

    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) {
      
        System.out.println("Escolha o tipo de moeda para remover:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        int tipo = scanner.nextInt();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        switch (tipo) {
           
            case 1:
                cofrinho.remover(new Dolar(valor));
                break;
            case 2:
                cofrinho.remover(new Euro(valor));
                break;
            case 3:
                cofrinho.remover(new Real(valor));
                break;
            default:
                System.out.println("Tipo inválido.");
        }
    }
}

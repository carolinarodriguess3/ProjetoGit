import java.util.Scanner;


class Estoque {

    int arroz = 0;
    int feijao = 0;
    int macarrao = 0;
    int oleo = 0;
    int acucar = 0;
    int cafe = 0;

    void adicionarDoacao(String item, int quantidade){

        switch (item.toLowerCase()){
            case "arroz":
                arroz += quantidade;
                break;
            case "feijao":
                feijao += quantidade;
                break;
            case "macarrao":
                macarrao += quantidade;
                break;
            case "oleo":
                oleo += quantidade;
                break;
            case "acucar":
                acucar += quantidade;
                break;
            case "cafe":
                cafe += quantidade;
                break;
            default:
                System.out.println("Opção inválida!");

        }

    }

    void mostrarEstoque() {

        System.out.println("Estoque atual:");
        System.out.println("Arroz: " + arroz);
        System.out.println("Feijão: " + feijao);
        System.out.println("Macarrão: " + macarrao);
        System.out.println("Óleo: " + oleo);
        System.out.println("Açúcar: " + acucar);
        System.out.println("Café: " + cafe);

    }

}

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        Estoque estoque = new Estoque();

        System.out.print("Oi, meu nome é Maria e o seu? ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + " seja bem vinde!");

        int escolha = 0;

        while (escolha  != 8) {

            System.out.println("O que você vai doar hoje?");

            System.out.println("1- Arroz.");
            System.out.println("2- Feijão.");
            System.out.println("3- Macarrão.");
            System.out.println("4- Óleo.");
            System.out.println("5- Açúcar.");
            System.out.println("6- Café.");
            System.out.println("7- Verificar estoque.");

            System.out.print("Digite aqui a sua escolha: ");
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 6) {
                System.out.print("Digite a quantidade que deseja doar: ");
                int quantidade = scanner.nextInt();


                switch (escolha) {


                    case 1:
                        System.out.println("Você escolheu doar arroz!");
                        estoque.adicionarDoacao("arroz", quantidade);
                        break;

                    case 2:
                        System.out.println("Você escolheu doar feijão!");
                        estoque.adicionarDoacao("feijao", quantidade);
                        break;

                    case 3:
                        System.out.println("Você escolheu doar macarrão!");
                        estoque.adicionarDoacao("macarrao", quantidade);
                        break;

                    case 4:
                        System.out.println("Você escolheu doar óleo!");
                        estoque.adicionarDoacao("oleo", quantidade);
                        break;

                    case 5:
                        System.out.println("Você escolheu doar açúcar!");
                        estoque.adicionarDoacao("acucar", quantidade);
                        break;

                    case 6:
                        System.out.println("Você escolheu doar café!");
                        estoque.adicionarDoacao("cafe", quantidade);
                        break;

                    default:
                }
                System.out.println("Doação registrada com sucesso!");


            } else if (escolha == 7) {

                estoque.mostrarEstoque();
            } else {

                System.out.println("Opção inválida.");

            }
        }
        scanner.close();
    }
}

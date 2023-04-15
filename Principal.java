/*
Exercicio 9
Autor(es): Matheus Mazali Maeda e Mabylly Neres
Data: 25/03/2023
*/
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Padaria padaria1 = new Padaria();
        Padaria padaria2 = new Padaria();
        PadariaCentral padaria3 = new PadariaCentral();
        Scanner leitor = new Scanner(System.in);
        Computador c = new Computador();

        int escolha;

        System.out.println("Menu Padarias!\nInsira o nome da padaria: ");
        padaria1.setNomePadaria(leitor.nextLine());

        System.out.println("Insira o nome do dono da padaria " + padaria1.getNomePadaria() + ": ");
        padaria1.setNomeDono(leitor.nextLine());

        System.out.println("Insira o endereco da padaria " + padaria1.getNomePadaria() + ": ");
        padaria1.setEnderecoPadaria(leitor.nextLine());

        System.out.println("Insira a quantidade de vendas mensais: ");
        padaria1.setVendasMensais(leitor.nextFloat());

        System.out.println("Insira a quantidade de funcionarios: ");
        padaria1.setQuantidadeFuncionarios(leitor.nextInt());

        System.out.println("Insira a quantidade maxima de paes da padaria: ");
        padaria1.setQuantidadeMaxPaes(leitor.nextInt());

        System.out.println("Menu da padaria\n1 - Sortear funcionarios");
        escolha = leitor.nextInt();

        switch(escolha){
            case 1:
                System.out.println("Funcionario sorteado " + padaria1.sortearFuncionarios());
                break;
        }

        c.setMarca("comp1").setMarca("Intel").setData(1,1,2001);
        System.out.println(padaria3.toString());
        System.out.println(padaria3.cozinhaCentral.toString());
    }
}
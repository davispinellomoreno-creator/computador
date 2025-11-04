//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o primeiro objeto Computador usando o construtor padrão
        Computador c1 = new Computador();
        System.out.println("Digite as informações do primeiro computador:");

        System.out.print("Marca: ");
        c1.setMarca(scanner.nextLine());

        System.out.print("Modelo: ");
        c1.setModelo(scanner.nextLine());

        System.out.print("Preço: ");
        c1.setPreco(scanner.nextDouble());

        System.out.print("Processador: ");
        scanner.nextLine(); // Consumindo a quebra de linha pendente
        c1.setProcessador(scanner.nextLine());

        System.out.print("Memória (GB): ");
        c1.setMemoria(scanner.nextInt());

        // Exibindo as informações do primeiro computador
        c1.imprimir();

        // Criando o segundo objeto Computador usando o construtor com parâmetros
        scanner.nextLine(); // Consumindo a quebra de linha pendente
        Computador c2 = new Computador("Dell", "Inspiron", 3500.00, "Intel i7", 16);
        System.out.println("Informações do segundo computador:");
        c2.imprimir();

        scanner.close();
    }
}

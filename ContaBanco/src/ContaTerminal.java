import java.util.Scanner;
import java.util.InputMismatchException;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
    try {
        System.out.println("Por Favor, Digite o numero da sua conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por Favor, Digite o Numero da Agencia!");
        String agencia = scanner.nextLine();

        System.out.println("Por Favor, Digite o Nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("por Favor, Digite o Saldo do Cliente");
        double saldo = scanner.nextDouble();

        String mensagem = "Ola, ".concat(nomeCliente).concat(" Obrigado(a) por Criar Uma Conta Em Nosso Banco, sua agencia e ").concat(agencia).concat(", conta ").concat(Integer.toString(numero)).concat("e seu saldo ").concat(Double.toString(saldo)).concat("Ja esta Disponivel pra saque!!!");
        System.out.println(mensagem);
    } catch (InputMismatchException e) {
        System.out.println("Erro: entrada invalida. por favor, insira seus dados corretamente.");
    } finally {

        scanner.close();
    }

 }
}

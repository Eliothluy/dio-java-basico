import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// Locale, para o padrão norte americano + a classe Scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrada do número da Agencia, com a declaração da variável numeroAgencia
		System.out.print("Por favor, digite o número da Agência: ");
		int numeroAgencia = sc.nextInt();

		// Entrada da Agência, com a declaração da variável agencia
		System.out.print("Por favor, digite a Agência: ");
		String agencia = sc.next();

		// Entrada do nome do cliente, com um nextLine para limpar o "Enter" da entrada
		System.out.print("Por favor, digite o nome do cliente: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();

		// Entrada do saldo da Conta, com a declaração da variável
		System.out.print("Por favor, digite o saldo da conta: ");
		double saldoConta = sc.nextDouble();

		System.out.printf(
				"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n",
				nomeCliente, agencia, numeroAgencia, saldoConta);

		sc.close();
	}

}

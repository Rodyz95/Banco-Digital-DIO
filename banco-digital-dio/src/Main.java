
public class Main {

	public static void main(String[] args) {
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo");
		
		Conta cc = new ContaCorrente(Rodrigo);
		Conta poupanca = new ContaPoupanca(Rodrigo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

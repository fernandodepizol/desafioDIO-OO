import java.util.ArrayList;
import java.util.List;

public class BancoTeste {

	public static void main(String[] args) {
		Banco banco = new Banco("Sicoob");
		
		
		Cliente cliente1 = new Cliente("Fernando Depizol", 34, "Masc.");
		cliente1.setBanco(banco);
		Cliente cliente2 = new Cliente("José", 50, "Masc.");
		cliente2.setBanco(banco);
		Cliente cliente3 = new Cliente("Maria", 30, "Fem.");
		cliente3.setBanco(banco);
		
		
		
		

		
		Conta contaP = new ContaPoupanca(cliente1);
		banco.addContas(contaP);
		
		contaP.depositar(0d);
		contaP.imprimirExtrato();

	
		Conta contaCorrente = new ContaCorrente(cliente3);
		banco.addContas(contaCorrente);
		

		contaCorrente.depositar(500d);
		
		
		
		
		contaCorrente.transferir(100d, contaP);
		contaCorrente.imprimirExtrato();
		contaP.imprimirExtrato();
		
		banco.listarContas();
		
	}
	
}

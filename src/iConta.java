
public interface iConta {
	void sacar(double saque);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
}


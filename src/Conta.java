
public abstract class Conta implements iConta{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente; //composição
	
	
	
	public Conta(Cliente cliente) {
		setAgencia(AGENCIA_PADRAO);
		setNumero(SEQUENCIAL++);
		setCliente(cliente);
		System.out.println("CRIADO A CONTA DE AGÊNCIA: "+ agencia + " NUMERO: "+numero);
		
		
	}
	

	@Override
	public void sacar(double saque) {
		this.saldo = this.saldo - saque;
		System.out.println("FOI SACADO R$"+saque+" DA AGÊNCIA: "+this.agencia +" CONTA "+this.numero +". Propriedade de "+this.cliente.getNome());
		
	}
	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("FOI DEPOSITADO R$"+valor+" NA AGÊNCIA: "+this.agencia +" CONTA "+this.numero +". Propriedade de "+this.cliente.getNome());
		
	}
	@Override
	public void transferir(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	protected void detalhesComuns() {
		System.out.println(String.format("Nome: %s", this.cliente.getNome()));
		System.out.println(String.format("AGÊNCIA: %d", this.agencia));
		System.out.println(String.format("NÚMERO: %d", this.numero));
		System.out.println(String.format("SALDO: %.2f", this.saldo));
		System.out.println("****************************************");
	}
	
	public void listarClientes() {
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}

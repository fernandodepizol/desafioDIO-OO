import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas = new ArrayList<Conta>();
	
	
	public Banco(String nome) {
	
		this.nome = nome;
	}

	public void addContas(Conta conta) {
		contas.add(conta);
	}
	
	public void listarContas() {
		
		for(Conta conta : this.contas) { 
			dadosClientes(conta.getCliente()); 
		}
		
	}
	
	public void dadosClientes(Cliente cliente) {
		System.out.println(String.format("Banco: %s", cliente.getBanco().getNome()));
		System.out.println(String.format("Nome: %s", cliente.getNome()));
		System.out.println(String.format("Sexo: %s", cliente.getSexo()));
		System.out.println(String.format("Idade: %d", cliente.getIdade()));
		System.out.println("-------------------------------------------------");
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void listarClientes() {
		
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}

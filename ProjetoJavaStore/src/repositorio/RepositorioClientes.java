package repositorio;
import data.Pessoa;


public class RepositorioClientes implements InterfaceRepositorio<Pessoa> {

	private static RepositorioClientes instance;
	private static int index = 0;
	private Pessoa[] repClientes;
	
	
	private RepositorioClientes() {
		this.repClientes = new Pessoa[100];
	}
	//Padr�o de projeto Singleton
	public static RepositorioClientes getInstance(){
		if(instance == null){
			instance = new RepositorioClientes();
		}
			return instance;
	}
	
	@Override
	public void cadastar(Pessoa cliente) {
		if(index != 99){
			this.repClientes[index++] = cliente;
		}
	}

	@Override
	public Pessoa buscar(String nome){
		Pessoa clienteRetorno = null;
		for(int i = 0; i < repClientes.length; i++){
			if(repClientes[i].getNome().equals(nome)){
				clienteRetorno = repClientes[i];
			}
		}
		return clienteRetorno;
	}
	
	
	
	public int buscarIndex(String nome) {
		int index = -1;
		for(int i = 0; i < repClientes.length; i++){
			if(repClientes[i].getNome().equals(nome)){
				index = i;
			}
		}
		return index;
	}

	@Override
	public void atualizar(Pessoa cliente) {
		if(cliente != null){
			
		}
	}

	@Override
	public void deletar(Pessoa cliente) {
		if (cliente != null) {
			if(this.buscarIndex(cliente.getNome()) != -1){
				repClientes[this.buscarIndex(cliente.getNome())] = repClientes[index];
				repClientes[index--] = null;
			}
		}
	}

}

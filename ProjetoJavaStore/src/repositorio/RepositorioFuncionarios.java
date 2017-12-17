package repositorio;

import data.Funcionario;
import data.Pessoa;

public class RepositorioFuncionarios implements InterfaceRepositorio<Funcionario> {

	private static RepositorioFuncionarios instance;
	private static int index = 0;
	private Funcionario[] repFuncionarios;
	
	
	private RepositorioFuncionarios() {
		this.repFuncionarios = new Funcionario[100];
	}
	//Padr�o de projeto Singleton
	public static RepositorioFuncionarios getInstance(){
		if(instance == null){
			instance = new RepositorioFuncionarios();
		}
			return instance;
	}
	
	@Override
	public void cadastar(Funcionario funcionario) {
		if(index != 99){
			this.repFuncionarios[index++] = funcionario;
		}
	}

	@Override
	public Funcionario buscar(String nome){
		Funcionario funcionarioRetorno = null;
		for(int i = 0; i < repFuncionarios.length; i++){
			if(repFuncionarios[i].getNome().equals(nome)){
				funcionarioRetorno = repFuncionarios[i];
			}
		}
		return funcionarioRetorno;
	}
	
	
	
	public int buscarIndex(String nome) {
		int index = -1;
		for(int i = 0; i < repFuncionarios.length; i++){
			if(repFuncionarios[i].getNome().equals(nome)){
				index = i;
			}
		}
		return index;
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		if(funcionario != null){
			
		}
	}

	@Override
	public void deletar(Funcionario funcionario) {
		if (funcionario != null) {
			if(this.buscarIndex(funcionario.getNome()) != -1){
				repFuncionarios[this.buscarIndex(funcionario.getNome())] = repFuncionarios[index];
				repFuncionarios[index--] = null;
			}
		}
	}
//teste
}

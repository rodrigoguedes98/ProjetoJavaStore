package repositorio;


public interface InterfaceRepositorio <T>{

	public void cadastar(T object);
	public T buscar(String nome);
	public void atualizar(T object);
	public void deletar(T object);
	
	
	
}

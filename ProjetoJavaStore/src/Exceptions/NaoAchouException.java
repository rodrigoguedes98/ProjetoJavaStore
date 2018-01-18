package Exceptions;

public class NaoAchouException extends Exception{
	public NaoAchouException(String nome) {
		super("Não achamos: " + nome);
	}
	
	
}

package Exceptions;

public class NaoAchouException extends Exception{
	public NaoAchouException(String nome) {
		super("N�o achamos: " + nome);
	}
	
	
}

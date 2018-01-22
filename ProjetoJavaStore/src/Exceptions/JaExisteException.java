package Exceptions;

public class JaExisteException extends Exception {
	private String nome;

	public JaExisteException(String nome) {
		super("Ja existe: " + nome);
		this.nome = nome;
	}
	
	
	
}

package Exceptions;

public class CampoNuloException extends Exception {
  private String string;

public CampoNuloException(String string) {
	super("Preencher campos obrigatórios!");
	this.string = string;
}
}

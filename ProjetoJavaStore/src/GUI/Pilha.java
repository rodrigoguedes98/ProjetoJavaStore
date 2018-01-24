package GUI;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Pilha implements InterfacePilha<JFrame>{
	
	private static Pilha instance;
	
	private ArrayList<JFrame> pilha;

	
	private Pilha(){
		pilha = new ArrayList<JFrame>();
	}
	
	public static Pilha getInstance(){
		if(instance == null){
			instance = new Pilha();
		}
		return instance;
	}
	
	@Override
	public JFrame next() {
		return pilha.get(pilha.size() - 1);
	}

	@Override
	public void add(JFrame tela) {
		pilha.add(pilha.size(), tela);
	}

	@Override
	public boolean hasNext() {
		boolean resultado = false;
		if(pilha.size() != 0){
			resultado = true;
		}
		return resultado;
	}

	@Override
	public void remove() {
			pilha.remove(next());
		}


}
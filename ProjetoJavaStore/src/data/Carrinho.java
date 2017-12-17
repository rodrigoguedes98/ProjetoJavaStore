package data;


public class Carrinho {
	
	private ItemPedido[] item;
	private double valorTotal;
	private static long codigoCarrinho = 1;
	private static int index = 0;
	
	
	public Carrinho() {
		this.item = new ItemPedido[100];
		this.valorTotal = getValorTotal();
		this.codigoCarrinho++;
	}
	
	
	public double getValorTotal(){
		double valorTotal = 0;
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				valorTotal += item[i].getValorTotal();
			}
		}
		return valorTotal;
	}
	
	public void add(ItemPedido itemPedido){
		if(itemPedido != null && !(index > 100)){
			item[index] = itemPedido;
			index++;
		}
	}
	
	public void remover(ItemPedido itemPedido){
		if(this.buscar(itemPedido.getProduto().getNome()) >= 0){
			this.item[this.buscar(itemPedido.getProduto().getNome())] = null;
			index--;
		}
	}		
	
	
	public int buscar(String nome){
		int indexB = -1;
		for(int i = 0 ; i < item.length ; i++){
			if(item[i] != null && item[i].getProduto().getNome().equals(nome)){
				indexB = i;
			}
		}
		return indexB;
	}
	
	
}

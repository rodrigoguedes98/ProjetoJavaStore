package data;

public class Venda {

	
	private Carrinho carrinho;
	private boolean pago;
	
	
	
	public Venda(Carrinho carrinho) {
		this.carrinho = carrinho;
		this.pago = false;
	}



	public boolean isPago() {
		return pago;
	}



	public void setPago(boolean pago) {
		this.pago = pago;
	}



	public Carrinho getCarrinho() {
		return carrinho;
	}
	
	
	
	
	
	
}

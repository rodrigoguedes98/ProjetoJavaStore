package data;


public class Funcionario extends PessoaFisica {

	 private String carteiraTrab;
	 private double salario;
	
	 
	public Funcionario(String nome, String tipo, String endereco, Login login, String CPF, String RG, String carteiraTrab, double salario) {
			super(nome, tipo, endereco, login , CPF, RG);
			this.carteiraTrab = carteiraTrab;
			this.salario = salario;
	}
	
	 public String getCarteiraTrab(){
		 return this.carteiraTrab;
	 }
	 
	 public double getSalario(){
		 return this.salario;
	 }
	 
	 public void setCarteiraTrab(String carteiraTrab){
		 this.carteiraTrab = carteiraTrab;
	 }
	 
	 public void setSalario(double salario){
		 this.salario = salario;
	 }
	 
}

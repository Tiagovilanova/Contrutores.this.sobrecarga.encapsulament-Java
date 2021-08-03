package entities;

public class estoque {

	public String name;
	public double price;
	public int quantity;
	
	public estoque(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	public estoque() {
		//construtor padrão
	}
	
	public estoque(String name, double price) {
		this.name=name;
		this.price=price;
		
	
	}
	
	public double totalvalueinstock() {
		return price*quantity;
	}
	
	public void  addProducts(int quantity) {
		this.quantity+=quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity-=quantity;
	}
	
	public String toString() {
		return name+
				", $ "+
				String.format("%.2f", price)
				+", "
				+quantity
				+" units , Total: $ "
				+String.format("%.2f", totalvalueinstock());
	}
}

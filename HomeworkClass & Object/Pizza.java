
public class Pizza {
	private int size;
	private String toppings;
	private  double price;
	
	public Pizza(){

	}
	
	public Pizza(int size ,String toppings ,double price){
		this.size = size;
		this.toppings = toppings;
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString(){
		String s;
		s = "Size: "+this.size+
				"\nToppings: "+this.toppings+
				"\nPrice: "+this.price;
		return s;
	}

}


public class Rectangle extends Square{
	protected double height;

	public Rectangle(double height ,double width) {
		super(width);
		this.height = height;
	}
	
	public double getArea(){
		return this.width * this.height;
	}

}

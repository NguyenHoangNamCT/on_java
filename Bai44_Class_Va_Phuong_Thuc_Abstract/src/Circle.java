
public class Circle extends Hinh{
	private double r;

	public Circle(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI*r*r;
	}
	
	
}

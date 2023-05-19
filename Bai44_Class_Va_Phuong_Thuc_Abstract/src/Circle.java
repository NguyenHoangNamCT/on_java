
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
	
	public void phuongThucRiengCuaCircle() {
		System.out.println("Day la phuong thuc rieng cua circle");
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	
	
	
}

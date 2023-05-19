
public abstract class Hinh {
	private ToaDo toaDo;

	public Hinh(ToaDo toaDo) {
		super();
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	public abstract double tinhDienTich();
	
	public void hehe() {
		System.out.println("Toi co phuong thuc binh thuong ne hihi");
	}
}

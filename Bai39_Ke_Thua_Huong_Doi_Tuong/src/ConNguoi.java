
public class ConNguoi {
	private String hoTen;
	private int namSinh;
	public ConNguoi(String hoTen, int namSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void an() {
		System.out.println("\tNguoi an ne");
	}
	
	public void ngu() {
		System.out.println("\tNguoi ngu ne");
	}
	
	public void uong() {
		System.out.println("\tNguoi uong ne");
	}
	
}

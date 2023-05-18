package hoa_don_cafe_huong_doi_tuong;

public class HoaDonCafe {
	String ten;
	double giaTren1Kg, khoiLuong;
	
	public HoaDonCafe(String ten, double gia, double kl) {
		this.ten = ten;
		giaTren1Kg = gia;
		khoiLuong = kl;
	}
	
	public double tinhThanhTien() {
		return giaTren1Kg*khoiLuong;
	}
	
	public void giamGia(int phanTram) {
		giaTren1Kg *= (1 - phanTram / 100.0);
	}

}

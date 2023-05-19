
public class MyMain {

	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(3, 5);
		ToaDo td2 = new ToaDo(5, 8);
		ToaDo td3 = new ToaDo(1, 6);
		
//		Hinh hinh = new Hinh(); Không được, bị lỗi vì nó là abstract
		
		Hinh diem = new Diem(td1);
		Hinh rectangle = new Rectangle(td2, 5, 3);
		Hinh circle = new Circle(td3, 5);
		
		double dienTichDiem = diem.tinhDienTich();
		System.out.println("Dien tich diem la: " + dienTichDiem);
		
		double dienTichHinhTron = circle.tinhDienTich();
		System.out.println("Dien tich hinh tron la: " + dienTichHinhTron);
		
		double dienTichHinhChuNhat = rectangle.tinhDienTich();
		System.out.println("Dien tich hinh chu nhat la: " + dienTichHinhChuNhat);
	}

}

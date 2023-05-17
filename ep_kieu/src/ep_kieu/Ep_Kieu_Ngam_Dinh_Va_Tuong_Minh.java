package ep_kieu;

public class Ep_Kieu_Ngam_Dinh_Va_Tuong_Minh {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		//ép kiểu ngầm định. Tức là gán biển có kiểu dữ liệu nhỏ sang một biển có kiểu lớn hơn
		float c = a;
		float d = b;
		
		//ép kiểu tường minh. Tức là gán tuỳ thích nhưng sẽ xảy ra trường hợp mất dữ liệu khi chuyển từ kiểu dữ liệu lớn hơn sang kiểu dữ liệu nhỏ hơn
		int e = (int)3.5f;
		int f = (int)4.1f;
		
		System.out.println("Gia tri cua 2 so ep theo kieu ngam dinh la: " + c + " va " + d);
		System.out.println("Gia tri cua 2 so ep theo kieu tuong minh la: " + e + " va " + f);
	}
}

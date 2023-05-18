
public class MyMain {

	public static void main(String[] args) {
		ConNguoi cn = new ConNguoi("Nguyen Van Nguoi", 2001);
		System.out.println("Doi tuong nguoi:");
		System.out.println("\tHo ten nguoi: " + cn.getHoTen());
		System.out.println("\tNam sinh nguoi: " + cn.getNamSinh());
		cn.an();
		cn.uong();
		cn.ngu();
		
		HocSinh hs = new HocSinh("Nguyen Van Hoc Sinh", 2001, "9A", "Truong Can Tho");
		System.out.println("\nDoi tuong hoc sinh: ");
		System.out.println("\tHo ten hoc sinh: " + hs.getHoTen());
		System.out.println("\tNam sinh hoc sinh: " + hs.getNamSinh());
		hs.an();
		hs.uong();
		hs.ngu();
		hs.lamBaiTap();
	}

}

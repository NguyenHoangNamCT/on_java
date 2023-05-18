
public class MyMain {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("min(3,4): " + mc.timMin(3, 4));
		System.out.println("min(3.2,4): " + mc.timMin(3.2, 4));
		System.out.println("Tong(3,4): " + mc.tinhTong(3,4));
		int a[] = new int[]{1, 2, 3, 4};
		System.out.println("Tong mang a: " + mc.tinhTong(a));

	}

}

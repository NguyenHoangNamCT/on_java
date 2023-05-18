
public class MyClass {
	public int timMin (int a, int b) {
		return a < b ? a : b;
	}
	
	public double timMin(double a, double b) {
		return a < b ? a : b;
	}
	
	public int tinhTong(int a, int b) {
		return a+b;
	}
	
	public int tinhTong(int arr[]) {
		int tong = 0;
		for (int i : arr) {
			tong += i;
		}
		return tong;
	}
}

package phuong_thuc_to_string_cua_doi_tuong;

public class MyMain {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(17, 10, 2001);
		MyDate d2 = new MyDate(17, 10, 2001);
		MyDate d3 = new MyDate(20, 11, 2001);
		
		System.out.println("So sanh d1 voi d2: " + d1.equals(d2));
		System.out.println("So sanh d1 voi d3: " + d1.equals(d3));
		
		System.out.println("Hash code d1: " + d1.hashCode());
		System.out.println("Hash code d2: " + d2.hashCode());
		System.out.println("Hash code d3: " + d3.hashCode());
		
	}

}

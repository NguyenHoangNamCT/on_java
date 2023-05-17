package try_catch_finally;

import java.util.Scanner;

public class try_catch_finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.print("Nhap vao mot so: ");
			n = sc.nextInt();
		} 
		catch (Exception e) {
			System.out.print("Ban nhap sai!");
		}  
		finally {
			System.out.println("\nFinally");
		}
		System.out.print("Gia tri n la: " + n);
	}
}

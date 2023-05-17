package chuyen_thap_phan_sang_nhi_phan;

import java.util.Scanner;

public class chuyen_thap_phan_sang_nhi_phan {

	public static void main(String[] args) {
		System.out.print("Nhap mot so thap phan: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nhiPhan = "";
		while (n!=0) {
			nhiPhan = (n%2) + nhiPhan;
			n /= 2;
		}
		System.out.print("\nSo " + n + " co nhi phan la: " + nhiPhan);

	}

}

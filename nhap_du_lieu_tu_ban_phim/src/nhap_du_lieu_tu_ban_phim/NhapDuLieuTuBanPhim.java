package nhap_du_lieu_tu_ban_phim;

import java.util.Scanner;

public class NhapDuLieuTuBanPhim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap so nguyen duong: ");
		do {
			n = sc.nextInt();
			if(n <= 0)
				System.out.print("\nHay nhap lai mot so lon hon 0: ");
		}while(n <= 0);
		
		System.out.println("\nSo ban vua nhap la: " + n);
		
		sc.nextLine();//xử lý ký tự xuống dòng còn xót lại
		
		System.out.print("Nhap mot chuoi: ");
		String s1 = sc.nextLine();
		System.out.println("\nChuoi ban vua nhap la: " + s1);
		
		System.out.print("\nNhap mot chuoi: ");
		String s2 = sc.nextLine();
		System.out.println("\nChuoi ban vua nhap la: " + s2);
		
		System.out.print("\nNhap mot chuoi: ");
		String s3 = sc.nextLine();
		System.out.println("\nChuoi ban vua nhap la: " + s3);
		
		System.out.print("\nNhap mot so thuc: ");
		float f1 = sc.nextFloat();
		System.out.println("\nSo ban vua nhap la: " + f1);
	}

}

package hoa_don_cafe_huong_doi_tuong;

import java.util.Scanner;

public class Main_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten cafe: ");
		String ten = sc.nextLine();
		System.out.print("\nNhap gia: ");
		double gia = sc.nextDouble();
		System.out.print("\nNhap Trong Luong: ");
		double kl = sc.nextDouble();
		HoaDonCafe hd = new HoaDonCafe(ten, gia, kl);
		System.out.print("\nThanh tien la: " + hd.tinhThanhTien());
		
		hd.giamGia(10);
		System.out.print("\nGia thanh tien sau khi giam 10% lan 1: " + hd.tinhThanhTien());
		
		hd.giamGia(10);
		System.out.print("\nGia thanh tien sau khi giam 10% lan 2: " + hd.tinhThanhTien());
		
	}
}

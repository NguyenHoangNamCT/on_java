
public class MyMain {
	public static void inMang(int a[]) {
		for(int i : a) {
			System.err.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Interface khac voi abstract o cho la phai khai bao chinh lop con
		MayTinhCasio mayTinhCasio = new MayTinhCasio();
		System.out.println("Doi tuong casio");
		System.out.println("\tcasio 3 + 5 = " + mayTinhCasio.cong(3, 5));
		System.out.println("\tcasio 3 - 5 = " + mayTinhCasio.tru(3, 5));
		System.out.println("\tcasio 3 * 5 = " + mayTinhCasio.nhan(3, 5));
		System.out.println("\tcasio 5 / 5 = " + mayTinhCasio.chia(5, 5));
		
		MayTinhVinaCal mayTinhVinaCal = new MayTinhVinaCal();
		System.out.println("Doi tuong vinacal");
		System.out.println("\tvinacal 3 + 5 = " + mayTinhVinaCal.cong(3, 5));
		System.out.println("\tvinacal 3 - 5 = " + mayTinhVinaCal.tru(3, 5));
		System.out.println("\tvinacal 3 * 5 = " + mayTinhVinaCal.nhan(3, 5));
		System.out.println("\tvinacal 5 / 5 = " + mayTinhVinaCal.chia(5, 5));
		
		int mang1[] = new int[] {7,1,2,7,4,3,6,5};
		int mang2[] = new int[] {9,1,8,2,7,3,6,4};
		int mang3[] = new int[] {9,1,8,2,7,3,6,4};
		
		SapXepChon sapXepChon = new SapXepChon();
		System.out.println("Doi tuong sap xep chon: ");
		System.out.print("\tMang1 ban dau: ");
		inMang(mang1);
		sapXepChon.sapXepTang(mang1);
		System.out.print("\tMang1 sau khi sap xep tang: ");
		inMang(mang1);
		sapXepChon.sapXepGiam(mang1);
		System.out.print("\tMang1 sau khi sap xep giam: ");
		inMang(mang1);
		
		SapXepChen sapXepChen = new SapXepChen();
		System.out.println("Doi tuong sap xep chen:");
		System.out.print("\tMang2 ban dau: ");
		inMang(mang2);
		sapXepChen.sapXepTang(mang2);
		System.out.print("\tMang2 sau khi sap xep tang: ");
		inMang(mang2);
		sapXepChen.sapXepGiam(mang2);
		System.out.print("\tMang2 sau khi sap xep giam: ");
		inMang(mang2);
		
		PhanMemMayTinh phanMemMayTinh = new PhanMemMayTinh();
		System.out.println("Doi tuong phan mem may tinh:");
		System.out.println("\tvinacal 3 + 5 = " + phanMemMayTinh.cong(3, 5));
		System.out.println("\tvinacal 3 - 5 = " + phanMemMayTinh.tru(3, 5));
		System.out.println("\tvinacal 3 * 5 = " + phanMemMayTinh.nhan(3, 5));
		System.out.println("\tvinacal 5 / 5 = " + phanMemMayTinh.chia(5, 5));
		System.out.print("\tMang3 ban dau: ");
		inMang(mang3);
		phanMemMayTinh.sapXepTang(mang3);
		System.out.print("\tMang3 sau khi sap xep tang: ");
		inMang(mang3);
		phanMemMayTinh.sapXepGiam(mang3);
		System.out.print("\tMang3 sau khi sap xep giam: ");
		inMang(mang3);
	}
	
	

}

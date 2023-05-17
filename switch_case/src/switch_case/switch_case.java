package switch_case;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mot so trong khoang [2:8]: ");
		int n = sc.nextInt();
		switch(n) {
			case 2: {
				System.out.println("\nBan vua nhap thu 2.");
				break;
			}	
			case 3: {
				System.out.println("\nBan vua nhap thu 3.");
				break;
			}	
			case 4: {
				System.out.println("\nBan vua nhap thu 4.");
				break;
			}	
			case 5: {
				System.out.println("\nBan vua nhap thu 5.");
				break;
			}	
			case 6: {
				System.out.println("\nBan vua nhap thu 6.");
				break;
			}	
			case 7: {
				System.out.println("\nBan vua nhap thu 7.");
				break;
			}	
			case 8: {
				System.out.println("\nBan vua nhap chu nhat.");
				break;
			}	
			default:{ 
				System.out.println("\nThu Khong xac dinh. Ban nhap mot so khong nam trong khoang [2:8]");
			}
		}
	}

}

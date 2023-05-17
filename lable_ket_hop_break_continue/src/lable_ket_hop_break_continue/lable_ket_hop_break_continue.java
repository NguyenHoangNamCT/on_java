package lable_ket_hop_break_continue;

public class lable_ket_hop_break_continue {

	public static void main(String[] args) {
		int i = 0, j = 0;
		System.out.println("Vi du ket hoc lable voi break");
		loopI: for(i = 0; i < 5; i++)
			for(j = 20; j < 25; j ++) {
				if(j >23)
					break loopI;
				System.out.println("Trong vong lap j: i = " + i + ", j =" + j);
			}
		System.out.println("Ngoai chuong trinh: i = " + i + ", j =" + j);
		System.out.println("\nVi du ket hop lable voi continue");

		loopI: for(i = 0; i < 5; i++)
			for(j = 20; j < 25; j++) {
				if(true)
					continue loopI;
				System.out.println("Trong vong lap j: i = " + i + ", j =" + j);
			}
		System.out.println("Ngoai chuong trinh: i = " + i + ", j =" + j);
	}

}

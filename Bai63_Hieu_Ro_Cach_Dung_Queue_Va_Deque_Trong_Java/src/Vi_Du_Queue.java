import java.util.LinkedList;
import java.util.Queue;

public class Vi_Du_Queue {

	public static void main(String[] args) {
		Queue<String> danhSachChuoi = new LinkedList<String>(); 
		danhSachChuoi.offer("11111111111"); //đưa vào queue
		danhSachChuoi.offer("22222222222"); //đưa vào queue
		danhSachChuoi.offer("33333333333"); //đưa vào queue
		danhSachChuoi.offer("44444444444"); //đưa vào queue
		
		while(true) {
			String ten = danhSachChuoi.poll(); //lấy ra và xoá
//			peek()Lấy ra k xoá
			if(ten == null)
				break;
			System.out.println(ten);
		}
		
	}

}

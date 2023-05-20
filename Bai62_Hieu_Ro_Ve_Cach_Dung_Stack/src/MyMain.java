import java.util.Scanner;
import java.util.Stack;

public class MyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stack = new Stack<String>();
		
//		stack.push("Giá trị"); đưa vào stack
//		stack.pop(); Lấy một giá trị ra và xoá khỏi stack
//		stack.peek(); Lấy một giá trị ra nhưng không xoá khỏi stack
//		stack.clear(); Xoá hết các phần tử trong stack
//		stack.contains("Giá trị"); xác định giá trị có tồn tại trong stack hay không
		
//		ví dụ đảo ngược chuổi
		System.out.print("Nhap mot chuoi: ");
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i)+"");
		}
		
		System.out.println(stack.size());
		
		System.out.println("Chuoi sau khi dao: ");
		int size = stack.size();
		for(int i = 0; i < size; i++) {
			System.out.print(stack.pop());
		}
		
	}

}
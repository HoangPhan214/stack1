package stack.dev;

import java.util.Scanner;
import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8. Dùng ngăn xếp để viết chương trình con đổi một số thập phân sang số nhị phân. 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = sc.nextInt();
		sc.close();
		
		Stack<Integer> binaryStack = new Stack<>();
		
		// chuyển đổi số thập phân sang số nhị phân sang số nhị phân bằng ngăn xếp
		while (decimal != 0) {
			int bit = decimal % 2;
			binaryStack.push(bit);
			decimal /= 2;
		}
		// lấy các phân tử trong ngăn xếp và ghép lại để tạo thành số nhị phân
		StringBuilder binary = new StringBuilder();
		while (!binaryStack.isEmpty()) {
			binary.append(binaryStack.pop());
		}
		
		System.out.println("The binary equivalent is: " + binary.toString());
		
	}
}

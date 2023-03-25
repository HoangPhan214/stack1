package stack1.dev;

import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		//Thêm phân tử vào Stack
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(70);
		stack.push(100);
		
		//Đếm số phân tử của stack 
		int size = stack.size();
		System.out.println(" Stack S có " + size + " phần tử ");
		
		//Xuất nội dung phân tử thứ n của Stack S
		int index = 3;
		System.out.println(" Phần tử thứ " + index + " của Stack S là " + stack.get(size - index));
		
		//Xuất nội dung của Stack S
		System.out.println(" Stack S: ");
		for (int i = 0; i < size; i++) {
			System.out.print(stack.get(i) + " ");
		}
		System.out.println();
		
		//Loại bỏ phần tử thứ n của Stack S
		index = 2;
		int removedItem = stack.remove(size - index);
		System.out.println(" Phần tử thứ " + index + " của Stack S được loại bỏ: " + removedItem);
		
		//Xuất nội dung sau khi loại bỏ phần tử
		System.out.print(" Stack S: ");
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}
		System.out.println();
	}
}

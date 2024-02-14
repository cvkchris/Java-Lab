package assignment6_part1_demo;

public class StackDemo {

	public static void main(String[] args) {
		int stack[] = new int[5];
		int t = -1;
		
		Fixed_stk fixed = new Fixed_stk(stack, t);
		fixed.push(1);
		fixed.push(2);
		fixed.push(3);
		fixed.displayStack();
		int element = fixed.pop();
		System.out.println("Popped: "+element);
		fixed.displayStack();
	}
}

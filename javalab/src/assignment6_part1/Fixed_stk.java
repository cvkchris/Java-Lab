package assignment6_part1;

public class Fixed_stk implements Interface_STK {

	private int stack[] = new int[5];
	private int top = -1;

	public Fixed_stk(int[] s, int top) {
		super();
		stack = s;
		this.top = top;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int stack[]) {
		this.stack = stack;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	@Override
	public void push(int element) {
		if(overFlow())
			System.out.println("Stack is Full");
		else
		{
			top = top + 1;
			stack[top] = element;
		}
		
	}

	@Override
	public int pop() {

		int element;
		if (underFlow()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			element = stack[top];
			top = top - 1;
		}
		return element;

	}

	@Override
	public void displayStack() {
		System.out.println("The elements are: ");
		if(underFlow())
			System.out.println("Stack is empty");
		
		for(int i = 0; i<=top; i++)
		{
			System.out.println(stack[i]);
		}

	}

	@Override
	public boolean overFlow() {
		if (top == stack.length - 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean underFlow() {
		if (top == -1)
			return true;
		else
			return false;
	}

}

// 1. Implement a Stack using an array.
// Test Case 1:
// Input: Push 5, 3, 7, Pop
// Output: Stack = [5, 3], Popped element = 7
// Test Case 2:
// Input: Push 10, Push 20, Pop, Push 15
// Output: Stack = [10, 15], Popped element = 20


//Array implementaion
class Stack{
	static final int MAX = 10;
	int top;
	int a[] = new int[MAX];
	
	Stack()
	{
		top = -1;
	}
	//Underflow
	boolean isEmpty()
	{
		return (top < 0);
	}
	//insertion in stack
	boolean push(int x)
	{
		if(top >= (MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		a[++top] = x;
		return true;
	}
	
	//deletion
	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		return a[top--];
		
		
	}
	
	int peek()
	{
		return (top < 0)? -1: a[top]; 
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty stack!");
			
		}
		else
			System.out.println("Stack elements are:");
			show(top);
			System.out.println();
	}
	
	void show(int index)
	{
		if(index < 0 )//base condition
			return;
		System.out.println(a[index] + "");
		show(index-1);//recursive call
	}

	public static void main(String args[])
	{
	    System.out.println("Test Case 1:");
		Stack s1 = new Stack();
		s1.push(5);
		s1.push(3);
		s1.push(7);
		
		s1. display();
		
		s1.pop();
		s1. display();
		
	System.out.println("Test Case 2:");
	Stack s2 = new Stack();
	s2.push(10);
	s2.push(20);
	s2.display();
	
	s2.pop();
	s2.push(15);
	
		
		
	}
}
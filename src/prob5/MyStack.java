package prob5;

import exception.MyException;

public class MyStack {
	int top = 0;
	String[] buffer;

	public MyStack(int top) {
		buffer = new String[top];
	

	}

	public void push(String string) {
		// TODO Auto-generated method stub

		if (top == buffer.length) {
			String[] temp_buffer = new String[buffer.length];
			for (int i = 0; i < buffer.length; i++) {
				temp_buffer[i] = buffer[i];
			}
			buffer = new String[buffer.length * 2];
			
			buffer=temp_buffer;
		} else {
			buffer[top] = string;
			System.out.println(buffer[top]);
			top++;

		}

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top == 0) {
			throw new MyStackExption();
		} else {
			return false;
		}
	}

	public void pop() throws MyStackExption{
		// TODO Auto-generated method stub
		
		if(top<00)
		{
			throw new MyStackExption("sdfsdf");
		}else
		{
			buffer[top]=null;
			System.out.println(buffer[top]);
			top--;
		}
	}
}

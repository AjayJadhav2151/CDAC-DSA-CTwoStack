package CTwoStack;

import java.util.Scanner;

public class StringCtwostack {
	private int top1;
	private int top2;
	private char []stk;
	private int size;
	
	public StringCtwostack() {
		size = 0;
		stk = new char[size];
		top1 = -1; 
		top2 = size; 
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void initstack(int size) {
		this.size = size;
		stk = new char[size];
		top1 = -1; 
		top2 = size; 
	}
	
	public boolean isfull() {
		if(top2==(top1+1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top1==-1 && top2==size) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push1(char value) {
		if(!isfull()) {
			stk[++top1] = value;
		} else {
			System.out.println("Stack is overflow.....");
		}
	}
	
	public void push2(char value) {
		if(!isfull()) {
					stk[--top2] = value;					
		} else {
			System.out.println("Stack is overflow.....");
		}
	}
	
	public void display() {
		if(!isEmpty()) {
			System.out.print("s1 -> ");
			for(int i=top1;i>=0;i--) {
				System.out.print(stk[i]+" ");
			}
			for(int i=top2;i<size;i++) {
				System.out.print(" "+stk[i]);
			}
			System.out.println("<- s2");
		} else {
			System.out.println("Stack is Underflow");
		}
	}
	
}

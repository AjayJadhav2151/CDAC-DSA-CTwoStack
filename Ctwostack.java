package CTwoStack;

import java.util.Scanner;

public class Ctwostack {

	private int top1;
	private int top2;
	private int []stk;
	private int size;
	
	public Ctwostack() {
		size = 0;
		stk = new int[size];
		top1 = -1; 
		top2 = size; 
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void initstack() {
		System.out.println("Enter the size of Stack");
		size = sc.nextInt();
		stk = new int[size];
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
	
	public void push1(int value) {
		if(!isfull()) {
			stk[++top1] = value;
		} else {
			System.out.println("Stack is overflow.....");
		}
	}
	
	public void push2(int value) {
		if(!isfull()) {
			stk[--top2] = value;
		} else {
			System.out.println("Stack is overflow.....");
		}
	}
	
	public int pop1() {
		int value = 0;
		if(!isEmpty() && top1!=-1) {
			value = stk[top1];
			top1--;
		} else {
			System.out.println("Stack is underflow.....");
		}
		return value;
	}
	
	public int pop2() {
		int value = 0;
		if(!isEmpty() && top2 !=size) {
			value = stk[top2];
			top2++;
		} else {
			System.out.println("Stack is underflow.....");
		}
		return value;
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

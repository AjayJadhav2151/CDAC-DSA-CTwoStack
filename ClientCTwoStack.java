package CTwoStack;

import java.util.Scanner;

public class ClientCTwoStack {
	public static void main(String[] args) {
		Ctwostack ct = new Ctwostack();
		Scanner sc = new Scanner(System.in);
		
		int value = 0,option = 0;
		
		do {
			System.out.println("********MENU*****************");
			System.out.println("\n 1.initilize Stack"+
								"\n 2.push stack1"+
								"\n 3.push stack2"+
								"\n 4.pop stack1"+
								"\n 5.pop stack2"+
								"\n 9.display"+
								"\n 0.exit");
			System.out.println("Enter your Choice: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1: {
				ct.initstack();
				System.out.println("New Stack Added...");
				break;
			}
			case 2 :{
				System.out.println("Enter values for stack1: ");
				value = sc.nextInt();
				
				ct.push1(value);
				break;
			}
			case 3 :{
				System.out.println("Enter values for stack2: ");
				value = sc.nextInt();
				
				ct.push2(value);
				break;
			}
			case 4:{
				value = ct.pop1();
				if(value != -1) {
					System.out.println("popped from stack1::"+value);
				}
				break;
			}
			case 5:{
				value = ct.pop2();
				if(value != -1) {
					System.out.println("popped from stack2::"+value);
				}
				break;
			}
			case 9:{
				ct.display();
				break;
			}
			case 0:{
				System.exit(0);
			}
		}
		} while(option != 0);
	}
}

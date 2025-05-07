package CTwoStack;

import java.util.Scanner;

public class ClientStringCtwostack {
	public static void main(String[] args) {
		StringCtwostack sct = new StringCtwostack();
		
Scanner sc = new Scanner(System.in);
		
		int option = 0;
		String value="";
		
		do {
			System.out.println("********MENU*****************");
			System.out.println("\n 1.push"+
								"\n 2.display"+
								"\n 0.exit");
			System.out.println("Enter your Choice: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1 :{
				System.out.println("Enter values for stack1: ");
				value = sc.next();
				
				int size = value.length();
				sct.initstack(size*2);
				System.out.println("New Stack Added...");
				
				for(int i=0;i<value.length();i++) {
				sct.push1(value.charAt(i));
				}
				
				for(int i=value.length()-1;i>=0;i--) {
					sct.push2(value.charAt(i));
				}
				break;
			}
			case 2:{
				sct.display();
				break;
			}
			case 0:{
				System.exit(0);
			}
		}
		} while(option != 0);
	}
}

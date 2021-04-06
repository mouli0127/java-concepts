package Loops;
/**
Req#2:
print all even numbers numbers from 1 to 60

*/
public class Ex3 {
	public static void main(String[] args) {
					for(int i=1; i<=60; i++) {
						if(i%2==0) {
							System.out.println(i);
						}
					}
					
					//approach 2
					/**
					Req:
					print all even numbers numbers from 1 to 60

					*/
					
					for(int i=2; i<=60; i = i+2) {
					System.out.println(i);
					
					}
	}
}
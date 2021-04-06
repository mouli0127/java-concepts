package LoopsInput;

import java.util.Scanner;

/**
Req#1:
take input for size
print hello for size number of times

*/
public class Ex1 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("enter size: ");
int size = sc.nextInt();


for(int i=1; i<=size; i++) {
System.out.println("hello");
}
}
}
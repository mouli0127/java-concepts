package conditions;

import java.util.Scanner;

/**
can we write multiple conditions in one if statement?
--------------------------------------------------------
Yes

ways?
--------------
&& -> block is executed if all conditions are satisfied
|| -> block is executed if atleast one condition is satisfied

take input for
id(int) , age(int) , usertype(string)

perform validations

id should be positive
age should be greater than 18
usertype should be "admin"


if all the data is valid print "valid data"
if any one of the data is invalid print "invalid data".
*/
public class Ex18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter id");
int id = sc.nextInt();

System.out.println("enter age:");
int age = sc.nextInt();

System.out.println("enter usertype");
String userType = sc.next();

if (id < 0 || age < 18 || !userType.equals("admin")) {
System.out.println("invalid data");
} else {
System.out.println("valid data");
}
}
}
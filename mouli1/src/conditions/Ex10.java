package conditions;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// take input for city(string)
		// create a scanner object
		Scanner sc = new Scanner(System.in);

		//take input for city
		System.out.println("enter city name:");
		String city = sc.next();
		//approach#1
		if (city.equals("hyd")) {
			System.out.println("service is provided");
		} else if (city.equals("bangalore")) {
			System.out.println("service is provided");
		} else if (city.equals("chennai")) {
			System.out.println("service is provided");
		} else if (city.equals("mumbai")) {
			System.out.println("service is provided");
		} else {
			System.out.println("service is not provided");
		}
		
		//approach#2
		  switch (city) {
	      case "hyd":
	          System.out.println("service is provided");
	          break;
	      case "chennai":
	          System.out.println("service is provided");
	          break;
	      case "bangalore":
	          System.out.println("service is provided");
	          break;
	      case "mumbai":
	          System.out.println("service is provided");
	          break;
	      default:
	          System.out.println("service is not provided");
	          break;
	  }
			
		//approach#3
		if (city.equals("hyd") || city.equals("chennai") || city.equals("banglore") || city.equals("mumbai")) {
			System.out.println("service provided");
		} else {
			System.out.println("service not provided");
		}
		
	}
}
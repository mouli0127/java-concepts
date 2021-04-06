package While;
/**
  Req:
  print all even numbers numbers  from 1 to 60
 
 */
public class Ex3 {
	public static void main(String[] args) {
		int i=1;
		
		while( i<=60) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
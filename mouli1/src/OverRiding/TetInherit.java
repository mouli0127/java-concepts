package OverRiding;
public class TetInherit {
	public static void main(String[] args) { 
		// CREATE OBJ FOR HDFC.
		System.out.println("************HDFC operations**************");
		Hdfc h = new Hdfc();
		h.createAccount();
		h.processLoan();
		h.createPPF();	 
	}
	
}
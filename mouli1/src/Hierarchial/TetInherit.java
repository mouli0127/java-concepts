	package Hierarchial;
public class TetInherit {
	public static void main(String[] args) { 
		System.out.println("************Icici operations**************");
		// CREATE OBJ FOR ICICI
		Icici i = new Icici();
		i.createAccount();
		i.processLoan();
		i.createPPF();
		
		System.out.println("************SBI operations**************");
		// CREATE OBJ FOR SBI
		SBI s = new SBI();
		s.createAccount();
		s.processLoan();
		s.createPPF();
		
		// CREATE OBJ FOR HDFC.
		System.out.println("************HDFC operations**************");
		Hdfc h = new Hdfc();
		h.createAccount();
		h.processLoan();
		h.createPPF();	 
		
	}
	
}
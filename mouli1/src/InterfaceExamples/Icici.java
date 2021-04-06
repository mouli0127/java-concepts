package InterfaceExamples;
public class Icici  implements RBI , WorldBank{

	@Override
	public void processLoan() {
		System.out.println("icicibank :: processLoan");
		
	}

	@Override
	public void draft() {
		System.out.println("icicibank :: processLoan");
		
	}

	@Override
	public void createAccount() {
		System.out.println("icicibank :: processLoan");
		
	}

	@Override
	public void getKYC() {
		System.out.println("icicibank :: getKYC");
		
	}

	@Override
	public void createPPF() {
		System.out.println("icicibank :: createPPF");
		
	}
}
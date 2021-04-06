package abstractClassExample;
public class Hdfc extends RBI{

	@Override
	public void createPPF() {
		System.out.println("Hdfc :: createPPF");
	}

	@Override
	public void getKyc() {
		System.out.println("Hdfc :: getKyc");
	}

}
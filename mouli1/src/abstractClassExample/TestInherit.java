package abstractClassExample;
public class TestInherit {
public static void main(String[] args) {
	Hdfc h = new Hdfc();
	h.createAccount();
	h.processLoan();
	h.createPPF();
	h.getKyc();
}
}
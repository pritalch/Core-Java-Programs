package interfaceExmpl;

public class Result {

	public static void main(String[] args) {
		HSBCBank hsbc = new HSBCBank();
		hsbc.create();
		hsbc.transfer();
		hsbc.mutualFund();
		hsbc.personalLoan();
		hsbc.homeLoan();

		Demo dm = new Demo();
		dm.sum();
		dm.sum(10);

		System.out.println(USBank.BankName);
	}

}

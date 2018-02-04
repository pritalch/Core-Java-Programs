package Pattern;

public class bankOperation {

	public static void main(String[] args) {
		AccountOpe prital = new AccountOpe();
		prital.insert(1001, "Test", 10000);
		prital.CheuqeBal();
		prital.WithDraw(5000);
		prital.CheuqeBal();
		prital.Deposite(10000);
		prital.CheuqeBal();
	}

}

class AccountOpe {
	int AccNo;
	String Name;
	float Balance;

	void insert(int ano, String Name, float bal) {
		AccNo = ano;
		this.Name = Name;
		Balance = bal;
	}

	void CheuqeBal() {
		System.out.println("Balance is:" + Balance);
	}

	void WithDraw(float Amount) {
		if (Balance < Amount) {
			System.out.println("Insufficient Balance");
		} else {
			Balance = Balance - Amount;
			System.out.println("Withdrawl" + ":" + Amount);
		}
	}

	void Deposite(float Amount) {
		Balance = Balance + Amount;
		System.out.println("Deposited" + ":" + Amount);
	}
}
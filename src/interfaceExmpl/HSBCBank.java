package interfaceExmpl;

public class HSBCBank implements USBank, ASUBank{

	// Methods of HSBCBank class
	public void mutualFund(){
		System.out.println("HSBC---Mutual fund");
	}
	
	public void personalLoan(){
		System.out.println("HSBC---Personal loan");
	}
	
	//Methods of USBank interface
	
	public void create(){
		System.out.println("USBank---Create");
	}
	
	public void transfer(){
		System.out.println("USBank---Transfer");
	}
	
	//Methid of AUSBank
    public void homeLoan(){
    	System.out.println("ASUBAnk---HomeLoan");
    }
      
}

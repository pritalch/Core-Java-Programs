package Pattern;

public class reversetra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		for(int i=0; i<num; i++)
		{
		    for(int j=num; j>i; j--)
		    {
		        System.out.print(" ");
		    }
		    for (int K = 0; K <=i; K++) {
		    	System.out.print("*");
			}
		    System.out.println("");	   
	}
	}
}


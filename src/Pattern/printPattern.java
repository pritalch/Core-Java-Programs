package Pattern;

public class printPattern {

	public static void main(String[] args) {		
		int num=6;
		int mid=num/2;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				//if(row==1||col==1||row==num||col==num) //To print O
				//if(row==1||col==1||row==mid||col==num||row==num) //To print A or B
				//if(row==1||col==1||row==num) //To print C
				//if(row==1||col==1||row==num||row==mid) // To print E
				//if(row==1||col==1||row==mid) //To print F
				//if(col==1||col==num||row==mid) // To print H
				//if(col==1||row==num) // To print L
				//if(row==1||col==mid) // To print T
				if(row==1||row==num||col==mid) // To print I
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}



//A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z

//Completed pattern:   A,B,C,D,E,F,H,I,L,N,O,T,U,Z,M,P,K,X,W,S,G,J,Q,R,Y
		
//Not Universal: K
		
//Remaining pattern: V

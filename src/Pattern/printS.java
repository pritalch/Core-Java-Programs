package Pattern;

public class printS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int a=6;
	       
	       for(int i=1;i<=a;i++)
	       {
	       for(int j=1;j<=a;j++)
	       {
	           if(i==1||i==(a/2)||i==a)
	           {
	            System.out.print("*\t");   
	           }
	           else
	           {
	               if(j==1 || j==a)
	               {
	                     if(j==1 && i<a/2)
	                     {
	                      System.out.print("*");     
	                     }
	                     else
	                     {
	                       System.out.print("");  
	                     }
	                     if(i>a/2&&j==a)
	                     {
	                        System.out.print("*");     
	                     }
	                     else
	                     {
	                       System.out.print("");  
	                     }
	                     
	               }
	                  System.out.print("\t");   
	           }
	       }
	           System.out.println("\n");
	       }
	       
	       }
	       
	   }
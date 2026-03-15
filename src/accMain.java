import java.util.*;

public class accMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ch=0;
		bankInfo b=new bankInfo();
		Account[] accObj=null;
		Account copyObj=null;
		
			do {
				
						System.out.println(" Enter 1-Create 2-Display 3-Search 4-Transaction");
						int n=scan.nextInt();
						
						switch(n) {
						
						case 1:
							
							accObj=b.create();
							
							break;
						case 2:
							
							b.display(accObj);
							
							break;
						case 3:

							System.out.println("Enter the Account Number to Search...");
							int accNo=scan.nextInt();
							
						
							copyObj=b.searchAccount(accObj,accNo);
							
							if(copyObj!=null) {
								
								System.out.println(" Account found .....Success...!");
								
							}
							else {
								
								System.out.println(" Invalid Details...");
								
							}
							break;
							
						case 4:
							
							System.out.println(" Enter Account number For Transaction...");
							accNo=scan.nextInt();
							

							System.out.println(" Enter Password...");
							String pass=scan.next();
					
							
							
							copyObj=b.searchAccount(accObj, accNo);
							
							
							if(copyObj!=null ) {
								
							
								if(copyObj.getPass().equalsIgnoreCase(pass)) {
									
								
								System.out.println(" Enter the Amount to perform transaction...");
									float amt=scan.nextFloat();
									
									b.performTrans(copyObj,amt);
								}
								else {
									
									System.out.println(" Invalid password");
								}	
							}
							
							break;
						}
						
						
				System.out.println(" Enter 1 to Continue...");
				ch=scan.nextInt();
			}while(ch==1);
	}
}

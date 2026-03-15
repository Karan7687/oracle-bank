import java.util.*;
public class bankInfo {

		Scanner scan=new Scanner(System.in);
		String ch2=null;
					public Account[] create() {
						
						System.out.println("Enter the Number of Accounts ...");
						int n=scan.nextInt();
						
						Account arr[]=new Account[n];
						
						for(int i=0;i<arr.length;i++) {
							
							System.out.println(" Enter the Account Number");
							int accNo=scan.nextInt();
							System.out.println(" Enter Password ...");
							String pass=scan.next();
							System.out.println(" Enter the Account Type");
							String accType=scan.next();
							System.out.println(" Enter the AccbAl");
							float accBal=scan.nextFloat();
						
							
							arr[i]=new Account(accNo,pass,accType,accBal);
							
							
						}
						return arr;
					}
							
							public Account searchAccount(Account accObj[],int accNo) {
								Account temp=null;
								
								for(int i=0;i<accObj.length;i++) {
									
									if(accObj[i].getAccNo()==accNo) {
										
										temp=accObj[i];
										
									}
									
								}
								
								return temp;
							}
							
							public void display(Account arr[]) {
								
								for(int i=0;i<arr.length;i++) {
									
									System.out.println("================== Account Details ================");
									System.out.println(" Account Number :"+arr[i].getAccNo());
									System.out.println(" Account Type :"+arr[i].getAccType());
									System.out.println(" Account Balance :"+arr[i].getAccBal());
									
								}
								
					}
							public void performTrans(Account acc,float amt) {
								
								do {
								System.out.println(" 1- Deposit 2-Withdraw");
								int n=scan.nextInt();
								Transaction t=new Transaction();
								
										if(n==1) {
											
											t.deposit(acc,amt);
											
										}	
										else if(n==2) {
											
											t.withdraw(acc,amt);
											
										}
										System.out.println(" Enter a to Continue Transaction...");
										ch2=scan.next();
							}while(ch2=="a");
					
							}
					
}

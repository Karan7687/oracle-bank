
public class Transaction {
	
		
		
						public void deposit(Account acc,float amt) {
							
							float bal=acc.getAccBal();
							float remBal=bal+amt;
							acc.setAccBal(remBal);
							System.out.println(" Success ...!");
							
						}
						public void withdraw(Account acc,float amt) {
							
							float bal=acc.getAccBal();
							float remBal=bal-amt;
							if(remBal<0) {
								
								System.out.println(" Insufficient Funds...");
							}
							else {
								
								
							
							acc.setAccBal(remBal);
							System.out.println(" Success ...!");
							
							}
						}
}

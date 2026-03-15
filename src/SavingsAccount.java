
public class SavingsAccount extends Account{

		
						private double interestRate;

						public SavingsAccount(int accNo, String pass, String accType, float accBal,
								double interestRate) {
							super(accNo, pass, accType, accBal);
							this.interestRate = interestRate;
						}

						public double getInterestRate() {
							return interestRate;
						}

						public void setInterestRate(double interestRate) {
							this.interestRate = interestRate;
						}
						
						
}


public class CurrentAccount extends Account{

						private String compName;

						public CurrentAccount(int accNo, String pass, String accType, float accBal, String compName) {
							super(accNo, pass, accType, accBal);
							this.compName = compName;
						}

						public String getCompName() {
							return compName;
						}

						public void setCompName(String compName) {
							this.compName = compName;
						}
						
						
}

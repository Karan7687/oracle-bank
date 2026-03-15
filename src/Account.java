public class Account {

	
				private int accNo;
				private String pass;
				private String accType;
				private float accBal;
				public Account(int accNo,String pass, String accType, float accBal) {
					super();
					this.accNo = accNo;
					this.pass=pass;
					this.accType = accType;
					this.accBal = accBal;
				}
				public int getAccNo() {
					return accNo;
				}
				public void setAccNo(int accNo) {
					this.accNo = accNo;
				}
				public String getPass() {
					
					return pass;
				}
				public void setPass(String pass) {
					
					this.pass=pass;
				}
				
				public String getAccType() {
					return accType;
				}
				public void setAccType(String accType) {
					this.accType = accType;
				}
				public float getAccBal() {
					return accBal;
				}
				public void setAccBal(float accBal) {
					this.accBal = accBal;
				}
				
				
}

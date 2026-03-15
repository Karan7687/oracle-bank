
public class Customer {

						private int custId;
						private String custName;
						private String mobNo;
						private Address add;
						private Transaction trans;
						private Account acc;
						public Customer(int custId, String custName, String mobNo, Address add, Transaction trans,
								Account acc) {
							super();
							this.custId = custId;
							this.custName = custName;
							this.mobNo = mobNo;
							this.add = add;
							this.trans = trans;
							this.acc = acc;
						}
						public int getCustId() {
							return custId;
						}
						public void setCustId(int custId) {
							this.custId = custId;
						}
						public String getCustName() {
							return custName;
						}
						public void setCustName(String custName) {
							this.custName = custName;
						}
						public String getMobNo() {
							return mobNo;
						}
						public void setMobNo(String mobNo) {
							this.mobNo = mobNo;
						}
						public Address getAdd() {
							return add;
						}
						public void setAdd(Address add) {
							this.add = add;
						}
						public Transaction getTrans() {
							return trans;
						}
						public void setTrans(Transaction trans) {
							this.trans = trans;
						}
						public Account getAcc() {
							return acc;
						}
						public void setAcc(Account acc) {
							this.acc = acc;
						}
						
						

}
						

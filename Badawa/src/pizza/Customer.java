package pizza;

class Customer{
	private int custNo;
	private String custName ;
	private String custAddr ;
	private static int billNo;
	static {
		billNo=0;
	}
	
	// customer constructor for initialization
	
	public Customer(String custName, String custAddr) {
		super();
		this.custNo = ++billNo;
		this.custName = custName;
		this.custAddr = custAddr;
	}
 
 
//	public Customer() {
//		
//		custNo=0;
//		custName="Default Name";
//		custAddr="Default Address";
//	}
	
	
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	public void display() {
        // Display customer details
        System.out.println("Customer Name \t\t: " + custName);
        System.out.println("Customer Address: \t" + custAddr);
    }
	
	public static void printBillNo()
	{
		System.out.print("Bill No :"+billNo);
	}
	
	
}
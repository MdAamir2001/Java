package com.pune.pizza;
import java.util.Date;

public class Order implements Deliverable {
	private int orderNo;
	private Date orderDate;
	private int cost;
	private String custName ;
	private String custAddress;
	private int approxDistance;
	
	public int getOrderNo() {
		return orderNo;
	}
 
 
 
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
 
 
 
	public Date getOrderDate() {
		return orderDate;
	}
 
 
 
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
 
 
 
	public int getCost() {
		return cost;
	}
 
 
 
	public void setCost(int cost) {
		this.cost = cost;
	}
 
 
 
	public String getCustName() {
		return custName;
	}
 
 
 
	public void setCustName(String custName) {
		this.custName = custName;
	}
 
 
 
	public String getCustAddress() {
		return custAddress;
	}
 
 
 
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
 
 
 
	public int getApproxDistance() {
		return approxDistance;
	}
 
 
 
	public void setApproxDistance(int approxDistance) {
		this.approxDistance = approxDistance;
	}
 
 
 
	public Order(int orderNo, Date orderDate, int cost, String custName, String custAddress, int approxDistance) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.cost = cost;
		this.custName = custName;
		this.custAddress = custAddress;
		this.approxDistance = approxDistance;
	}
 
	
 
	@Override
	public boolean delivery() {
		
		return approxDistance<=deliveryAreaLimit;
	}

}

package com.autowiring;

public class Manager 
{
//	private int managerId;
//	private String managerName;
//	private long managerNumber;
//	
	private Address address;

//	public int getManagerId() {
//		return managerId;
//	}
//
//	public void setManagerId(int managerId) {
//		this.managerId = managerId;
//	}
//
//	public String getManagerName() {
//		return managerName;
//	}
//
//	public void setManagerName(String managerName) {
//		this.managerName = managerName;
//	}
//
//	public long getManagerNumber() {
//		return managerNumber;
//	}
//
//	public void setManagerNumber(long managerNumber) {
//		this.managerNumber = managerNumber;
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Manager [address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerNumber=" + managerNumber
//				+ ", address=" + address + "]";
//	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(Address address) {
		super();
		this.address = address;
	}
	
	

}

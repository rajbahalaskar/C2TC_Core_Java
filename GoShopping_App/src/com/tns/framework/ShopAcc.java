package com.tns.framework;

public  class ShopAcc 
{
	
	protected	int accNo;
	protected String accNm;
	private float charges;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	
	public float getCharge() {
		return getCharges();
	}
	public void setAccNo(float charges) {
		this.setCharges(charges);
	}
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm=accNm;
	}
	
	
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.setCharges(charges);
	}
	
	public void bookProduct(float charges )
	{
		System.out.println("Product booked and Charges are: "+charges);
	}

	public void items(float charges)
	{
		System.out.println("Iteam are delivered with  Charges: "+charges);
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}

	
}

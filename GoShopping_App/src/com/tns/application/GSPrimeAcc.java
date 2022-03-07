package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc  

{
	
	private static final float charges=0;
	public float getCharges()
	{
		return charges;
	}

	 GSPrimeAcc()
	
	{
		super(accNo , accNm , charges , isPrime);
	}

	public void bookProduct(float charges)
	{
		System.out.println("Dear prime user,your product charge is: "+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc[]";
	}

	
	
	
}

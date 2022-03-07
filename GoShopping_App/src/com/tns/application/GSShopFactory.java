package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.ShopFactory;
public  class GSShopFactory implements ShopFactory
{

	@Override
public  GSPrimeAcc PrimeAcc getNewPrimeAccount(int accNo, String accNm , float charges, boolean isPrime )
	{
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}
	
	@Override
	public  GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(accNo , accNm, deliveryCharge);
		return gsnormal;
	}
}

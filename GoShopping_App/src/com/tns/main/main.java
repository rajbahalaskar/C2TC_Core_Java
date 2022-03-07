package com.tns.main;
import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
public class main {

	public static void main(String[] args) 
	{
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(1, "Rajesh", 500, true);
		gssfactory.getNewNormalAccount(2, "Pavan", 500, 50);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharge();
		gsprime.bookProduct(500);
		gsprime.toString();
		
		
		
		GSNormalAcc gsnormal = new GSNormalAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharge();
		gsnormal.getDeliveryCharge();
		gsprime.bookProduct(500);
		gsprime.toString();
		

	}

}

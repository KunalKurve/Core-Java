package day3.Interface;

import day3.Manager;
import day3.SalariedEmployee;
import day3.SalesManager;

public class Payroll 
{
	public void processTax(TaxPayers payer) 
	{
		System.out.println("Tax Payable : " + payer.calculateTax());
	}
	
	public static void main(String[] args) 
	{
		Payroll portal = new Payroll();
		SalariedEmployee esal1 = new SalariedEmployee(556,"Salaried Employee",10);
		Consultant esal2 = new Consultant(556,"Consultant",10);
		System.out.println(esal1);
		System.out.println(esal2);
		portal.processTax(esal1);
		portal.processTax(esal2);
		
		Consultant c = new Consultant(123,"Consultant",120000);
		Manager m = new Manager(432,"Manager",8000);
		System.out.println(c);
		System.out.println(m);
		
		TaxPayers [] emp = new TaxPayers[4];
		emp[0] = new SalesManager(222,"Sales Manager 1",1000,2000);
		emp[1] = new Manager(333," Manager",3000);
		emp[2] = new Consultant(383,"Consultant",3000);
		emp[3] = new SalesManager(212,"Sales Manager 2",1000,50000);

		for (TaxPayers e:emp)
		{
			
		portal.processTax(e);
		}
	}
//	possible exceptions when write withdraw method
}
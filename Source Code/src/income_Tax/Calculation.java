package income_Tax;

public class Calculation {
	
	double totalTaxableIncome;
	double taxcredit;
	double tax;
	double finalTax;
	double gross;
	double benefit;
	double invest;
	double taxableBasic;
	double taxableHouse;
	double taxableTransport;
	double taxableMedical;
	double taxableOther1;
	
//	Authentication a = new Authentication();
//	Input01 i1 = new Input01();
//	Input02 i2 = new Input02();
//	Input03 i3 = new Input03();
	
	public Calculation f() {
		return this;
	}
	
	public Calculation(Authentication a, Input01 i1, Input02 i2, Input03 i3)
	{
		String name = a.name;
		int age = a.age;
		int sex = a.sex;
		int quota = a.quota;
		int residence = a.residence;
		
		double basic = i1.basic;
		double house = i1.house;
		double transport = i1.transport;
		double medical = i1.medical;
		double other1 = i1.other;
		
		double festival = i2.festival;
		double provident = i2.provident;
		double performance = i2.performance;
		double leave = i2.leave;
		double other2 = i2.other;
		
		double insurance = i3.insurance;
		double savings = i3.savings;
		double share = i3.share;
		double other3 = i3.other;
		
		//Taxable Income calculation
		
		taxableBasic = basic * 12;
		
		if(house <= 25000)
			taxableHouse = 0.0;
		else
		{
			double x = house - 25000;
			taxableHouse = x * 12;
		}

		if(transport <= 2500)
			taxableTransport = 0.0;
		else
		{
			double x = transport - 2500;
			taxableTransport = x * 12;
		}
		
		if(medical <= 10000)
			taxableMedical = 0.0;
		else
		{
			double x = house - 10000;
			taxableMedical = x * 12;
		}
		
		taxableOther1 = other1 * 12;
		
		totalTaxableIncome = taxableBasic + taxableHouse + taxableTransport + taxableMedical + taxableOther1 + festival + provident + performance + leave + other2;
	
		//Tax Credit calculation
		
		double totalInvest = insurance + savings + share + other3;
		
		if(totalInvest > 0.0 && totalInvest <= 15000000)
		{
			double x = totalTaxableIncome * 0.25;
			
			if(totalTaxableIncome <= 1000000)
				taxcredit = x * 0.15;
			else if(totalTaxableIncome > 1000000 && totalTaxableIncome <= 3000000)
				taxcredit = 250000 * 0.15 + (x - 250000) * 0.12;
			else
				taxcredit = 250000 * 0.15 + 500000 * 0.12 + (x - 750000) * 0.10;
		}
		else
			taxcredit = 0.0;
		
		//Tax calculation
		
		if(sex == 0 && age <= 65)
		{
			//male <= 65 without quota
			if(quota == 0)
			{
				if(totalTaxableIncome <= 250000)
					tax = 0.0;
				else if(totalTaxableIncome > 250000 && totalTaxableIncome <= 650000)
				{
					double dif = totalTaxableIncome - 250000;
					tax = dif * 0.10;
				}
				else if(totalTaxableIncome > 650000 && totalTaxableIncome <=1150000)
				{
					double dif = totalTaxableIncome - 650000;
					tax = 400000 * 0.10 + dif * .15;
				}
				else if(totalTaxableIncome > 1150000 && totalTaxableIncome <= 1750000)
				{
					double dif = totalTaxableIncome - 1150000;
					tax = 400000 * 0.10 + 500000 * 0.15 + dif * 0.20;
				}
				else if(totalTaxableIncome > 1750000 && totalTaxableIncome <= 4750000)
				{
					double dif = totalTaxableIncome - 1750000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + dif * .25;
				}
				else
				{
					double dif = totalTaxableIncome - 4750000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + 3000000 * .25 + dif * 0.30;
				}
			}
			
			//male <= 65 with freedom fighter quota
			else if(quota == 1)
			{
				if(totalTaxableIncome <= 425000)
					tax = 0.0;
				else if(totalTaxableIncome > 425000 && totalTaxableIncome <= 825000)
				{
					double dif = totalTaxableIncome - 425000;
					tax = dif * 0.10;
				}
				else if(totalTaxableIncome > 825000 && totalTaxableIncome <=1325000)
				{
					double dif = totalTaxableIncome - 825000;
					tax = 400000 * 0.10 + dif * .15;
				}
				else if(totalTaxableIncome > 1325000 && totalTaxableIncome <= 1925000)
				{
					double dif = totalTaxableIncome - 1325000;
					tax = 400000 * 0.10 + 500000 * 0.15 + dif * 0.20;
				}
				else if(totalTaxableIncome > 1925000 && totalTaxableIncome <= 4925000)
				{
					double dif = totalTaxableIncome - 1925000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + dif * .25;
				}
				else
				{
					double dif = totalTaxableIncome - 4925000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + 3000000 * .25 + dif * 0.30;
				}
			}
			
			//male <= 65 with autistic quota
			else
			{
				if(totalTaxableIncome <= 400000)
					tax = 0.0;
				else if(totalTaxableIncome > 400000 && totalTaxableIncome <= 800000)
				{
					double dif = totalTaxableIncome - 400000;
					tax = dif * 0.10;
				}
				else if(totalTaxableIncome > 800000 && totalTaxableIncome <=1300000)
				{
					double dif = totalTaxableIncome - 800000;
					tax = 400000 * 0.10 + dif * .15;
				}
				else if(totalTaxableIncome > 1300000 && totalTaxableIncome <= 1900000)
				{
					double dif = totalTaxableIncome - 1300000;
					tax = 400000 * 0.10 + 500000 * 0.15 + dif * 0.20;
				}
				else if(totalTaxableIncome > 1900000 && totalTaxableIncome <= 4900000)
				{
					double dif = totalTaxableIncome - 1900000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + dif * .25;
				}
				else
				{
					double dif = totalTaxableIncome - 4900000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + 3000000 * .25 + dif * 0.30;
				}
			}
		}
		
		//female or people older than 65
		else
		{
			//female or > 65 without quota
			if(quota == 0)
			{
				if(totalTaxableIncome <= 300000)
					tax = 0.0;
				else if(totalTaxableIncome > 300000 && totalTaxableIncome <= 700000)
				{
					double dif = totalTaxableIncome - 300000;
					tax = dif * 0.10;
				}
				else if(totalTaxableIncome > 700000 && totalTaxableIncome <=1200000)
				{
					double dif = totalTaxableIncome - 700000;
					tax = 400000 * 0.10 + dif * .15;
				}
				else if(totalTaxableIncome > 1200000 && totalTaxableIncome <= 1800000)
				{
					double dif = totalTaxableIncome - 1200000;
					tax = 400000 * 0.10 + 500000 * 0.15 + dif * 0.20;
				}
				else if(totalTaxableIncome > 1800000 && totalTaxableIncome <= 4800000)
				{
					double dif = totalTaxableIncome - 1800000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + dif * .25;
				}
				else
				{
					double dif = totalTaxableIncome - 4800000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + 3000000 * .25 + dif * 0.30;
				}
			}
			
			//female or > 65 with freedom fighter quota
			else if(quota == 1)
			{
				if(totalTaxableIncome <= 425000)
					tax = 0.0;
				else if(totalTaxableIncome > 425000 && totalTaxableIncome <= 825000)
				{
					double dif = totalTaxableIncome - 425000;
					tax = dif * 0.10;
				}
				else if(totalTaxableIncome > 825000 && totalTaxableIncome <=1325000)
				{
					double dif = totalTaxableIncome - 825000;
					tax = 400000 * 0.10 + dif * .15;
				}
				else if(totalTaxableIncome > 1325000 && totalTaxableIncome <= 1925000)
				{
					double dif = totalTaxableIncome - 1325000;
					tax = 400000 * 0.10 + 500000 * 0.15 + dif * 0.20;
				}
				else if(totalTaxableIncome > 1925000 && totalTaxableIncome <= 4925000)
				{
					double dif = totalTaxableIncome - 1925000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + dif * .25;
				}
				else
				{
					double dif = totalTaxableIncome - 4925000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + 3000000 * .25 + dif * 0.30;
				}
			}
			
			//female or > 65 with autistic quota
			else
			{
				if(totalTaxableIncome <= 400000)
					tax = 0.0;
				else if(totalTaxableIncome > 400000 && totalTaxableIncome <= 800000)
				{
					double dif = totalTaxableIncome - 400000;
					tax = dif * 0.10;
				}
				else if(totalTaxableIncome > 800000 && totalTaxableIncome <=1300000)
				{
					double dif = totalTaxableIncome - 800000;
					tax = 400000 * 0.10 + dif * .15;
				}
				else if(totalTaxableIncome > 1300000 && totalTaxableIncome <= 1900000)
				{
					double dif = totalTaxableIncome - 1300000;
					tax = 400000 * 0.10 + 500000 * 0.15 + dif * 0.20;
				}
				else if(totalTaxableIncome > 1900000 && totalTaxableIncome <= 4900000)
				{
					double dif = totalTaxableIncome - 1900000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + dif * .25;
				}
				else
				{
					double dif = totalTaxableIncome - 4900000;
					tax = 400000 * 0.10 + 500000 * 0.15 + 600000 * 0.20 + 3000000 * .25 + dif * 0.30;
				}
			}
		}
		
		double d = tax - taxcredit;
		
		//Final Tax to pay
		
		if(residence == 0 || residence == 1 || residence == 2)
		{
			if(totalTaxableIncome != 0.0)
			{
				if(d <= 5000)
					finalTax = 5000;
				else
					finalTax = d;
			}
			else
				finalTax = 0.0;
		}
		else if(residence == 12)
		{
			if(totalTaxableIncome != 0.0)
			{
				if(d <= 3000)
					finalTax = 3000;
				else
					finalTax = d;
			}
			else
				finalTax = 0.0;
		}
		else
		{
			if(totalTaxableIncome != 0.0)
			{
				if(d <= 4000)
					finalTax = 4000;
				else
					finalTax = d;
			}
			else
				finalTax = 0.0;
		}
		
	}

}

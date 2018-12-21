class Government{
//initialized variables
private double taxRate;
private int militarySpending;
private int educationSpending;
private int healthCareSpending;
private int infrastructureSpending;
private int federalReserve;


//constructer
public Government(double taxRate, int militarySpending, int educationSpending, int healthCareSpending, int infrastructureSpending){
this.taxRate = taxRate;
this.setMilitarySpending(militarySpending);
this.setEducationSpending(educationSpending);
this.setHealthCareSpending(healthCareSpending);
this.setInfrastructureSpending(infrastructureSpending);
setFederalReserve(169000000);
}



//getters and setters

public int getFederalReserve() {
	return federalReserve;
}

public void setFederalReserve(int federalReserve) {
	this.federalReserve = federalReserve;
}

public int getInfrastructureSpending() {
	return infrastructureSpending;
}

public void setInfrastructureSpending(int infrastructureSpending) {
	this.infrastructureSpending = infrastructureSpending;
}

public int getHealthCareSpending() {
	return healthCareSpending;
}

public void setHealthCareSpending(int healthCareSpending) {
	this.healthCareSpending = healthCareSpending;
}

public int getEducationSpending() {
	return educationSpending;
}

public void setEducationSpending(int educationSpending) {
	this.educationSpending = educationSpending;
}

public int getMilitarySpending() {
	return militarySpending;
}

public void setMilitarySpending(int militarySpending) {
	this.militarySpending = militarySpending;
}

public double getTaxRate() {
	return taxRate;
}

public void setTaxRate(double taxRate) {
	this.taxRate = taxRate;
}


//methods
public void taxAssignment(double income){

//will I make different tax rates for income levels? Probably account for single and married?

    if(income > 0 &&  income < 10000){
        taxRate = .10;
    }else if (income > 10000 &&  income < 38000){
        taxRate = .12;
    } else if(income > 38000 &&  income < 82000){
        taxRate = .22;
    } else{
        taxRate = .30;
    }

  }

//war, new tech, paying dem bois
public void militarySpendingAmount(double income){



}

}g
class Government{
//initialized variables
private double taxRate;
private int militarySpending;
private int educationSpending;
private int healthCareSpending;
private int socialSecuritySpending;
private double federalReserve;
private int miscellaneousSpending;


//constructer
public Government(double taxRate, int militarySpending, int educationSpending, int healthCareSpending, int socialSecuritySpending, int miscellaneousSpending){
this.taxRate = taxRate;
this.setMilitarySpending(militarySpending);
this.setEducationSpending(educationSpending);
this.setHealthCareSpending(healthCareSpending);
this.setSocialSecuritySpending(socialSecuritySpending);
this.setMiscellaneousSpending(miscellaneousSpending);
setFederalReserve(169000000);
}



//getters and setters

public int getMiscellaneousSpending() {
	return miscellaneousSpending;
}

public void setMiscellaneousSpending(int miscellaneousSpending) {
	this.miscellaneousSpending = miscellaneousSpending;
}

public double getFederalReserve() {
	return federalReserve;
}

public void setFederalReserve(double federalReserve) {
	this.federalReserve = federalReserve;
}

public int getSocialSecuritySpending() {
	return socialSecuritySpending;
}

public void setSocialSecuritySpending(int socialSecuritySpending) {
	this.socialSecuritySpending = socialSecuritySpending;
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
// cycles money to federal federalReserve
//Idk how taxes actually work btw

    if(income > 0 &&  income < 10000){
        taxRate = .10;
        federalReserve += income*.1;

    }else if (income > 10000 &&  income < 38000){
        taxRate = .12;
        federalReserve += income*.12;

    } else if(income > 38000 &&  income < 82000){
        taxRate = .22;
        federalReserve += income*.22;

    } else{
        taxRate = .30;
        federalReserve += income*.3;
    }

  }



}

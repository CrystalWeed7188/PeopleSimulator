class Government{
//initialized variables
private double taxRate;
private double federalReserve;


//constructer
public Government(double taxRate ){
this.taxRate = taxRate;
setFederalReserve(169000000);
}


//getters and setters

public double getFederalReserve() {
	return federalReserve;
}

public void setFederalReserve(double federalReserve) {
	this.federalReserve = federalReserve;
}

public double getTaxRate() {
	return taxRate;
}

public void setTaxRate(double taxRate) {
	this.taxRate = taxRate;
}


//methods
public double taxAssignment(double income){
double taxRateMultiplier;

    // cycles money to federal federalReserve
    //Idk how taxes actually work btw so its a progressive tax
    //this takes a users income and applies a tax to it returning the taxed income

    if(income > 0 &&  income < 10000){
        taxRateMultiplier = taxRate + .005;
        federalReserve += income*taxRateMultiplier;
        return income*taxRateMultiplier;

    }else if (income > 10000 &&  income < 38000){
        taxRateMultiplier = taxRate + .01;
        federalReserve += income*taxRateMultiplier;
        return income*taxRateMultiplier;

    } else if(income > 38000 &&  income < 82000){
         taxRateMultiplier = taxRate + .015;
        federalReserve += income*taxRateMultiplier;
        return income*taxRateMultiplier;

    } else{
        taxRateMultiplier = taxRate + .02;
        federalReserve += income*taxRateMultiplier;
        return income*taxRateMultiplier;

     }


}

//this parenthesis it to the class I just keep forgetting
}
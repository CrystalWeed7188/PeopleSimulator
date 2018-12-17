class Government{
//instance variables and make one for laws when ready
private double  taxRate;
//rename gov type variable
private GovType govEnforcement;



//constructer
public Government(double taxRate){

}


//getters and setters

/**
 * @return the govEnforcement
 */
public GovType getGovEnforcement() {
	return govEnforcement;
}



/**
 * @param govEnforcement the govEnforcement to set
 */
public void setGovEnforcement(GovType govEnforcement) {
	this.govEnforcement = govEnforcement;
}



/**
 * @return the taxRate
 */
public double getTaxRate() {
	return taxRate;
}



/**
 * @param taxRate the taxRate to set
 */
public void setTaxRate(double taxRate) {
	this.taxRate = taxRate;
}


//somewhere put a political party Class

}